package org.springframework.social.fanapium.api.impl;

import org.springframework.social.fanapium.api.ChatOperations;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/6/17.
 */
public class ChatTemplate extends AbstractFanapiumOperations implements ChatOperations {

    public ChatTemplate(FanapiumTemplate fanapium, boolean isAuthorized) {
        super(fanapium, isAuthorized);
    }

    @Override
    public String setChatId(String id) {
        return null;
    }

    @Override
    public String removeChatIds(String[] ids) {
        return null;
    }

    @Override
    public String chatRequest(String uniuqeId, String title, String[] userIds, String type) {
        return null;
    }
}
