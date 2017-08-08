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
 * UserAmountSrv
 */

public class UserAmount {
    @JsonProperty("customerAmountSrvs")
    private List<CustomerAmount> customerAmounts = null;

    @JsonProperty("mainBusinessAmountSrvs")
    private List<BusinessAmount> mainBusinessAmounts = null;

    @JsonProperty("blockedBusinessAmountSrvs")
    private List<BusinessAmount> blockedBusinessAmounts = null;

    public UserAmount customerAmountSrvs(List<CustomerAmount> customerAmounts) {
        this.customerAmounts = customerAmounts;
        return this;
    }

    public UserAmount addCustomerAmountSrvsItem(CustomerAmount customerAmountSrvsItem) {
        if (this.customerAmounts == null) {
            this.customerAmounts = new ArrayList<CustomerAmount>();
        }
        this.customerAmounts.add(customerAmountSrvsItem);
        return this;
    }

    /**
     * Get customerAmountSrvs
     *
     * @return customerAmountSrvs
     **/

    public List<CustomerAmount> getCustomerAmounts() {
        return customerAmounts;
    }

    public void setCustomerAmounts(List<CustomerAmount> customerAmounts) {
        this.customerAmounts = customerAmounts;
    }

    public UserAmount mainBusinessAmountSrvs(List<BusinessAmount> mainBusinessAmounts) {
        this.mainBusinessAmounts = mainBusinessAmounts;
        return this;
    }

    public UserAmount addMainBusinessAmountSrvsItem(BusinessAmount mainBusinessAmountSrvsItem) {
        if (this.mainBusinessAmounts == null) {
            this.mainBusinessAmounts = new ArrayList<BusinessAmount>();
        }
        this.mainBusinessAmounts.add(mainBusinessAmountSrvsItem);
        return this;
    }

    /**
     * Get mainBusinessAmountSrvs
     *
     * @return mainBusinessAmountSrvs
     **/

    public List<BusinessAmount> getMainBusinessAmounts() {
        return mainBusinessAmounts;
    }

    public void setMainBusinessAmounts(List<BusinessAmount> mainBusinessAmounts) {
        this.mainBusinessAmounts = mainBusinessAmounts;
    }

    public UserAmount blockedBusinessAmountSrvs(List<BusinessAmount> blockedBusinessAmounts) {
        this.blockedBusinessAmounts = blockedBusinessAmounts;
        return this;
    }

    public UserAmount addBlockedBusinessAmountSrvsItem(BusinessAmount blockedBusinessAmountSrvsItem) {
        if (this.blockedBusinessAmounts == null) {
            this.blockedBusinessAmounts = new ArrayList<BusinessAmount>();
        }
        this.blockedBusinessAmounts.add(blockedBusinessAmountSrvsItem);
        return this;
    }

    /**
     * Get blockedBusinessAmountSrvs
     *
     * @return blockedBusinessAmountSrvs
     **/

    public List<BusinessAmount> getBlockedBusinessAmounts() {
        return blockedBusinessAmounts;
    }

    public void setBlockedBusinessAmounts(List<BusinessAmount> blockedBusinessAmounts) {
        this.blockedBusinessAmounts = blockedBusinessAmounts;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserAmount userAmount = (UserAmount) o;
        return Objects.equals(this.customerAmounts, userAmount.customerAmounts) &&
                Objects.equals(this.mainBusinessAmounts, userAmount.mainBusinessAmounts) &&
                Objects.equals(this.blockedBusinessAmounts, userAmount.blockedBusinessAmounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerAmounts, mainBusinessAmounts, blockedBusinessAmounts);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserAmountSrv {\n");

        sb.append("    customerAmountSrvs: ").append(toIndentedString(customerAmounts)).append("\n");
        sb.append("    mainBusinessAmountSrvs: ").append(toIndentedString(mainBusinessAmounts)).append("\n");
        sb.append("    blockedBusinessAmountSrvs: ").append(toIndentedString(blockedBusinessAmounts)).append("\n");
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

