package org.springframework.social.fanapium.api.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.social.fanapium.api.*;
import org.springframework.social.fanapium.api.impl.json.FanapiumModule;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.oauth2.OAuth2Version;
import org.springframework.social.support.ClientHttpRequestFactorySelector;
import org.springframework.social.support.HttpRequestDecorator;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.util.List;

public class FanapiumTemplate extends AbstractOAuth2ApiBinding implements Fanapium {

    private String accessToken;
    private String clientId;
    private String clientSecret;


    private ChatOperations chatOperations;
    private PostOperations postOperations;
    private UserOperations userOperations;

    private ObjectMapper objectMapper;

    public FanapiumTemplate(String clientId, String clientSecret, String accessToken) {
        super(accessToken);
        registerOAuth2Interceptor(accessToken);
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.accessToken = accessToken;
        wrapRequestFactory();
        initialize();
    }

    public static void main(String[] args) {
        FanapiumTemplate fanapiumTemplate = new FanapiumTemplate("a5174580a4dc8e0f1847ac97", "0c21bcee", null);
        fanapiumTemplate.postOperations().getUserPostInfos("12");
        System.out.println("hey");
    }

    public ChatOperations chatOperations() {
        return chatOperations;
    }

    public PostOperations postOperations() {
        return postOperations;
    }

    @Override
    public UserOperations userOperations() {
        return userOperations;
    }

    private void wrapRequestFactory() {
        super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(getRestTemplate().getRequestFactory()));
    }

    @Override
    public void setRequestFactory(ClientHttpRequestFactory requestFactory) {
        // Wrap the request factory with a BufferingClientHttpRequestFactory so that the error handler can do repeat reads on the response.getBody()
        super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(requestFactory));
    }

    // AbstractOAuth2ApiBinding hooks
    @Override
    protected OAuth2Version getOAuth2Version() {
        return OAuth2Version.DRAFT_10;
    }

    @Override
    protected MappingJackson2HttpMessageConverter getJsonMessageConverter() {
        MappingJackson2HttpMessageConverter converter = super.getJsonMessageConverter();
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new FanapiumModule());
        converter.setObjectMapper(objectMapper);
        return converter;
    }

    @Override
    protected void configureRestTemplate(RestTemplate restTemplate) {
        restTemplate.setErrorHandler(new FanapiumErrorHandler());
    }

    // private helpers
    private void initialize() {
        // Wrap the request factory with a BufferingClientHttpRequestFactory so that the error handler can do repeat reads on the response.getBody()
        super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(getRestTemplate().getRequestFactory()));
        initSubApis();
    }

    private void initSubApis() {
        postOperations = new PostTemplate(this, isAuthorized());
        chatOperations = new ChatTemplate(this, isAuthorized());
        userOperations = new UserTemplate(this, isAuthorized());
    }

    private void registerOAuth2Interceptor(String accessToken) {
        List<ClientHttpRequestInterceptor> interceptors = getRestTemplate().getInterceptors();
        interceptors.add(new OAuth2TokenParameterRequestInterceptor(accessToken));
        getRestTemplate().setInterceptors(interceptors);
    }

    private static final class OAuth2TokenParameterRequestInterceptor implements ClientHttpRequestInterceptor {
        private final String accessToken;

        public OAuth2TokenParameterRequestInterceptor(String accessToken) {
            this.accessToken = accessToken;
        }

        public ClientHttpResponse intercept(final HttpRequest request, final byte[] body, ClientHttpRequestExecution execution) throws IOException {
            HttpRequest protectedResourceRequest = new HttpRequestDecorator(request) {
                @Override
                public URI getURI() {
                    return super.getURI();
                }
            };

            // LinkedIn doesn't accept the OAuth2 Bearer token authorization header.
            protectedResourceRequest.getHeaders().remove("Authorization");
            protectedResourceRequest.getHeaders().add("_token_", accessToken);
            protectedResourceRequest.getHeaders().add("_token_issuer_", "1");
            return execution.execute(protectedResourceRequest, body);
        }

    }


}
