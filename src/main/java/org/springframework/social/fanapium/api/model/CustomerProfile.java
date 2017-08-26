/*
 * Fanapium Core API
 * Fanapium B2B2C services

 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CustomerProfileSrv
 */

public class CustomerProfile {
    @JsonProperty("firstName")
    private String firstName = null;

    @JsonProperty("lastName")
    private String lastName = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("email")
    private String email = null;

    @JsonProperty("phoneNumber")
    private String phoneNumber = null;

    @JsonProperty("nationalCode")
    private String nationalCode = null;

    @JsonProperty("gender")
    private String gender = null;

    @JsonProperty("addressSrv")
    private Address address = null;

    @JsonProperty("nickName")
    private String nickName = null;

    @JsonProperty("birthDate")
    private Long birthDate = null;

    @JsonProperty("score")
    private Long score = null;

    @JsonProperty("followingCount")
    private Long followingCount = null;

    @JsonProperty("imageInfo")
    private ImageInfo imageInfo = null;

    @JsonProperty("joinDate")
    private Long joinDate = null;

    @JsonProperty("cellphoneNumber")
    private String cellphoneNumber = null;

    @JsonProperty("userId")
    private Long userId = null;

    @JsonProperty("sheba")
    private String sheba = null;

    @JsonProperty("guest")
    private Boolean guest = null;

    @JsonProperty("chatSendEnable")
    private Boolean chatSendEnable = null;

    @JsonProperty("chatReceiveEnable")
    private Boolean chatReceiveEnable = null;

    public CustomerProfile firstName(String firstName) {
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

    public CustomerProfile lastName(String lastName) {
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

    public CustomerProfile name(String name) {
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

    public CustomerProfile email(String email) {
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

    public CustomerProfile phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get phoneNumber
     *
     * @return phoneNumber
     **/

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CustomerProfile nationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
        return this;
    }

    /**
     * Get nationalCode
     *
     * @return nationalCode
     **/

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public CustomerProfile gender(String gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Get gender
     *
     * @return gender
     **/

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public CustomerProfile addressSrv(Address address) {
        this.address = address;
        return this;
    }

    /**
     * Get addressSrv
     *
     * @return addressSrv
     **/

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CustomerProfile nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * Get nickName
     *
     * @return nickName
     **/

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public CustomerProfile birthDate(Long birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /**
     * Get birthDate
     *
     * @return birthDate
     **/

    public Long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Long birthDate) {
        this.birthDate = birthDate;
    }

    public CustomerProfile score(Long score) {
        this.score = score;
        return this;
    }

    /**
     * Get score
     *
     * @return score
     **/

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public CustomerProfile followingCount(Long followingCount) {
        this.followingCount = followingCount;
        return this;
    }

    /**
     * Get followingCount
     *
     * @return followingCount
     **/

    public Long getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Long followingCount) {
        this.followingCount = followingCount;
    }

    public CustomerProfile imageInfo(ImageInfo imageInfo) {
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

    public CustomerProfile joinDate(Long joinDate) {
        this.joinDate = joinDate;
        return this;
    }

    /**
     * Get joinDate
     *
     * @return joinDate
     **/

    public Long getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Long joinDate) {
        this.joinDate = joinDate;
    }

    public CustomerProfile cellphoneNumber(String cellphoneNumber) {
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

    public CustomerProfile userId(Long userId) {
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

    public CustomerProfile sheba(String sheba) {
        this.sheba = sheba;
        return this;
    }

    /**
     * Get sheba
     *
     * @return sheba
     **/

    public String getSheba() {
        return sheba;
    }

    public void setSheba(String sheba) {
        this.sheba = sheba;
    }

    public CustomerProfile guest(Boolean guest) {
        this.guest = guest;
        return this;
    }

    /**
     * Get guest
     *
     * @return guest
     **/

    public Boolean isGuest() {
        return guest;
    }

    public void setGuest(Boolean guest) {
        this.guest = guest;
    }

    public CustomerProfile chatSendEnable(Boolean chatSendEnable) {
        this.chatSendEnable = chatSendEnable;
        return this;
    }

    /**
     * Get chatSendEnable
     *
     * @return chatSendEnable
     **/

    public Boolean isChatSendEnable() {
        return chatSendEnable;
    }

    public void setChatSendEnable(Boolean chatSendEnable) {
        this.chatSendEnable = chatSendEnable;
    }

    public CustomerProfile chatReceiveEnable(Boolean chatReceiveEnable) {
        this.chatReceiveEnable = chatReceiveEnable;
        return this;
    }

    /**
     * Get chatReceiveEnable
     *
     * @return chatReceiveEnable
     **/

    public Boolean isChatReceiveEnable() {
        return chatReceiveEnable;
    }

    public void setChatReceiveEnable(Boolean chatReceiveEnable) {
        this.chatReceiveEnable = chatReceiveEnable;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerProfile customerProfile = (CustomerProfile) o;
        return Objects.equals(this.firstName, customerProfile.firstName) &&
                Objects.equals(this.lastName, customerProfile.lastName) &&
                Objects.equals(this.name, customerProfile.name) &&
                Objects.equals(this.email, customerProfile.email) &&
                Objects.equals(this.phoneNumber, customerProfile.phoneNumber) &&
                Objects.equals(this.nationalCode, customerProfile.nationalCode) &&
                Objects.equals(this.gender, customerProfile.gender) &&
                Objects.equals(this.address, customerProfile.address) &&
                Objects.equals(this.nickName, customerProfile.nickName) &&
                Objects.equals(this.birthDate, customerProfile.birthDate) &&
                Objects.equals(this.score, customerProfile.score) &&
                Objects.equals(this.followingCount, customerProfile.followingCount) &&
                Objects.equals(this.imageInfo, customerProfile.imageInfo) &&
                Objects.equals(this.joinDate, customerProfile.joinDate) &&
                Objects.equals(this.cellphoneNumber, customerProfile.cellphoneNumber) &&
                Objects.equals(this.userId, customerProfile.userId) &&
                Objects.equals(this.sheba, customerProfile.sheba) &&
                Objects.equals(this.guest, customerProfile.guest) &&
                Objects.equals(this.chatSendEnable, customerProfile.chatSendEnable) &&
                Objects.equals(this.chatReceiveEnable, customerProfile.chatReceiveEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, name, email, phoneNumber, nationalCode, gender, address, nickName, birthDate, score, followingCount, imageInfo, joinDate, cellphoneNumber, userId, sheba, guest, chatSendEnable, chatReceiveEnable);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerProfileSrv {\n");

        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    nationalCode: ").append(toIndentedString(nationalCode)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
        sb.append("    addressSrv: ").append(toIndentedString(address)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    followingCount: ").append(toIndentedString(followingCount)).append("\n");
        sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
        sb.append("    joinDate: ").append(toIndentedString(joinDate)).append("\n");
        sb.append("    cellphoneNumber: ").append(toIndentedString(cellphoneNumber)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    sheba: ").append(toIndentedString(sheba)).append("\n");
        sb.append("    guest: ").append(toIndentedString(guest)).append("\n");
        sb.append("    chatSendEnable: ").append(toIndentedString(chatSendEnable)).append("\n");
        sb.append("    chatReceiveEnable: ").append(toIndentedString(chatReceiveEnable)).append("\n");
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

