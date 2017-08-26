/*
 * Fanapium Core API
 * Fanapium B2B2C services

 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * NewsSrv
 */

public class News {
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
    private BusinessSoft business = null;

    @JsonProperty("userPostInfo")
    private UserPostInfo userPostInfo = null;

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

    @JsonProperty("categoryList")
    private List<String> categoryList = null;

    @JsonProperty("imageInfo")
    private ImageInfo imageInfo = null;

    @JsonProperty("previewImage")
    private String previewImage = null;

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("rootitr")
    private String rootitr = null;

    @JsonProperty("shortDescription")
    private String shortDescription = null;

    @JsonProperty("text")
    private String text = null;

    @JsonProperty("link")
    private String link = null;

    @JsonProperty("hot")
    private Boolean hot = null;

    public News id(Long id) {
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

    public News timelineId(Long timelineId) {
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

    public News entityId(Long entityId) {
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

    public News numOfLikes(Integer numOfLikes) {
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

    public News numOfFavorites(Integer numOfFavorites) {
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

    public News numOfComments(Integer numOfComments) {
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

    public News timestamp(Long timestamp) {
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

    public News enable(Boolean enable) {
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

    public News hide(Boolean hide) {
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

    public News business(BusinessSoft business) {
        this.business = business;
        return this;
    }

    /**
     * Get business
     *
     * @return business
     **/

    public BusinessSoft getBusiness() {
        return business;
    }

    public void setBusiness(BusinessSoft business) {
        this.business = business;
    }

    public News userPostInfo(UserPostInfo userPostInfo) {
        this.userPostInfo = userPostInfo;
        return this;
    }

    /**
     * Get userPostInfo
     *
     * @return userPostInfo
     **/

    public UserPostInfo getUserPostInfo() {
        return userPostInfo;
    }

    public void setUserPostInfo(UserPostInfo userPostInfo) {
        this.userPostInfo = userPostInfo;
    }

    public News metadata(String metadata) {
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

    public News latitude(Double latitude) {
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

    public News longitude(Double longitude) {
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

    public News canComment(Boolean canComment) {
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

    public News canLike(Boolean canLike) {
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

    public News tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public News addTagsItem(String tagsItem) {
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

    public News categoryList(List<String> categoryList) {
        this.categoryList = categoryList;
        return this;
    }

    public News addCategoryListItem(String categoryListItem) {
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

    public News imageInfo(ImageInfo imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }

    /**
     * Get imageInfo
     *
     * @return imageInfo
     **/

    public ImageInfo getImageInfo() {
        return imageInfo;
    }

    public void setImageInfo(ImageInfo imageInfo) {
        this.imageInfo = imageInfo;
    }

    public News previewImage(String previewImage) {
        this.previewImage = previewImage;
        return this;
    }

    /**
     * Get previewImage
     *
     * @return previewImage
     **/

    public String getPreviewImage() {
        return previewImage;
    }

    public void setPreviewImage(String previewImage) {
        this.previewImage = previewImage;
    }

    public News title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     *
     * @return title
     **/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public News rootitr(String rootitr) {
        this.rootitr = rootitr;
        return this;
    }

    /**
     * Get rootitr
     *
     * @return rootitr
     **/

    public String getRootitr() {
        return rootitr;
    }

    public void setRootitr(String rootitr) {
        this.rootitr = rootitr;
    }

    public News shortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * Get shortDescription
     *
     * @return shortDescription
     **/

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public News text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get text
     *
     * @return text
     **/

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public News link(String link) {
        this.link = link;
        return this;
    }

    /**
     * Get link
     *
     * @return link
     **/

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public News hot(Boolean hot) {
        this.hot = hot;
        return this;
    }

    /**
     * Get hot
     *
     * @return hot
     **/

    public Boolean isHot() {
        return hot;
    }

    public void setHot(Boolean hot) {
        this.hot = hot;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        News news = (News) o;
        return Objects.equals(this.id, news.id) &&
                Objects.equals(this.timelineId, news.timelineId) &&
                Objects.equals(this.entityId, news.entityId) &&
                Objects.equals(this.numOfLikes, news.numOfLikes) &&
                Objects.equals(this.numOfFavorites, news.numOfFavorites) &&
                Objects.equals(this.numOfComments, news.numOfComments) &&
                Objects.equals(this.timestamp, news.timestamp) &&
                Objects.equals(this.enable, news.enable) &&
                Objects.equals(this.hide, news.hide) &&
                Objects.equals(this.business, news.business) &&
                Objects.equals(this.userPostInfo, news.userPostInfo) &&
                Objects.equals(this.metadata, news.metadata) &&
                Objects.equals(this.latitude, news.latitude) &&
                Objects.equals(this.longitude, news.longitude) &&
                Objects.equals(this.canComment, news.canComment) &&
                Objects.equals(this.canLike, news.canLike) &&
                Objects.equals(this.tags, news.tags) &&
                Objects.equals(this.categoryList, news.categoryList) &&
                Objects.equals(this.imageInfo, news.imageInfo) &&
                Objects.equals(this.previewImage, news.previewImage) &&
                Objects.equals(this.title, news.title) &&
                Objects.equals(this.rootitr, news.rootitr) &&
                Objects.equals(this.shortDescription, news.shortDescription) &&
                Objects.equals(this.text, news.text) &&
                Objects.equals(this.link, news.link) &&
                Objects.equals(this.hot, news.hot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, timelineId, entityId, numOfLikes, numOfFavorites, numOfComments, timestamp, enable, hide, business, userPostInfo, metadata, latitude, longitude, canComment, canLike, tags, categoryList, imageInfo, previewImage, title, rootitr, shortDescription, text, link, hot);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewsSrv {\n");

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
        sb.append("    categoryList: ").append(toIndentedString(categoryList)).append("\n");
        sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
        sb.append("    previewImage: ").append(toIndentedString(previewImage)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    rootitr: ").append(toIndentedString(rootitr)).append("\n");
        sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    hot: ").append(toIndentedString(hot)).append("\n");
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

