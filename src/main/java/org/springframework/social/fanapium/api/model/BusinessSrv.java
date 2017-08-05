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
 * BusinessSrv
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-02T09:35:11.370+04:30")
public class BusinessSrv {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("guilds")
    private List<GuildSrv> guilds = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("imageInfo")
    private ImageInfoSrv imageInfo = null;

    @JsonProperty("coverImageInfo")
    private ImageInfoSrv coverImageInfo = null;

    @JsonProperty("image")
    private String image = null;

    @JsonProperty("coverImage")
    private String coverImage = null;

    @JsonProperty("address")
    private String address = null;

    @JsonProperty("city")
    private String city = null;

    @JsonProperty("state")
    private String state = null;

    @JsonProperty("country")
    private String country = null;

    @JsonProperty("postalcode")
    private String postalcode = null;

    @JsonProperty("phone")
    private String phone = null;

    @JsonProperty("cellphone")
    private String cellphone = null;

    @JsonProperty("faxNumber")
    private String faxNumber = null;

    @JsonProperty("latitude")
    private Double latitude = null;

    @JsonProperty("longitude")
    private Double longitude = null;

    @JsonProperty("subscriptionCount")
    private Integer subscriptionCount = null;

    @JsonProperty("subscribed")
    private Boolean subscribed = null;

    @JsonProperty("numOfComments")
    private Integer numOfComments = null;

    @JsonProperty("rate")
    private RateSrv rate = null;

    @JsonProperty("userId")
    private Long userId = null;

    @JsonProperty("numOfProducts")
    private Integer numOfProducts = null;

    @JsonProperty("firstName")
    private String firstName = null;

    @JsonProperty("lastName")
    private String lastName = null;

    @JsonProperty("nationalCode")
    private String nationalCode = null;

    @JsonProperty("registrationNumber")
    private String registrationNumber = null;

    @JsonProperty("sheba")
    private String sheba = null;

    @JsonProperty("email")
    private String email = null;

    @JsonProperty("fullAddress")
    private String fullAddress = null;

