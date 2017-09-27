package org.springframework.social.fanapium.config.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.social.SocialWebAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseFactory;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.jdbc.JdbcUsersConnectionRepository;
import org.springframework.social.connect.web.GenericConnectionStatusView;
import org.springframework.social.fanapium.api.Fanapium;
import org.springframework.social.fanapium.connect.FanapiumConnectionFactory;

import javax.sql.DataSource;

@Configuration
@ConditionalOnClass({SocialConfigurerAdapter.class, FanapiumConnectionFactory.class})
@ConditionalOnProperty(prefix = "spring.social.fanapium", name = "client-id")
@AutoConfigureBefore(SocialWebAutoConfiguration.class)
@AutoConfigureAfter(WebMvcAutoConfiguration.class)
public class FanapiumAutoConfiguration {

    @Bean(destroyMethod = "shutdown")
    public DataSource dataSource() {
        EmbeddedDatabaseFactory factory = new EmbeddedDatabaseFactory();
        factory.setDatabaseName("spring-social-quickstart");
        factory.setDatabaseType(EmbeddedDatabaseType.H2);
        factory.setDatabasePopulator(databasePopulator());
        return factory.getDatabase();
    }

    // internal helpers

    private DatabasePopulator databasePopulator() {
        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        populator.addScript(new ClassPathResource("JdbcUsersConnectionRepository.sql", JdbcUsersConnectionRepository.class));
        return populator;
    }

    @Configuration
    @EnableSocial
    @EnableConfigurationProperties(FanapiumProperties.class)
    @ConditionalOnWebApplication
    protected static class FanapiumConfigurerAdapter extends SocialConfigurerAdapter {
        @Autowired
        FanapiumProperties properties;

        @Autowired
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
            final FanapiumConnectionFactory factory = new FanapiumConnectionFactory(
                    properties.getClientId(),
                    properties.getClientSecret(),
                    ""
            );

            factory.setScope("email profile");
            configurer.addConnectionFactory(factory);
        }

    }
}