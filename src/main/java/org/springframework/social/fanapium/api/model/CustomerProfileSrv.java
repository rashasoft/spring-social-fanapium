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

import java.util.Objects;

/**
 * CustomerProfileSrv
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-02T09:35:11.370+04:30")
public class CustomerProfileSrv {
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
    private AddressSrv addressSrv = null;

    @JsonProperty("nickName")
    private String nickName = null;

    @JsonProperty("birthDate")
    private Long birthDate = null;

    @JsonProperty("score")
    private Long score = null;

    @JsonProperty("followingCount")
    private Long followingCount = null;

    @JsonProperty("imageInfo")
    private ImageInfoSrv imageInfo = null;

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

    public CustomerProfileSrv firstName(String firstName) {
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

    public CustomerProfileSrv lastName(String lastName) {
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

    public CustomerProfileSrv name(String name) {
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

    public CustomerProfileSrv email(String email) {
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

    public CustomerProfileSrv phoneNumber(String phoneNumber) {
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

    public CustomerProfileSrv nationalCode(String nationalCode) {
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

    public CustomerProfileSrv gender(String gender) {
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

    public CustomerProfileSrv addressSrv(AddressSrv addressSrv) {
        this.addressSrv = addressSrv;
        return this;
    }

    /**
     * Get addressSrv
     *
     * @return addressSrv
     **/

    public AddressSrv getAddressSrv() {
        return addressSrv;
    }

    public void setAddressSrv(AddressSrv addressSrv) {
        this.addressSrv = addressSrv;
    }

    public CustomerProfileSrv nickName(String nickName) {
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

    public CustomerProfileSrv birthDate(Long birthDate) {
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

    public CustomerProfileSrv score(Long score) {
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

    public CustomerProfileSrv followingCount(Long followingCount) {
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

    public CustomerProfileSrv imageInfo(ImageInfoSrv imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }

    /**
     * Get imageInfo
     *
     * @return imageInfo
     **/

    public ImageInfoSrv getImageInfo() {
        return imageInfo;
    }

    public void setImageInfo(ImageInfoSrv imageInfo) {
        this.imageInfo = imageInfo;
    }

    public CustomerProfileSrv joinDate(Long joinDate) {
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

    public CustomerProfileSrv cellphoneNumber(String cellphoneNumber) {
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

    public CustomerProfileSrv userId(Long userId) {
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

    public CustomerProfileSrv sheba(String sheba) {
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

    public CustomerProfileSrv guest(Boolean guest) {
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

    public CustomerProfileSrv chatSendEnable(Boolean chatSendEnable) {
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

    public CustomerProfileSrv chatReceiveEnable(Boolean chatReceiveEnable) {
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
        CustomerProfileSrv customerProfileSrv = (CustomerProfileSrv) o;
        return Objects.equals(this.firstName, customerProfileSrv.firstName) &&
                Objects.equals(this.lastName, customerProfileSrv.lastName) &&
                Objects.equals(this.name, customerProfileSrv.name) &&
                Objects.equals(this.email, customerProfileSrv.email) &&
                Objects.equals(this.phoneNumber, customerProfileSrv.phoneNumber) &&
                Objects.equals(this.nationalCode, customerProfileSrv.nationalCode) &&
                Objects.equals(this.gender, customerProfileSrv.gender) &&
                Objects.equals(this.addressSrv, customerProfileSrv.addressSrv) &&
                Objects.equals(this.nickName, customerProfileSrv.nickName) &&
                Objects.equals(this.birthDate, customerProfileSrv.birthDate) &&
                Objects.equals(this.score, customerProfileSrv.score) &&
                Objects.equals(this.followingCount, customerProfileSrv.followingCount) &&
                Objects.equals(this.imageInfo, customerProfileSrv.imageInfo) &&
                Objects.equals(this.joinDate, customerProfileSrv.joinDate) &&
                Objects.equals(this.cellphoneNumber, customerProfileSrv.cellphoneNumber) &&
                Objects.equals(this.userId, customerProfileSrv.userId) &&
                Objects.equals(this.sheba, customerProfileSrv.sheba) &&
                Objects.equals(this.guest, customerProfileSrv.guest) &&
                Objects.equals(this.chatSendEnable, customerProfileSrv.chatSendEnable) &&
                Objects.equals(this.chatReceiveEnable, customerProfileSrv.chatReceiveEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, name, email, phoneNumber, nationalCode, gender, addressSrv, nickName, birthDate, score, followingCount, imageInfo, joinDate, cellphoneNumber, userId, sheba, guest, chatSendEnable, chatReceiveEnable);
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
        sb.append("    addressSrv: ").append(toIndentedString(addressSrv)).append("\n");
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

