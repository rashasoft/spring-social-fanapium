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
            fanapium.postOperations().getUserPostInfos("612");
            return true;
        } catch (ApiException e) {
            return false;
        }
    }

    public void setConnectionValues(Fanapium fanapium, ConnectionValues values) {
        CustomerProfile customerProfile = fanapium.userOperations().getUserProfile().getResult();
        values.setDisplayName("mohammad");
        values.setProviderUserId("313");
    }

    public UserProfile fetchUserProfile(Fanapium fanapium) {
        CustomerProfile userInfo = null;

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
