package org.springframework.social.fanapium.config.user;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/20/17.
 */
public class SimpleConnectionSignUp implements ConnectionSignUp {
    private final AtomicLong userIdSequence = new AtomicLong();

    public String execute(Connection<?> connection) {
        return Long.toString(userIdSequence.incrementAndGet());
    }
}

