package org.springframework.social.fanapium.api.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.social.fanapium.api.UserOperations;
import org.springframework.social.fanapium.api.model.AbstractResponseDTO;
import org.springframework.social.fanapium.api.model.CustomerProfile;

public class UserTemplate extends AbstractFanapiumOperations implements UserOperations {

    private static String USER_INFO_URL = "nzh/getUserProfile";

    private final ObjectMapper objectMapper;

    public UserTemplate(FanapiumTemplate fanapium, boolean isAuthorized, ObjectMapper mapper) {
        super(fanapium, isAuthorized, mapper);
        this.objectMapper = mapper;
    }


    @Override
    public CustomerProfile getUserProfile() {
        requireUserAuthorization();
        Object hashMap = fanapium.getRestTemplate().getForObject(buildUri(USER_INFO_URL), AbstractResponseDTO.class).getResult();
        CustomerProfile customerProfile = map(hashMap, CustomerProfile.class);
        return customerProfile;
    }
}
