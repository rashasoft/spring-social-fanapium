/*
 * Fanapium Core API
 * Fanapium B2B2C services

 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImageInfoSrv
 */
public class ImageInfo {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("hashCode")
    private String hashCode = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("actualWidth")
    private Integer actualWidth = null;

    @JsonProperty("actualHeight")
    private Integer actualHeight = null;

    @JsonProperty("width")
    private Integer width = null;

    @JsonProperty("height")
    private Integer height = null;

    public ImageInfo id(Long id) {
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

    public ImageInfo name(String name) {
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

    public ImageInfo hashCode(String hashCode) {
        this.hashCode = hashCode;
        return this;
    }

    /**
     * Get hashCode
     *
     * @return hashCode
     **/

    public String getHashCode() {
        return hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public ImageInfo description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImageInfo actualWidth(Integer actualWidth) {
        this.actualWidth = actualWidth;
        return this;
    }

    /**
     * Get actualWidth
     *
     * @return actualWidth
     **/

    public Integer getActualWidth() {
        return actualWidth;
    }

    public void setActualWidth(Integer actualWidth) {
        this.actualWidth = actualWidth;
    }

    public ImageInfo actualHeight(Integer actualHeight) {
        this.actualHeight = actualHeight;
        return this;
    }

    /**
     * Get actualHeight
     *
     * @return actualHeight
     **/

    public Integer getActualHeight() {
        return actualHeight;
    }

    public void setActualHeight(Integer actualHeight) {
        this.actualHeight = actualHeight;
    }

    public ImageInfo width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * Get width
     *
     * @return width
     **/

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public ImageInfo height(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * Get height
     *
     * @return height
     **/

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageInfo imageInfo = (ImageInfo) o;
        return Objects.equals(this.id, imageInfo.id) &&
                Objects.equals(this.name, imageInfo.name) &&
                Objects.equals(this.hashCode, imageInfo.hashCode) &&
                Objects.equals(this.description, imageInfo.description) &&
                Objects.equals(this.actualWidth, imageInfo.actualWidth) &&
                Objects.equals(this.actualHeight, imageInfo.actualHeight) &&
                Objects.equals(this.width, imageInfo.width) &&
                Objects.equals(this.height, imageInfo.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, hashCode, description, actualWidth, actualHeight, width, height);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageInfoSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    hashCode: ").append(toIndentedString(hashCode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    actualWidth: ").append(toIndentedString(actualWidth)).append("\n");
        sb.append("    actualHeight: ").append(toIndentedString(actualHeight)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

