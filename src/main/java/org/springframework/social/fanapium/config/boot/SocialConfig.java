package org.springframework.social.fanapium.config.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.social.UserIdSource;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurer;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.jdbc.JdbcUsersConnectionRepository;
import org.springframework.social.connect.web.ProviderSignInController;
import org.springframework.social.fanapium.api.Fanapium;
import org.springframework.social.fanapium.config.user.SecurityContext;
import org.springframework.social.fanapium.config.user.SimpleConnectionSignUp;
import org.springframework.social.fanapium.config.user.SimpleSignInAdapter;
import org.springframework.social.fanapium.connect.FanapiumConnectionFactory;

import javax.inject.Inject;
import javax.sql.DataSource;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/20/17.
 */

@Configuration
@EnableSocial
public class SocialConfig implements SocialConfigurer {

    @Inject
    private DataSource dataSource;

    @Override
    public void addConnectionFactories(ConnectionFactoryConfigurer connectionFactoryConfigurer, Environment environment) {
        connectionFactoryConfigurer.addConnectionFactory(new FanapiumConnectionFactory(environment.getProperty("spring.social.fanapium.clientId"), environment.getProperty("spring.social.fanapium.clientSecret"), null));
    }

    @Override
    public UserIdSource getUserIdSource() {
        return new UserIdSource() {
            @Override
            public String getUserId() {
                return SecurityContext.getCurrentUser().getId();
            }
        };
    }

    @Override
    public UsersConnectionRepository getUsersConnectionRepository(ConnectionFactoryLocator connectionFactoryLocator) {
        JdbcUsersConnectionRepository repository = new JdbcUsersConnectionRepository(dataSource, connectionFactoryLocator, Encryptors.noOpText());
        repository.setConnectionSignUp(new SimpleConnectionSignUp());
        return repository;
    }

    @Bean
    @Scope(value = "request", proxyMode = ScopedProxyMode.INTERFACES)
    public Fanapium fanapium(ConnectionRepository repository) {
        Connection<Fanapium> connection = repository.findPrimaryConnection(Fanapium.class);
        return connection != null ? connection.getApi() : null;
    }

    @Bean
    public ProviderSignInController providerSignInController(ConnectionFactoryLocator connectionFactoryLocator, UsersConnectionRepository usersConnectionRepository) {
        return new ProviderSignInController(connectionFactoryLocator, usersConnectionRepository, new SimpleSignInAdapter());
    }
}
