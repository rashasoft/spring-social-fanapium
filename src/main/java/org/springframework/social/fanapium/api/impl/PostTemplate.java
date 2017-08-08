package org.springframework.social.fanapium.api.impl;

import org.springframework.social.fanapium.api.PostOperations;
import org.springframework.social.fanapium.api.model.AbstractResponseDTO;
import org.springframework.social.fanapium.api.model.CustomPost;
import org.springframework.social.fanapium.api.model.TimelineItem;
import org.springframework.social.fanapium.api.model.UserPostInfo;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/6/17.
 */
public class PostTemplate extends AbstractFanapiumOperations implements PostOperations {

    public PostTemplate(FanapiumTemplate fanapium, boolean isAuthorized) {
        super(fanapium, isAuthorized);
    }

    @Override
    public AbstractResponseDTO<TimelineItem> timeline(String timelineId, String entityId, String query, String firstId, String lastId, String offset, String size, String type, String guildCodes, String metadata, String businessIs) {
        return null;
    }

    @Override
    public AbstractResponseDTO<UserPostInfo> getUserPostInfos(String postId) {
        return null;
    }

    @Override
    public AbstractResponseDTO<CustomPost> addCustomPost(String name, String content, String[] categories, String canComment, String canLike, String enable, String metadata, String tags) {
        return null;
    }
}
