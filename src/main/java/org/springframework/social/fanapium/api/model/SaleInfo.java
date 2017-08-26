/*
 * Fanapium Core API
 * Fanapium B2B2C services

 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SaleInfo
 */

public class SaleInfo {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("discountPercent")
    private Double discountPercent = null;

    @JsonProperty("startDate")
    private Long startDate = null;

    @JsonProperty("endDate")
    private Long endDate = null;

    @JsonProperty("type")
    private String type = null;

    public SaleInfo id(Long id) {
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

    public SaleInfo discountPercent(Double discountPercent) {
        this.discountPercent = discountPercent;
        return this;
    }

    /**
     * Get discountPercent
     *
     * @return discountPercent
     **/

    public Double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public SaleInfo startDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get startDate
     *
     * @return startDate
     **/

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public SaleInfo endDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get endDate
     *
     * @return endDate
     **/

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public SaleInfo type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SaleInfo saleInfo = (SaleInfo) o;
        return Objects.equals(this.id, saleInfo.id) &&
                Objects.equals(this.discountPercent, saleInfo.discountPercent) &&
                Objects.equals(this.startDate, saleInfo.startDate) &&
                Objects.equals(this.endDate, saleInfo.endDate) &&
                Objects.equals(this.type, saleInfo.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, discountPercent, startDate, endDate, type);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaleInfo {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

