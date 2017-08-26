/*
 * Fanapium Core API
 * Fanapium B2B2C services

 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RateSrv
 */

public class Rate {
    @JsonProperty("rate")
    private Double rate = null;

    @JsonProperty("rateCount")
    private Long rateCount = null;

    public Rate rate(Double rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Get rate
     *
     * @return rate
     **/

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Rate rateCount(Long rateCount) {
        this.rateCount = rateCount;
        return this;
    }

    /**
     * Get rateCount
     *
     * @return rateCount
     **/

    public Long getRateCount() {
        return rateCount;
    }

    public void setRateCount(Long rateCount) {
        this.rateCount = rateCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rate rate = (Rate) o;
        return Objects.equals(this.rate, rate.rate) &&
                Objects.equals(this.rateCount, rate.rateCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rate, rateCount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RateSrv {\n");

        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    rateCount: ").append(toIndentedString(rateCount)).append("\n");
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

