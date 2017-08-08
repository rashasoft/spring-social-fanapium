package org.springframework.social.fanapium.api.impl;

import org.springframework.social.fanapium.api.UserOperations;
import org.springframework.social.fanapium.api.model.AbstractResponseDTO;
import org.springframework.social.fanapium.api.model.CustomerProfile;
import org.springframework.web.client.RestTemplate;

public class UserTemplate implements UserOperations {

    private static String USER_INFO_URL = "nzh/getUserProfile";

    private final RestTemplate restTemplate;

    public UserTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public AbstractResponseDTO<CustomerProfile> getUserProfile() {
        return null;
    }
}
