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
 * BusinessAmountSrv
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-02T09:35:11.370+04:30")
public class BusinessAmountSrv {
    @JsonProperty("amount")
    private Double amount = null;

    @JsonProperty("guildSrv")
    private GuildSrv guildSrv = null;

    @JsonProperty("currencySrv")
    private CurrencySrv currencySrv = null;

    public BusinessAmountSrv amount(Double amount) {
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

    public BusinessAmountSrv guildSrv(GuildSrv guildSrv) {
        this.guildSrv = guildSrv;
        return this;
    }

    /**
     * Get guildSrv
     *
     * @return guildSrv
     **/

    public GuildSrv getGuildSrv() {
        return guildSrv;
    }

    public void setGuildSrv(GuildSrv guildSrv) {
        this.guildSrv = guildSrv;
    }

    public BusinessAmountSrv currencySrv(CurrencySrv currencySrv) {
        this.currencySrv = currencySrv;
        return this;
    }

    /**
     * Get currencySrv
     *
     * @return currencySrv
     **/

    public CurrencySrv getCurrencySrv() {
        return currencySrv;
    }

    public void setCurrencySrv(CurrencySrv currencySrv) {
        this.currencySrv = currencySrv;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BusinessAmountSrv businessAmountSrv = (BusinessAmountSrv) o;
        return Objects.equals(this.amount, businessAmountSrv.amount) &&
                Objects.equals(this.guildSrv, businessAmountSrv.guildSrv) &&
                Objects.equals(this.currencySrv, businessAmountSrv.currencySrv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, guildSrv, currencySrv);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessAmountSrv {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    guildSrv: ").append(toIndentedString(guildSrv)).append("\n");
        sb.append("    currencySrv: ").append(toIndentedString(currencySrv)).append("\n");
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

