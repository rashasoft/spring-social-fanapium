package org.springframework.social.fanapium.config.support;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.social.UserIdSource;
import org.springframework.social.config.xml.ApiHelper;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.fanapium.api.Fanapium;

public class FanapiumApiHelper implements ApiHelper<Fanapium> {
    private static final Log logger = LogFactory.getLog(FanapiumApiHelper.class);

    private final UsersConnectionRepository usersConnectionRepository;
    private final UserIdSource userIdSource;

    public FanapiumApiHelper(
            final UsersConnectionRepository usersConnectionRepository,
            final UserIdSource userIdSource) {

        this.usersConnectionRepository = usersConnectionRepository;
        this.userIdSource = userIdSource;
    }


    public Fanapium getApi() {
        if (logger.isDebugEnabled()) {
            logger.debug("Fanapium API binding instance for Fanapium provider");
        }

        final Connection<Fanapium> connection = usersConnectionRepository
                .createConnectionRepository(userIdSource.getUserId())
                .findPrimaryConnection(Fanapium.class);

        if (logger.isDebugEnabled() && connection == null) {
            logger.debug("No current connection; Returning default FanapiumTemplate instance.");
        }
        return connection != null ? connection.getApi() : null;
    }
}
