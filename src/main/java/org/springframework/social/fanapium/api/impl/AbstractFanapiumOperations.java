package org.springframework.social.fanapium.api.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.support.URIBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.Map;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/1/17.
 */
public abstract class AbstractFanapiumOperations {

    private static final String API_URL_BASE = "http://sandbox.fanapium.com:8081/";
    protected final FanapiumTemplate fanapium;
    private final boolean isAuthorized;
    private final ObjectMapper objectMapper;

    public AbstractFanapiumOperations(FanapiumTemplate fanapium, boolean isAuthorized, ObjectMapper objectMapper) {
        this.fanapium = fanapium;
        this.isAuthorized = isAuthorized;
        this.objectMapper = objectMapper;
    }

    protected <T> T get(URI uri, Class<T> responseType) {
        return fanapium.getRestTemplate().getForObject(uri, responseType);
    }

    protected <C> C post(URI uri, MultiValueMap<String, Object> data, Class<C> responseType) {
        MultiValueMap<String, Object> requestData = new LinkedMultiValueMap<String, Object>(data);
        return fanapium.getRestTemplate().postForObject(uri, requestData, responseType);
    }

    protected void delete(URI uri) {
        fanapium.getRestTemplate().delete(uri);
    }

    protected void requireUserAuthorization() {
        if (!isAuthorized) {
            throw new MissingAuthorizationException("");
        }
    }

    protected URI buildUri(String path) {
        return buildUri(path, Collections.<String, String>emptyMap());
    }

    protected URI buildUri(String path, Map<String, String> params) {
        URIBuilder uriBuilder = URIBuilder.fromUri(API_URL_BASE + path);
        if (params != null) {
            for (String paramName : params.keySet()) {
                uriBuilder.queryParam(paramName, String.valueOf(params.get(paramName)));
            }
        }
        URI uri = uriBuilder.build();
        return uri;
    }

    protected <T> T map(Object json, Class<T> type) {
        String jsonString = new JSONObject((Map) json).toString();
        Object result = null;
        try {
            result = objectMapper.readValue(jsonString, type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (T) result;
    }
}
