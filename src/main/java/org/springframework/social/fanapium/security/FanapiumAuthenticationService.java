package org.springframework.social.fanapium.security;

import org.springframework.social.fanapium.api.Fanapium;
import org.springframework.social.fanapium.connect.FanapiumConnectionFactory;
import org.springframework.social.security.provider.OAuth2AuthenticationService;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/24/17.
 */
public class FanapiumAuthenticationService extends OAuth2AuthenticationService<Fanapium> {

    public FanapiumAuthenticationService(String clientId, String clientSecret) {
        super(new FanapiumConnectionFactory(clientId, clientSecret, null));
    }
}
