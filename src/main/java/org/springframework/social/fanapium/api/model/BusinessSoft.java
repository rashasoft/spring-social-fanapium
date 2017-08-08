/*
 * Fanapium Core API
 * Fanapium B2B2C services

 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BusinessSoftSrv
 */

public class BusinessSoft {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("imageInfo")
    private ImageInfo imageInfo = null;

    @JsonProperty("image")
    private String image = null;

    @JsonProperty("numOfProducts")
    private Integer numOfProducts = null;

    @JsonProperty("rate")
    private Rate rate = null;

    public BusinessSoft id(Long id) {
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

    public BusinessSoft name(String name) {
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

    public BusinessSoft imageInfo(ImageInfo imageInfo) {
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

    public BusinessSoft image(String image) {
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

    public BusinessSoft numOfProducts(Integer numOfProducts) {
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

    public BusinessSoft rate(Rate rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Get rate
     *
     * @return rate
     **/

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BusinessSoft businessSoft = (BusinessSoft) o;
        return Objects.equals(this.id, businessSoft.id) &&
                Objects.equals(this.name, businessSoft.name) &&
                Objects.equals(this.imageInfo, businessSoft.imageInfo) &&
                Objects.equals(this.image, businessSoft.image) &&
                Objects.equals(this.numOfProducts, businessSoft.numOfProducts) &&
                Objects.equals(this.rate, businessSoft.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, imageInfo, image, numOfProducts, rate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessSoftSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    numOfProducts: ").append(toIndentedString(numOfProducts)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

