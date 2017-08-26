package org.springframework.social.fanapium.api;

import org.springframework.social.fanapium.api.model.AbstractResponseDTO;
import org.springframework.social.fanapium.api.model.CustomerProfile;

public interface UserOperations {

    AbstractResponseDTO<CustomerProfile> getUserProfile();

}
