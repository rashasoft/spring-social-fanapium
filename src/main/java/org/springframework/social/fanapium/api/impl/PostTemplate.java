package org.springframework.social.fanapium.api.impl;

import org.springframework.social.fanapium.api.PostOperations;
import org.springframework.social.fanapium.api.model.AbstractResponseDTO;
import org.springframework.social.fanapium.api.model.CustomPost;
import org.springframework.social.fanapium.api.model.TimelineItem;
import org.springframework.social.fanapium.api.model.UserPostInfo;
import org.springframework.social.fanapium.api.model.requestDTO.CustomPostRequestDTO;
import org.springframework.social.fanapium.api.model.requestDTO.TimeLineRequestDTO;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/6/17.
 */
public class PostTemplate extends AbstractFanapiumOperations implements PostOperations {

    private static String TIMELINE_URL = "nzh/biz/timeline";
    private static String GET_USER_POST_INFOS_URL = "nzh/getUserPostInfos";
    private static String ADD_CUSTOM_POST_URL = "nzh/addCustomPost";

    public PostTemplate(FanapiumTemplate fanapium, boolean isAuthorized) {
        super(fanapium, isAuthorized);
    }

    @Override
    public AbstractResponseDTO<TimelineItem> timeline(TimeLineRequestDTO timeLineRequestDTO) {
        requireUserAuthorization();
        return get(buildUri(TIMELINE_URL, timeLineRequestDTO.getMap()), AbstractResponseDTO.class);
    }

    @Override
    public AbstractResponseDTO<UserPostInfo> getUserPostInfos(String postId) {
        requireUserAuthorization();
        Map<String, String> params = new HashMap<>();
        params.put("postId", postId);
        return get(buildUri(GET_USER_POST_INFOS_URL, params), AbstractResponseDTO.class);
    }

    @Override
    public AbstractResponseDTO<CustomPost> addCustomPost(@Valid CustomPostRequestDTO customPostRequestDTO) {

        return get(buildUri(ADD_CUSTOM_POST_URL, customPostRequestDTO.getMap()), AbstractResponseDTO.class);
    }
}
