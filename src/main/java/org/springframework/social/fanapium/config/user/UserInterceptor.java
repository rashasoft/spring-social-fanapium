package org.springframework.social.fanapium.config.user;

import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.fanapium.api.Fanapium;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/20/17.
 */
public class UserInterceptor extends HandlerInterceptorAdapter {

    private final UsersConnectionRepository connectionRepository;

    private final UserCookieGenerator userCookieGenerator = new UserCookieGenerator();

    public UserInterceptor(UsersConnectionRepository connectionRepository) {
        this.connectionRepository = connectionRepository;
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        rememberUser(request, response);
        handleSignOut(request, response);
        if (SecurityContext.userSignedIn() || requestForSignIn(request)) {
            return true;
        } else {
            return requireSignIn(request, response);
        }
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        SecurityContext.remove();
    }

    // internal helpers

    private void rememberUser(HttpServletRequest request, HttpServletResponse response) {
        String userId = userCookieGenerator.readCookieValue(request);
        if (userId == null) {
            return;
        }
        if (!userNotFound(userId)) {
            userCookieGenerator.removeCookie(response);
            return;
        }
        SecurityContext.setCurrentUser(new User(userId));
    }

    private void handleSignOut(HttpServletRequest request, HttpServletResponse response) {
        if (SecurityContext.userSignedIn() && request.getServletPath().startsWith("/signout")) {
            connectionRepository.createConnectionRepository(SecurityContext.getCurrentUser().getId()).removeConnections("facebook");
            userCookieGenerator.removeCookie(response);
            SecurityContext.remove();
        }
    }

    private boolean requestForSignIn(HttpServletRequest request) {
        return request.getServletPath().startsWith("/signin");
    }

    private boolean requireSignIn(HttpServletRequest request, HttpServletResponse response) throws Exception {
        new RedirectView("/signin", true).render(null, request, response);
        return false;
    }

    private boolean userNotFound(String userId) {
        // doesn't bother checking a local user database: simply checks if the userId is connected to Facebook
        return connectionRepository.createConnectionRepository(userId).findPrimaryConnection(Fanapium.class) != null;
    }
}