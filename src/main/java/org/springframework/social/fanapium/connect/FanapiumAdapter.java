package org.springframework.social.fanapium.connect;

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.fanapium.api.Fanapium;
import org.springframework.social.fanapium.api.impl.UserInfo;
import org.springframework.social.connect.UserProfileBuilder;


public class FanapiumAdapter implements ApiAdapter<Fanapium> {
    public boolean test(Fanapium fanapium) {
        try {
            fanapium.userOperations().getUserInfo();
            return true;
        } catch (ApiException e) {
            return false;
        }
    }

    public void setConnectionValues(Fanapium fanapium, ConnectionValues values) {
        UserInfo userInfo = fanapium.userOperations().getUserInfo();
        values.setDisplayName(userInfo.getGivenName());
        values.setProviderUserId(userInfo.getId().toString());
        values.setImageUrl(userInfo.getPicture()); // FIXME
        values.setProfileUrl("" + userInfo.getRefCode()); // FIXME
    }

    public UserProfile fetchUserProfile(Fanapium fanapium) {
        UserInfo userInfo = fanapium.userOperations().getUserInfo();

        return new UserProfileBuilder()
                .setId(userInfo.getId().toString())
                .setFirstName(userInfo.getGivenName())
                .setLastName(userInfo.getFamilyName())
                .setName(userInfo.getGivenName() + " " + userInfo.getFamilyName())
                .setEmail(userInfo.getEmail())
                .setUsername(userInfo.getPreferredUsername())
                .build();
    }

    public void updateStatus(Fanapium api, String message) {
        // FIXME: Do we have status?
    }
}
