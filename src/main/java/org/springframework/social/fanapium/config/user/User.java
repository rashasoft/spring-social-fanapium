package org.springframework.social.fanapium.config.user;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/20/17.
 */
public final class User {

    private final String id;

    public User(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
