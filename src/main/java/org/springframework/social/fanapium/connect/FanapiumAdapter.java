package org.springframework.social.fanapium.connect;

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.fanapium.api.Fanapium;
import org.springframework.social.fanapium.api.model.CustomerProfile;


public class FanapiumAdapter implements ApiAdapter<Fanapium> {

    public boolean test(Fanapium fanapium) {
        try {
            fanapium.userOperations().getUserProfile();
            return true;
        } catch (ApiException e) {
            return false;
        }
    }

    public void setConnectionValues(Fanapium fanapium, ConnectionValues values) {

        CustomerProfile customerProfile = fanapium.userOperations().getUserProfile();
        System.out.println(values.toString());
        System.out.println(fanapium.isAuthorized());
        values.setDisplayName(customerProfile.getName());
        values.setProviderUserId(customerProfile.getUserId().toString());
    }

    public UserProfile fetchUserProfile(Fanapium fanapium) {
        CustomerProfile userInfo = fanapium.userOperations().getUserProfile();
        return new UserProfileBuilder()
                .setId(userInfo.getUserId().toString())
                .setFirstName(userInfo.getFirstName())
                .setLastName(userInfo.getLastName())
                .setName(userInfo.getName())
                .setEmail(userInfo.getEmail())
                .setUsername(userInfo.getCellphoneNumber())
                .build();
    }

    public void updateStatus(Fanapium api, String message) {
        // FIXME: Do we have status?
    }
}
