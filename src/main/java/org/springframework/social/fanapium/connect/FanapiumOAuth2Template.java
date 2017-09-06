package org.springframework.social.fanapium.connect;

import org.springframework.social.oauth2.OAuth2Parameters;
import org.springframework.social.oauth2.OAuth2Template;

public class FanapiumOAuth2Template extends OAuth2Template {

    private String clientId;
    private String clientSecret;

    public FanapiumOAuth2Template(final String clientId, final String clientSecret) {
        super(
                clientId,
                clientSecret,
                "https://sandbox.fanapium.com/oauth2/authorize/",
                "https://sandbox.fanapium.com/oauth2/token"
        );
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.setUseParametersForClientAuthentication(true);
    }

    @Override
    public String buildAuthenticateUrl(OAuth2Parameters parameters) {
        parameters.setScope("email phone");
        return super.buildAuthenticateUrl(parameters);
    }
}
