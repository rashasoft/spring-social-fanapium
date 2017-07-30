package org.springframework.social.fanapium.connect;

import org.springframework.social.oauth2.OAuth2Template;

public class FanapiumOAuth2Template extends OAuth2Template {
    public FanapiumOAuth2Template(final String clientId, final String clientSecret) {
        super(
                clientId,
                clientSecret,
                "http://sandbox.fanapium.com/oauth2/authorize/",
                "http://sandbox.fanapium.com/oauth2/token"
        );
        this.setUseParametersForClientAuthentication(true);
    }
}
