package org.springframework.social.fanapium.api;

import org.springframework.social.fanapium.api.model.AbstractResponseDTO;
import org.springframework.social.fanapium.api.model.CustomPost;
import org.springframework.social.fanapium.api.model.TimelineItem;
import org.springframework.social.fanapium.api.model.UserPostInfo;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/6/17.
 */
public interface PostOperations {

    AbstractResponseDTO<TimelineItem> timeline(String timelineId, String entityId, String query, String firstId, String lastId, String offset, String size, String type, String guildCodes, String metadata, String businessIs);

    AbstractResponseDTO<UserPostInfo> getUserPostInfos(String postId);

    AbstractResponseDTO<CustomPost> addCustomPost(String name, String content, String[] categories, String canComment, String canLike, String enable, String metadata, String tags);

}
