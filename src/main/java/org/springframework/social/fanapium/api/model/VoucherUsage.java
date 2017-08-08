/*
 * Fanapium Core API
 * Fanapium B2B2C services

 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VoucherUsageSrv
 */

public class VoucherUsage {
    @JsonProperty("consumDate")
    private Long consumDate = null;

    @JsonProperty("usedAmount")
    private Double usedAmount = null;

    @JsonProperty("canceled")
    private Boolean canceled = null;

    public VoucherUsage consumDate(Long consumDate) {
        this.consumDate = consumDate;
        return this;
    }

    /**
     * Get consumDate
     *
     * @return consumDate
     **/

    public Long getConsumDate() {
        return consumDate;
    }

    public void setConsumDate(Long consumDate) {
        this.consumDate = consumDate;
    }

    public VoucherUsage usedAmount(Double usedAmount) {
        this.usedAmount = usedAmount;
        return this;
    }

    /**
     * Get usedAmount
     *
     * @return usedAmount
     **/

    public Double getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(Double usedAmount) {
        this.usedAmount = usedAmount;
    }

    public VoucherUsage canceled(Boolean canceled) {
        this.canceled = canceled;
        return this;
    }

    /**
     * Get canceled
     *
     * @return canceled
     **/

    public Boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(Boolean canceled) {
        this.canceled = canceled;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VoucherUsage voucherUsage = (VoucherUsage) o;
        return Objects.equals(this.consumDate, voucherUsage.consumDate) &&
                Objects.equals(this.usedAmount, voucherUsage.usedAmount) &&
                Objects.equals(this.canceled, voucherUsage.canceled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consumDate, usedAmount, canceled);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VoucherUsageSrv {\n");

        sb.append("    consumDate: ").append(toIndentedString(consumDate)).append("\n");
        sb.append("    usedAmount: ").append(toIndentedString(usedAmount)).append("\n");
        sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
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

