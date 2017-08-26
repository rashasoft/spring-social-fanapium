package org.springframework.social.fanapium.config.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseFactory;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.social.connect.jdbc.JdbcUsersConnectionRepository;

import javax.sql.DataSource;

@Configuration
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

    /*protected static class FanapiumConfigurerAdapter extends SocialConfigurerAdapter {
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

    }*/
}
