package org.springframework.social.fanapium.config.user;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletResponse;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/20/17.
 */
public class SimpleSignInAdapter implements SignInAdapter {


    private final UserCookieGenerator userCookieGenerator = new UserCookieGenerator();

    public String signIn(String userId, Connection<?> connection, NativeWebRequest request) {
        SecurityContext.setCurrentUser(new User(userId));
        userCookieGenerator.addCookie(userId, request.getNativeResponse(HttpServletResponse.class));
        return null;
    }
}
