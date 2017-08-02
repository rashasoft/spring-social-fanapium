package org.springframework.social.fanapium.api.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.social.fanapium.api.Fanapium;
import org.springframework.social.fanapium.api.FanapiumErrorHandler;
import org.springframework.social.fanapium.api.UserOperations;
import org.springframework.social.fanapium.api.WalletOperations;
import org.springframework.social.fanapium.api.impl.json.FanapiumModule;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.oauth2.OAuth2Version;
import org.springframework.social.support.ClientHttpRequestFactorySelector;
import org.springframework.web.client.RestTemplate;

public class FanapiumTemplate extends AbstractOAuth2ApiBinding implements Fanapium {

    private String accessToken;

    private UserOperations userOperations;
    private WalletOperations walletOperations;

    private ObjectMapper objectMapper;

    public FanapiumTemplate(String accessToken) {
        super(accessToken);
        wrapRequestFactory();
        initSubApis();
    }

    public UserOperations userOperations() {
        return userOperations;
    }

    public WalletOperations walletOperations() {
        return walletOperations;
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
        userOperations = new UserTemplate(getRestTemplate());
        walletOperations = new WalletTemplate(getRestTemplate());
    }

}
