/*
 * Fanapium Core API
 * Fanapium B2B2C services

 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FriendSrv
 */

public class Friend {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("firstName")
    private String firstName = null;

    @JsonProperty("lastName")
    private String lastName = null;

    @JsonProperty("email")
    private String email = null;

    @JsonProperty("cellphoneNumber")
    private String cellphoneNumber = null;

    @JsonProperty("uniqueId")
    private String uniqueId = null;

    @JsonProperty("userId")
    private Long userId = null;

    @JsonProperty("type")
    private Integer type = null;

    @JsonProperty("image")
    private ImageInfo image = null;

    public Friend id(Long id) {
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

    public Friend firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get firstName
     *
     * @return firstName
     **/

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Friend lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get lastName
     *
     * @return lastName
     **/

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Friend email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     **/

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Friend cellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
        return this;
    }

    /**
     * Get cellphoneNumber
     *
     * @return cellphoneNumber
     **/

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public Friend uniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    /**
     * Get uniqueId
     *
     * @return uniqueId
     **/

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public Friend userId(Long userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get userId
     *
     * @return userId
     **/

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Friend type(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Friend image(ImageInfo image) {
        this.image = image;
        return this;
    }

    /**
     * Get image
     *
     * @return image
     **/

    public ImageInfo getImage() {
        return image;
    }

    public void setImage(ImageInfo image) {
        this.image = image;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Friend friend = (Friend) o;
        return Objects.equals(this.id, friend.id) &&
                Objects.equals(this.firstName, friend.firstName) &&
                Objects.equals(this.lastName, friend.lastName) &&
                Objects.equals(this.email, friend.email) &&
                Objects.equals(this.cellphoneNumber, friend.cellphoneNumber) &&
                Objects.equals(this.uniqueId, friend.uniqueId) &&
                Objects.equals(this.userId, friend.userId) &&
                Objects.equals(this.type, friend.type) &&
                Objects.equals(this.image, friend.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, cellphoneNumber, uniqueId, userId, type, image);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FriendSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    cellphoneNumber: ").append(toIndentedString(cellphoneNumber)).append("\n");
        sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

