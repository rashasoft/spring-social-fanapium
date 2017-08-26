package org.springframework.social.fanapium.connect;

import org.springframework.social.fanapium.api.Fanapium;
import org.springframework.social.fanapium.api.impl.FanapiumTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

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

    @Override
    public Fanapium getApi(String accessToken) {
        return new FanapiumTemplate(clientId, clientSecret, accessToken);
    }

}
