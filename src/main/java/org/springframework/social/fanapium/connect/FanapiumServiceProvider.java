package org.springframework.social.fanapium.connect;

import org.springframework.social.fanapium.api.Fanapium;
import org.springframework.social.fanapium.api.impl.FanapiumTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Template;

public final class FanapiumServiceProvider extends AbstractOAuth2ServiceProvider<Fanapium> {

    private final String clientId;
    private final String clientSecret;
    private final String accessToken;

    public FanapiumServiceProvider(final String clientId, final String clientSecret, final String accessToken) {
        super(new FanapiumOAuth2Template(clientId, clientSecret));
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.accessToken = accessToken;
    }


    private static OAuth2Template getOAuth2Template(String clientId, String clientSecret) {
        OAuth2Template oAuth2Template = new OAuth2Template(clientId,
                clientSecret,
                "https://sandbox.fanapium.com/oauth2/authorize/",
                "https://sandbox.fanapium.com/oauth2/clients/token");
        oAuth2Template.setUseParametersForClientAuthentication(true);
        return oAuth2Template;
    }
    @Override
    public Fanapium getApi(String accessToken) {
        return new FanapiumTemplate(clientId, clientSecret, accessToken);
    }

}
