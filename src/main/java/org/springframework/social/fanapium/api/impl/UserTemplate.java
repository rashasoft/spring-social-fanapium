package org.springframework.social.fanapium.api.impl;

import org.springframework.social.fanapium.api.UserOperations;
import org.springframework.social.fanapium.api.model.AbstractResponseDTO;
import org.springframework.social.fanapium.api.model.CustomerProfile;

public class UserTemplate extends AbstractFanapiumOperations implements UserOperations {

    private static String USER_INFO_URL = "nzh/getUserProfile";

    public UserTemplate(FanapiumTemplate fanapium, boolean isAuthorized) {
        super(fanapium, isAuthorized);
    }


    @Override
    public AbstractResponseDTO<CustomerProfile> getUserProfile() {
        requireUserAuthorization();
        return get(buildUri(USER_INFO_URL, null), AbstractResponseDTO.class);

    }
}