    public BusinessSrv id(Long id) {
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

    public BusinessSrv name(String name) {
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

    public BusinessSrv guilds(List<GuildSrv> guilds) {
        this.guilds = guilds;
        return this;
    }

    public BusinessSrv addGuildsItem(GuildSrv guildsItem) {
        if (this.guilds == null) {
            this.guilds = new ArrayList<GuildSrv>();
        }
        this.guilds.add(guildsItem);
        return this;
    }

    /**
     * Get guilds
     *
     * @return guilds
     **/

    public List<GuildSrv> getGuilds() {
        return guilds;
    }

    public void setGuilds(List<GuildSrv> guilds) {
        this.guilds = guilds;
    }

    public BusinessSrv description(String description) {
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

    public BusinessSrv imageInfo(ImageInfoSrv imageInfo) {
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

    public BusinessSrv coverImageInfo(ImageInfoSrv coverImageInfo) {
        this.coverImageInfo = coverImageInfo;
        return this;
    }

    /**
     * Get coverImageInfo
     *
     * @return coverImageInfo
     **/

    public ImageInfoSrv getCoverImageInfo() {
        return coverImageInfo;
    }

    public void setCoverImageInfo(ImageInfoSrv coverImageInfo) {
        this.coverImageInfo = coverImageInfo;
    }

    public BusinessSrv image(String image) {
        this.image = image;
        return this;
    }

    /**
     * Get image
     *
     * @return image
     **/

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BusinessSrv coverImage(String coverImage) {
        this.coverImage = coverImage;
        return this;
    }

    /**
     * Get coverImage
     *
     * @return coverImage
     **/

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public BusinessSrv address(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     **/

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BusinessSrv city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get city
     *
     * @return city
     **/

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BusinessSrv state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     **/

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BusinessSrv country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get country
     *
     * @return country
     **/

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BusinessSrv postalcode(String postalcode) {
        this.postalcode = postalcode;
        return this;
    }

    /**
     * Get postalcode
     *
     * @return postalcode
     **/

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public BusinessSrv phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get phone
     *
     * @return phone
     **/

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BusinessSrv cellphone(String cellphone) {
        this.cellphone = cellphone;
        return this;
    }

    /**
     * Get cellphone
     *
     * @return cellphone
     **/

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public BusinessSrv faxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
        return this;
    }

    /**
     * Get faxNumber
     *
     * @return faxNumber
     **/

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public BusinessSrv latitude(Double latitude) {
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

    public BusinessSrv longitude(Double longitude) {
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

    public BusinessSrv subscriptionCount(Integer subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
        return this;
    }

    /**
     * Get subscriptionCount
     *
     * @return subscriptionCount
     **/

    public Integer getSubscriptionCount() {
        return subscriptionCount;
    }

    public void setSubscriptionCount(Integer subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
    }

    public BusinessSrv subscribed(Boolean subscribed) {
        this.subscribed = subscribed;
        return this;
    }

    /**
     * Get subscribed
     *
     * @return subscribed
     **/

    public Boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public BusinessSrv numOfComments(Integer numOfComments) {
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

    public BusinessSrv rate(RateSrv rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Get rate
     *
     * @return rate
     **/

    public RateSrv getRate() {
        return rate;
    }

    public void setRate(RateSrv rate) {
        this.rate = rate;
    }

    public BusinessSrv userId(Long userId) {
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

    public BusinessSrv numOfProducts(Integer numOfProducts) {
        this.numOfProducts = numOfProducts;
        return this;
    }

    /**
     * Get numOfProducts
     *
     * @return numOfProducts
     **/

    public Integer getNumOfProducts() {
        return numOfProducts;
    }

    public void setNumOfProducts(Integer numOfProducts) {
        this.numOfProducts = numOfProducts;
    }

    public BusinessSrv firstName(String firstName) {
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

    public BusinessSrv lastName(String lastName) {
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

    public BusinessSrv nationalCode(String nationalCode) {
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

    public BusinessSrv registrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }

    /**
     * Get registrationNumber
     *
     * @return registrationNumber
     **/

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public BusinessSrv sheba(String sheba) {
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

    public BusinessSrv email(String email) {
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

    public BusinessSrv fullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
        return this;
    }

    /**
     * Get fullAddress
     *
     * @return fullAddress
     **/

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BusinessSrv businessSrv = (BusinessSrv) o;
        return Objects.equals(this.id, businessSrv.id) &&
                Objects.equals(this.name, businessSrv.name) &&
                Objects.equals(this.guilds, businessSrv.guilds) &&
                Objects.equals(this.description, businessSrv.description) &&
                Objects.equals(this.imageInfo, businessSrv.imageInfo) &&
                Objects.equals(this.coverImageInfo, businessSrv.coverImageInfo) &&
                Objects.equals(this.image, businessSrv.image) &&
                Objects.equals(this.coverImage, businessSrv.coverImage) &&
                Objects.equals(this.address, businessSrv.address) &&
                Objects.equals(this.city, businessSrv.city) &&
                Objects.equals(this.state, businessSrv.state) &&
                Objects.equals(this.country, businessSrv.country) &&
                Objects.equals(this.postalcode, businessSrv.postalcode) &&
                Objects.equals(this.phone, businessSrv.phone) &&
                Objects.equals(this.cellphone, businessSrv.cellphone) &&
                Objects.equals(this.faxNumber, businessSrv.faxNumber) &&
                Objects.equals(this.latitude, businessSrv.latitude) &&
                Objects.equals(this.longitude, businessSrv.longitude) &&
                Objects.equals(this.subscriptionCount, businessSrv.subscriptionCount) &&
                Objects.equals(this.subscribed, businessSrv.subscribed) &&
                Objects.equals(this.numOfComments, businessSrv.numOfComments) &&
                Objects.equals(this.rate, businessSrv.rate) &&
                Objects.equals(this.userId, businessSrv.userId) &&
                Objects.equals(this.numOfProducts, businessSrv.numOfProducts) &&
                Objects.equals(this.firstName, businessSrv.firstName) &&
                Objects.equals(this.lastName, businessSrv.lastName) &&
                Objects.equals(this.nationalCode, businessSrv.nationalCode) &&
                Objects.equals(this.registrationNumber, businessSrv.registrationNumber) &&
                Objects.equals(this.sheba, businessSrv.sheba) &&
                Objects.equals(this.email, businessSrv.email) &&
                Objects.equals(this.fullAddress, businessSrv.fullAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, guilds, description, imageInfo, coverImageInfo, image, coverImage, address, city, state, country, postalcode, phone, cellphone, faxNumber, latitude, longitude, subscriptionCount, subscribed, numOfComments, rate, userId, numOfProducts, firstName, lastName, nationalCode, registrationNumber, sheba, email, fullAddress);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    guilds: ").append(toIndentedString(guilds)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
        sb.append("    coverImageInfo: ").append(toIndentedString(coverImageInfo)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    coverImage: ").append(toIndentedString(coverImage)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    postalcode: ").append(toIndentedString(postalcode)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    cellphone: ").append(toIndentedString(cellphone)).append("\n");
        sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    subscriptionCount: ").append(toIndentedString(subscriptionCount)).append("\n");
        sb.append("    subscribed: ").append(toIndentedString(subscribed)).append("\n");
        sb.append("    numOfComments: ").append(toIndentedString(numOfComments)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    numOfProducts: ").append(toIndentedString(numOfProducts)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    nationalCode: ").append(toIndentedString(nationalCode)).append("\n");
        sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
        sb.append("    sheba: ").append(toIndentedString(sheba)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    fullAddress: ").append(toIndentedString(fullAddress)).append("\n");
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

