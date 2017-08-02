package org.springframework.social.fanapium.connect;

import org.springframework.social.fanapium.api.Fanapium;
import org.springframework.social.fanapium.api.impl.FanapiumTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

public final class FanapiumServiceProvider extends AbstractOAuth2ServiceProvider<Fanapium> {

    private final String clientId;
    private final String clientSecret;

    public FanapiumServiceProvider(final String clientId, final String clientSecret) {
        super(new FanapiumOAuth2Template(clientId, clientSecret));
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    @Override
    public Fanapium getApi(String accessToken) {
        return new FanapiumTemplate(accessToken);
    }

}
