package org.springframework.social.fanapium.config.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.social.SocialWebAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.env.Environment;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.web.GenericConnectionStatusView;
import org.springframework.social.fanapium.api.Fanapium;
import org.springframework.social.fanapium.connect.FanapiumConnectionFactory;

import javax.inject.Inject;
import javax.sql.DataSource;

@Configuration
@ConditionalOnClass({SocialConfigurerAdapter.class, FanapiumConnectionFactory.class})
@ConditionalOnProperty(prefix = "spring.social.fanapium", name = "client-id")
@AutoConfigureBefore(SocialWebAutoConfiguration.class)
@AutoConfigureAfter(WebMvcAutoConfiguration.class)
@EnableSocial
public class FanapiumAutoConfiguration {


    protected static class FanapiumConfigurerAdapter extends SocialConfigurerAdapter {
        @Autowired
        FanapiumProperties properties;

        @Inject
        private DataSource dataSource;

        @Bean
        @ConditionalOnMissingBean
        @Scope(value = "request", proxyMode = ScopedProxyMode.INTERFACES)
        public Fanapium fanapium(final ConnectionRepository repository) {
            final Connection<Fanapium> connection = repository.findPrimaryConnection(Fanapium.class);
            return connection != null ? connection.getApi() : null;
        }

        @Bean(name = {"connect/fanapiumConnect", "connect/fanapiumConnected"})
        @ConditionalOnProperty(prefix = "spring.social", name = "auto-connection-views")
        public GenericConnectionStatusView fanapiumConnectView() {
            return new GenericConnectionStatusView("fanapium", "Fanapium");
        }


        @Override
        public void addConnectionFactories(final ConnectionFactoryConfigurer configurer, final Environment environment) {
            final FanapiumConnectionFactory factory =
                    new FanapiumConnectionFactory(properties.getClientId(), properties.getClientSecret(), "");

            factory.setScope("email profile");
            configurer.addConnectionFactory(factory);
        }

    }
}
