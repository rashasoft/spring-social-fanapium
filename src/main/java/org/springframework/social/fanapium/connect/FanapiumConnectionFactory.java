package org.springframework.social.fanapium.connect;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.fanapium.api.Fanapium;
import org.springframework.stereotype.Component;

@Component
public class FanapiumConnectionFactory extends OAuth2ConnectionFactory<Fanapium> {

    public FanapiumConnectionFactory(String clientId, String clientSecret, String accessToken) {

        super("fanapium", new FanapiumServiceProvider(clientId, clientSecret, accessToken), new FanapiumAdapter());
    }
}
