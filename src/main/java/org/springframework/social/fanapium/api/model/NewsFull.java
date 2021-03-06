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
 * NewsFullSrv
 */

public class NewsFull {
    @JsonProperty("id")
    private Long id = null;

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

    @JsonProperty("link")
    private String link = null;

    @JsonProperty("hot")
    private Boolean hot = null;

    @JsonProperty("timestamp")
    private Long timestamp = null;

    @JsonProperty("text")
    private String text = null;

    @JsonProperty("gallery")
    private List<ImageInfo> gallery = null;

    public NewsFull id(Long id) {
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

    public NewsFull categoryList(List<String> categoryList) {
        this.categoryList = categoryList;
        return this;
    }

    public NewsFull addCategoryListItem(String categoryListItem) {
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

    public NewsFull imageInfo(ImageInfo imageInfo) {
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

    public NewsFull previewImage(String previewImage) {
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

    public NewsFull title(String title) {
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

    public NewsFull rootitr(String rootitr) {
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

    public NewsFull shortDescription(String shortDescription) {
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

    public NewsFull link(String link) {
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

    public NewsFull hot(Boolean hot) {
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

    public NewsFull timestamp(Long timestamp) {
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

    public NewsFull text(String text) {
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

    public NewsFull gallery(List<ImageInfo> gallery) {
        this.gallery = gallery;
        return this;
    }

    public NewsFull addGalleryItem(ImageInfo galleryItem) {
        if (this.gallery == null) {
            this.gallery = new ArrayList<ImageInfo>();
        }
        this.gallery.add(galleryItem);
        return this;
    }

    /**
     * Get gallery
     *
     * @return gallery
     **/

    public List<ImageInfo> getGallery() {
        return gallery;
    }

    public void setGallery(List<ImageInfo> gallery) {
        this.gallery = gallery;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NewsFull newsFull = (NewsFull) o;
        return Objects.equals(this.id, newsFull.id) &&
                Objects.equals(this.categoryList, newsFull.categoryList) &&
                Objects.equals(this.imageInfo, newsFull.imageInfo) &&
                Objects.equals(this.previewImage, newsFull.previewImage) &&
                Objects.equals(this.title, newsFull.title) &&
                Objects.equals(this.rootitr, newsFull.rootitr) &&
                Objects.equals(this.shortDescription, newsFull.shortDescription) &&
                Objects.equals(this.link, newsFull.link) &&
                Objects.equals(this.hot, newsFull.hot) &&
                Objects.equals(this.timestamp, newsFull.timestamp) &&
                Objects.equals(this.text, newsFull.text) &&
                Objects.equals(this.gallery, newsFull.gallery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryList, imageInfo, previewImage, title, rootitr, shortDescription, link, hot, timestamp, text, gallery);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewsFullSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    categoryList: ").append(toIndentedString(categoryList)).append("\n");
        sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
        sb.append("    previewImage: ").append(toIndentedString(previewImage)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    rootitr: ").append(toIndentedString(rootitr)).append("\n");
        sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    hot: ").append(toIndentedString(hot)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    gallery: ").append(toIndentedString(gallery)).append("\n");
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

