/*
 * Fanapium Core API
 * Fanapium B2B2C services

 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GuildSrv
 */

public class Guild {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("code")
    private String code = null;

    @JsonProperty("imageInfo")
    private ImageInfo imageInfo = null;

    @JsonProperty("selected")
    private Boolean selected = null;

    public Guild id(Long id) {
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

    public Guild name(String name) {
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

    public Guild code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     **/

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Guild imageInfo(ImageInfo imageInfo) {
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

    public Guild selected(Boolean selected) {
        this.selected = selected;
        return this;
    }

    /**
     * Get selected
     *
     * @return selected
     **/

    public Boolean isSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Guild guild = (Guild) o;
        return Objects.equals(this.id, guild.id) &&
                Objects.equals(this.name, guild.name) &&
                Objects.equals(this.code, guild.code) &&
                Objects.equals(this.imageInfo, guild.imageInfo) &&
                Objects.equals(this.selected, guild.selected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, code, imageInfo, selected);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GuildSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
        sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

