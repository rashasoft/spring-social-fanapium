package org.springframework.social.fanapium.api;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/6/17.
 */
public interface ChatOperations {

    String setChatId(String id);

    String removeChatIds(String[] ids);

    String chatRequest(String uniuqeId, String title, String[] userIds, String type);
}
