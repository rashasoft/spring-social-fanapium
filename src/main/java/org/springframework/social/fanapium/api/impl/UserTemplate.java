package org.springframework.social.fanapium.api.impl;

import org.springframework.social.fanapium.api.UserOperations;
import org.springframework.web.client.RestTemplate;

public class UserTemplate implements UserOperations {

    private static String USER_INFO_URL = "/users";

    private final RestTemplate restTemplate;

    public UserTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public UserInfo getUserInfo() {
        return restTemplate.getForObject(USER_INFO_URL, UserInfo.class);
    }
}
