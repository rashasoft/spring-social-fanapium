/*
 * Fanapium Core API
 * Fanapium B2B2C services
 *
 * OpenAPI spec version: 1.0.3
 * 
 *
 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CustomPostSrv
 */
public class CustomPostSrv {
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

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("data")
    private String data = null;

    @JsonProperty("categoryList")
    private List<String> categoryList = null;

    public CustomPostSrv id(Long id) {
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

    public CustomPostSrv timelineId(Long timelineId) {
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

    public CustomPostSrv entityId(Long entityId) {
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

    public CustomPostSrv numOfLikes(Integer numOfLikes) {
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

    public CustomPostSrv numOfFavorites(Integer numOfFavorites) {
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

    public CustomPostSrv numOfComments(Integer numOfComments) {
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

    public CustomPostSrv timestamp(Long timestamp) {
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

    public CustomPostSrv enable(Boolean enable) {
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

    public CustomPostSrv hide(Boolean hide) {
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

    public CustomPostSrv business(BusinessSoftSrv business) {
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

    public CustomPostSrv userPostInfo(UserPostInfoSrv userPostInfo) {
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

    public CustomPostSrv metadata(String metadata) {
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

    public CustomPostSrv latitude(Double latitude) {
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

    public CustomPostSrv longitude(Double longitude) {
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

    public CustomPostSrv canComment(Boolean canComment) {
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

    public CustomPostSrv canLike(Boolean canLike) {
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

    public CustomPostSrv tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CustomPostSrv addTagsItem(String tagsItem) {
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

    public CustomPostSrv name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomPostSrv data(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public CustomPostSrv categoryList(List<String> categoryList) {
        this.categoryList = categoryList;
        return this;
    }

    public CustomPostSrv addCategoryListItem(String categoryListItem) {
        if (this.categoryList == null) {
            this.categoryList = new ArrayList<String>();
        }
        this.categoryList.add(categoryListItem);
        return this;
    }

    /**
     * Get categoryList
     *
     * @return categoryList
     **/

    public List<String> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<String> categoryList) {
        this.categoryList = categoryList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomPostSrv customPostSrv = (CustomPostSrv) o;
        return Objects.equals(this.id, customPostSrv.id) &&
                Objects.equals(this.timelineId, customPostSrv.timelineId) &&
                Objects.equals(this.entityId, customPostSrv.entityId) &&
                Objects.equals(this.numOfLikes, customPostSrv.numOfLikes) &&
                Objects.equals(this.numOfFavorites, customPostSrv.numOfFavorites) &&
                Objects.equals(this.numOfComments, customPostSrv.numOfComments) &&
                Objects.equals(this.timestamp, customPostSrv.timestamp) &&
                Objects.equals(this.enable, customPostSrv.enable) &&
                Objects.equals(this.hide, customPostSrv.hide) &&
                Objects.equals(this.business, customPostSrv.business) &&
                Objects.equals(this.userPostInfo, customPostSrv.userPostInfo) &&
                Objects.equals(this.metadata, customPostSrv.metadata) &&
                Objects.equals(this.latitude, customPostSrv.latitude) &&
                Objects.equals(this.longitude, customPostSrv.longitude) &&
                Objects.equals(this.canComment, customPostSrv.canComment) &&
                Objects.equals(this.canLike, customPostSrv.canLike) &&
                Objects.equals(this.tags, customPostSrv.tags) &&
                Objects.equals(this.name, customPostSrv.name) &&
                Objects.equals(this.data, customPostSrv.data) &&
                Objects.equals(this.categoryList, customPostSrv.categoryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, timelineId, entityId, numOfLikes, numOfFavorites, numOfComments, timestamp, enable, hide, business, userPostInfo, metadata, latitude, longitude, canComment, canLike, tags, name, data, categoryList);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomPostSrv {\n");

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
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    categoryList: ").append(toIndentedString(categoryList)).append("\n");
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

