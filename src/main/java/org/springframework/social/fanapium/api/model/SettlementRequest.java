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
 * SettlementRequestSrv
 */

public class SettlementRequest {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("amount")
    private Double amount = null;

    @JsonProperty("requestDate")
    private Long requestDate = null;

    @JsonProperty("customerProfileSrv")
    private CustomerProfile customerProfile = null;

    @JsonProperty("settleDate")
    private Long settleDate = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("customerAmountSrvs")
    private List<CustomerAmount> customerAmounts = null;

    @JsonProperty("currency")
    private Currency currency = null;

    @JsonProperty("toolCode")
    private String toolCode = null;

    @JsonProperty("toolId")
    private String toolId = null;

    @JsonProperty("settlementLogSrvs")
    private List<SettlementLog> settlementLogs = null;

    public SettlementRequest id(Long id) {
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

    public SettlementRequest amount(Double amount) {
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

    public SettlementRequest requestDate(Long requestDate) {
        this.requestDate = requestDate;
        return this;
    }

    /**
     * Get requestDate
     *
     * @return requestDate
     **/

    public Long getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Long requestDate) {
        this.requestDate = requestDate;
    }

    public SettlementRequest customerProfileSrv(CustomerProfile customerProfile) {
        this.customerProfile = customerProfile;
        return this;
    }

    /**
     * Get customerProfileSrv
     *
     * @return customerProfileSrv
     **/

    public CustomerProfile getCustomerProfile() {
        return customerProfile;
    }

    public void setCustomerProfile(CustomerProfile customerProfile) {
        this.customerProfile = customerProfile;
    }

    public SettlementRequest settleDate(Long settleDate) {
        this.settleDate = settleDate;
        return this;
    }

    /**
     * Get settleDate
     *
     * @return settleDate
     **/

    public Long getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(Long settleDate) {
        this.settleDate = settleDate;
    }

    public SettlementRequest status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SettlementRequest customerAmountSrvs(List<CustomerAmount> customerAmounts) {
        this.customerAmounts = customerAmounts;
        return this;
    }

    public SettlementRequest addCustomerAmountSrvsItem(CustomerAmount customerAmountSrvsItem) {
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

    public SettlementRequest currency(Currency currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     **/

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public SettlementRequest toolCode(String toolCode) {
        this.toolCode = toolCode;
        return this;
    }

    /**
     * Get toolCode
     *
     * @return toolCode
     **/

    public String getToolCode() {
        return toolCode;
    }

    public void setToolCode(String toolCode) {
        this.toolCode = toolCode;
    }

    public SettlementRequest toolId(String toolId) {
        this.toolId = toolId;
        return this;
    }

    /**
     * Get toolId
     *
     * @return toolId
     **/

    public String getToolId() {
        return toolId;
    }

    public void setToolId(String toolId) {
        this.toolId = toolId;
    }

    public SettlementRequest settlementLogSrvs(List<SettlementLog> settlementLogs) {
        this.settlementLogs = settlementLogs;
        return this;
    }

    public SettlementRequest addSettlementLogSrvsItem(SettlementLog settlementLogSrvsItem) {
        if (this.settlementLogs == null) {
            this.settlementLogs = new ArrayList<SettlementLog>();
        }
        this.settlementLogs.add(settlementLogSrvsItem);
        return this;
    }

    /**
     * Get settlementLogSrvs
     *
     * @return settlementLogSrvs
     **/

    public List<SettlementLog> getSettlementLogs() {
        return settlementLogs;
    }

    public void setSettlementLogs(List<SettlementLog> settlementLogs) {
        this.settlementLogs = settlementLogs;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SettlementRequest settlementRequest = (SettlementRequest) o;
        return Objects.equals(this.id, settlementRequest.id) &&
                Objects.equals(this.amount, settlementRequest.amount) &&
                Objects.equals(this.requestDate, settlementRequest.requestDate) &&
                Objects.equals(this.customerProfile, settlementRequest.customerProfile) &&
                Objects.equals(this.settleDate, settlementRequest.settleDate) &&
                Objects.equals(this.status, settlementRequest.status) &&
                Objects.equals(this.customerAmounts, settlementRequest.customerAmounts) &&
                Objects.equals(this.currency, settlementRequest.currency) &&
                Objects.equals(this.toolCode, settlementRequest.toolCode) &&
                Objects.equals(this.toolId, settlementRequest.toolId) &&
                Objects.equals(this.settlementLogs, settlementRequest.settlementLogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, requestDate, customerProfile, settleDate, status, customerAmounts, currency, toolCode, toolId, settlementLogs);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SettlementRequestSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    requestDate: ").append(toIndentedString(requestDate)).append("\n");
        sb.append("    customerProfileSrv: ").append(toIndentedString(customerProfile)).append("\n");
        sb.append("    settleDate: ").append(toIndentedString(settleDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    customerAmountSrvs: ").append(toIndentedString(customerAmounts)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    toolCode: ").append(toIndentedString(toolCode)).append("\n");
        sb.append("    toolId: ").append(toIndentedString(toolId)).append("\n");
        sb.append("    settlementLogSrvs: ").append(toIndentedString(settlementLogs)).append("\n");
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

