/*
 * Fanapium Core API
 * Fanapium B2B2C services
 *
 * OpenAPI spec version: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ItemSrv
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-02T09:35:11.370+04:30")
public class ItemSrv {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("timelineId")
    private Long timelineId = null;

    @JsonProperty("entityId")
    private Long entityId = null;

    @JsonProperty("numOfLikes")
    private Integer numOfLikes = null;

    @JsonProperty("numOfFavorites")
    private Integer numOfFavorites = null;

    @JsonProperty("numOfComments")
    private Integer numOfComments = null;

    @JsonProperty("timestamp")
    private Long timestamp = null;

    @JsonProperty("enable")
    private Boolean enable = null;

    @JsonProperty("hide")
    private Boolean hide = null;

    @JsonProperty("business")
    private BusinessSoftSrv business = null;

    @JsonProperty("userPostInfo")
    private UserPostInfoSrv userPostInfo = null;

    @JsonProperty("metadata")
    private String metadata = null;

    @JsonProperty("latitude")
    private Double latitude = null;

    @JsonProperty("longitude")
    private Double longitude = null;

    @JsonProperty("canComment")
    private Boolean canComment = null;

    @JsonProperty("canLike")
    private Boolean canLike = null;

    @JsonProperty("tags")
    private List<String> tags = null;

    public ItemSrv id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ItemSrv timelineId(Long timelineId) {
        this.timelineId = timelineId;
        return this;
    }

    /**
     * Get timelineId
     *
     * @return timelineId
     **/

    public Long getTimelineId() {
        return timelineId;
    }

    public void setTimelineId(Long timelineId) {
        this.timelineId = timelineId;
    }

    public ItemSrv entityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Get entityId
     *
     * @return entityId
     **/

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public ItemSrv numOfLikes(Integer numOfLikes) {
        this.numOfLikes = numOfLikes;
        return this;
    }

    /**
     * Get numOfLikes
     *
     * @return numOfLikes
     **/

    public Integer getNumOfLikes() {
        return numOfLikes;
    }

    public void setNumOfLikes(Integer numOfLikes) {
        this.numOfLikes = numOfLikes;
    }

    public ItemSrv numOfFavorites(Integer numOfFavorites) {
        this.numOfFavorites = numOfFavorites;
        return this;
    }

    /**
     * Get numOfFavorites
     *
     * @return numOfFavorites
     **/

    public Integer getNumOfFavorites() {
        return numOfFavorites;
    }

    public void setNumOfFavorites(Integer numOfFavorites) {
        this.numOfFavorites = numOfFavorites;
    }

    public ItemSrv numOfComments(Integer numOfComments) {
        this.numOfComments = numOfComments;
        return this;
    }

    /**
     * Get numOfComments
     *
     * @return numOfComments
     **/

    public Integer getNumOfComments() {
        return numOfComments;
    }

    public void setNumOfComments(Integer numOfComments) {
        this.numOfComments = numOfComments;
    }

    public ItemSrv timestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     **/

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ItemSrv enable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * Get enable
     *
     * @return enable
     **/

    public Boolean isEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public ItemSrv hide(Boolean hide) {
        this.hide = hide;
        return this;
    }

    /**
     * Get hide
     *
     * @return hide
     **/

    public Boolean isHide() {
        return hide;
    }

    public void setHide(Boolean hide) {
        this.hide = hide;
    }

    public ItemSrv business(BusinessSoftSrv business) {
        this.business = business;
        return this;
    }

    /**
     * Get business
     *
     * @return business
     **/

    public BusinessSoftSrv getBusiness() {
        return business;
    }

    public void setBusiness(BusinessSoftSrv business) {
        this.business = business;
    }

    public ItemSrv userPostInfo(UserPostInfoSrv userPostInfo) {
        this.userPostInfo = userPostInfo;
        return this;
    }

    /**
     * Get userPostInfo
     *
     * @return userPostInfo
     **/

    public UserPostInfoSrv getUserPostInfo() {
        return userPostInfo;
    }

    public void setUserPostInfo(UserPostInfoSrv userPostInfo) {
        this.userPostInfo = userPostInfo;
    }

    public ItemSrv metadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get metadata
     *
     * @return metadata
     **/

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public ItemSrv latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Get latitude
     *
     * @return latitude
     **/

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public ItemSrv longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Get longitude
     *
     * @return longitude
     **/

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public ItemSrv canComment(Boolean canComment) {
        this.canComment = canComment;
        return this;
    }

    /**
     * Get canComment
     *
     * @return canComment
     **/

    public Boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(Boolean canComment) {
        this.canComment = canComment;
    }

    public ItemSrv canLike(Boolean canLike) {
        this.canLike = canLike;
        return this;
    }

    /**
     * Get canLike
     *
     * @return canLike
     **/

    public Boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(Boolean canLike) {
        this.canLike = canLike;
    }

    public ItemSrv tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ItemSrv addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<String>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Get tags
     *
     * @return tags
     **/

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemSrv itemSrv = (ItemSrv) o;
        return Objects.equals(this.id, itemSrv.id) &&
                Objects.equals(this.timelineId, itemSrv.timelineId) &&
                Objects.equals(this.entityId, itemSrv.entityId) &&
                Objects.equals(this.numOfLikes, itemSrv.numOfLikes) &&
                Objects.equals(this.numOfFavorites, itemSrv.numOfFavorites) &&
                Objects.equals(this.numOfComments, itemSrv.numOfComments) &&
                Objects.equals(this.timestamp, itemSrv.timestamp) &&
                Objects.equals(this.enable, itemSrv.enable) &&
                Objects.equals(this.hide, itemSrv.hide) &&
                Objects.equals(this.business, itemSrv.business) &&
                Objects.equals(this.userPostInfo, itemSrv.userPostInfo) &&
                Objects.equals(this.metadata, itemSrv.metadata) &&
                Objects.equals(this.latitude, itemSrv.latitude) &&
                Objects.equals(this.longitude, itemSrv.longitude) &&
                Objects.equals(this.canComment, itemSrv.canComment) &&
                Objects.equals(this.canLike, itemSrv.canLike) &&
                Objects.equals(this.tags, itemSrv.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, timelineId, entityId, numOfLikes, numOfFavorites, numOfComments, timestamp, enable, hide, business, userPostInfo, metadata, latitude, longitude, canComment, canLike, tags);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    timelineId: ").append(toIndentedString(timelineId)).append("\n");
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    numOfLikes: ").append(toIndentedString(numOfLikes)).append("\n");
        sb.append("    numOfFavorites: ").append(toIndentedString(numOfFavorites)).append("\n");
        sb.append("    numOfComments: ").append(toIndentedString(numOfComments)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    hide: ").append(toIndentedString(hide)).append("\n");
        sb.append("    business: ").append(toIndentedString(business)).append("\n");
        sb.append("    userPostInfo: ").append(toIndentedString(userPostInfo)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    canComment: ").append(toIndentedString(canComment)).append("\n");
        sb.append("    canLike: ").append(toIndentedString(canLike)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

