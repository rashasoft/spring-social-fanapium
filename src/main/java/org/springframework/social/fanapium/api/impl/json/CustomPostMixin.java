package org.springframework.social.fanapium.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.social.fanapium.api.model.BusinessSoft;
import org.springframework.social.fanapium.api.model.UserPostInfo;

import java.util.List;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/7/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class CustomPostMixin {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("timelineId")
    private Long timelineId;

    @JsonProperty("entityId")
    private Long entityId;

    @JsonProperty("numOfLikes")
    private Integer numOfLikes;

    @JsonProperty("numOfFavorites")
    private Integer numOfFavorites;

    @JsonProperty("numOfComments")
    private Integer numOfComments;

    @JsonProperty("timestamp")
    private Long timestamp;

    @JsonProperty("enable")
    private Boolean enable;

    @JsonProperty("hide")
    private Boolean hide;

    @JsonProperty("business")
    private BusinessSoft business;

    @JsonProperty("userPostInfo")
    private UserPostInfo userPostInfo;

    @JsonProperty("metadata")
    private String metadata;

    @JsonProperty("latitude")
    private Double latitude;

    @JsonProperty("longitude")
    private Double longitude;

    @JsonProperty("canComment")
    private Boolean canComment;

    @JsonProperty("canLike")
    private Boolean canLike;

    @JsonProperty("tags")
    private List<String> tags;

    @JsonProperty("name")
    private String name;

    @JsonProperty("data")
    private String data;

    @JsonProperty("categoryList")
    private List<String> categoryList;

}
