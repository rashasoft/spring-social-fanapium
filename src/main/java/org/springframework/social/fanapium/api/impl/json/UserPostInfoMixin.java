package org.springframework.social.fanapium.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/7/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserPostInfoMixin {

    @JsonProperty("postId")
    private Long postId;

    @JsonProperty("liked")
    private Boolean liked;

    @JsonProperty("favorite")
    private Boolean favorite;
}
