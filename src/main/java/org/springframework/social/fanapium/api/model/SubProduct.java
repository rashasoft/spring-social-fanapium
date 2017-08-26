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
 * SubProductSrv
 */

public class SubProduct {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("previewInfo")
    private ImageInfo previewInfo = null;

    @JsonProperty("availableCount")
    private Integer availableCount = null;

    @JsonProperty("price")
    private Long price = null;

    @JsonProperty("discount")
    private Long discount = null;

    @JsonProperty("attributeValues")
    private List<AttributeValue> attributeValues = null;

    public SubProduct id(Long id) {
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

    public SubProduct previewInfo(ImageInfo previewInfo) {
        this.previewInfo = previewInfo;
        return this;
    }

    /**
     * Get previewInfo
     *
     * @return previewInfo
     **/

    public ImageInfo getPreviewInfo() {
        return previewInfo;
    }

    public void setPreviewInfo(ImageInfo previewInfo) {
        this.previewInfo = previewInfo;
    }

    public SubProduct availableCount(Integer availableCount) {
        this.availableCount = availableCount;
        return this;
    }

    /**
     * Get availableCount
     *
     * @return availableCount
     **/

    public Integer getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(Integer availableCount) {
        this.availableCount = availableCount;
    }

    public SubProduct price(Long price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     **/

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public SubProduct discount(Long discount) {
        this.discount = discount;
        return this;
    }

    /**
     * Get discount
     *
     * @return discount
     **/

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public SubProduct attributeValues(List<AttributeValue> attributeValues) {
        this.attributeValues = attributeValues;
        return this;
    }

    public SubProduct addAttributeValuesItem(AttributeValue attributeValuesItem) {
        if (this.attributeValues == null) {
            this.attributeValues = new ArrayList<AttributeValue>();
        }
        this.attributeValues.add(attributeValuesItem);
        return this;
    }

    /**
     * Get attributeValues
     *
     * @return attributeValues
     **/

    public List<AttributeValue> getAttributeValues() {
        return attributeValues;
    }

    public void setAttributeValues(List<AttributeValue> attributeValues) {
        this.attributeValues = attributeValues;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubProduct subProduct = (SubProduct) o;
        return Objects.equals(this.id, subProduct.id) &&
                Objects.equals(this.previewInfo, subProduct.previewInfo) &&
                Objects.equals(this.availableCount, subProduct.availableCount) &&
                Objects.equals(this.price, subProduct.price) &&
                Objects.equals(this.discount, subProduct.discount) &&
                Objects.equals(this.attributeValues, subProduct.attributeValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, previewInfo, availableCount, price, discount, attributeValues);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubProductSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    previewInfo: ").append(toIndentedString(previewInfo)).append("\n");
        sb.append("    availableCount: ").append(toIndentedString(availableCount)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
        sb.append("    attributeValues: ").append(toIndentedString(attributeValues)).append("\n");
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

