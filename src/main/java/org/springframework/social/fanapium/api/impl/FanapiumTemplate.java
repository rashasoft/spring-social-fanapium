package org.springframework.social.fanapium.api.impl;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.social.fanapium.api.ChatOperations;
import org.springframework.social.fanapium.api.Fanapium;
import org.springframework.social.fanapium.api.FanapiumErrorHandler;
import org.springframework.social.fanapium.api.PostOperations;
import org.springframework.social.fanapium.api.impl.json.FanapiumModule;
import org.springframework.social.fanapium.api.model.AbstractResponseDTO;
import org.springframework.social.fanapium.api.model.CustomPost;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.oauth2.OAuth2Version;
import org.springframework.social.support.ClientHttpRequestFactorySelector;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class FanapiumTemplate extends AbstractOAuth2ApiBinding implements Fanapium {

    private String accessToken;
    private String clientId;
    private String clientSecret;


    private ChatOperations chatOperations;
    private PostOperations postOperations;

    private ObjectMapper objectMapper;

    public FanapiumTemplate(String accessToken) {
        super(accessToken);
        wrapRequestFactory();
        initialize();
    }

    public static void main(String[] args) {
        JsonFactory factory = new JsonFactory();
        String jp = null;
        jp = "{\"hasError\":false,\"errorCode\":0,\"count\":0,\"ott\":\"568a71a540ead368\",\"result\":{\"id\":612,\"timelineId\":548,\"entityId\":310,\"numOfLikes\":0,\"numOfFavorites\":0,\"numOfComments\":0,\"timestamp\":1502083216366,\"enable\":true,\"hide\":false,\"business\":{\"id\":163,\"imageInfo\":{\"id\":165,\"actualWidth\":720,\"actualHeight\":405,\"width\":720,\"height\":405},\"image\":\"http://templates24.org/web/uploads/defaults/profileImage.png\",\"numOfProducts\":0,\"rate\":{\"rate\":0.0,\"rateCount\":0}},\"userPostInfo\":{\"postId\":612,\"liked\":false,\"favorite\":false},\"latitude\":0.0,\"longitude\":0.0,\"canComment\":true,\"canLike\":true,\"tags\":[\"test\"],\"name\":\"test\",\"data\":\"test\",\"categoryList\":[]}}";
        final ObjectMapper objectMapper = new ObjectMapper();

        AbstractResponseDTO<CustomPost> result = null;
        JavaType typeRef = objectMapper.getTypeFactory().constructParametricType(AbstractResponseDTO.class, CustomPost.class);
        try {
            result = objectMapper.readValue(jp, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public ChatOperations chatOperations() {
        return chatOperations;
    }

    public PostOperations postOperations() {
        return postOperations;
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
    }


}
