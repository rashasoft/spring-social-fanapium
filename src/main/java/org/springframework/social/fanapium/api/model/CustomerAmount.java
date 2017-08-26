/*
 * Fanapium Core API
 * Fanapium B2B2C services

 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CustomerAmountSrv
 */

public class CustomerAmount {
    @JsonProperty("amount")
    private Double amount = null;

    @JsonProperty("currencySrv")
    private Currency currency = null;

    public CustomerAmount amount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public CustomerAmount currencySrv(Currency currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currencySrv
     *
     * @return currencySrv
     **/

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerAmount customerAmount = (CustomerAmount) o;
        return Objects.equals(this.amount, customerAmount.amount) &&
                Objects.equals(this.currency, customerAmount.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerAmountSrv {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currencySrv: ").append(toIndentedString(currency)).append("\n");
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

