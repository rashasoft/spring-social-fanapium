package org.springframework.social.fanapium.api;

import org.springframework.social.fanapium.api.model.AbstractResponseDTO;
import org.springframework.social.fanapium.api.model.CustomPost;
import org.springframework.social.fanapium.api.model.TimelineItem;
import org.springframework.social.fanapium.api.model.UserPostInfo;
import org.springframework.social.fanapium.api.model.requestDTO.CustomPostRequestDTO;
import org.springframework.social.fanapium.api.model.requestDTO.TimeLineRequestDTO;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/6/17.
 */
public interface PostOperations {

    AbstractResponseDTO<TimelineItem> timeline(TimeLineRequestDTO timeLineRequestDTO);

    AbstractResponseDTO<UserPostInfo> getUserPostInfos(String postId);

    AbstractResponseDTO<CustomPost> addCustomPost(CustomPostRequestDTO customPost);

}
