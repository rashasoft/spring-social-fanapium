/*
 * Fanapium Core API
 * Fanapium B2B2C services
 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AccountBillItemSrv
 */
public class AccountBillItem {
    @JsonProperty("accountName")
    private String accountName = null;

    @JsonProperty("issuanceDate")
    private String issuanceDate = null;

    @JsonProperty("amount")
    private Double amount = null;

    @JsonProperty("debtor")
    private Boolean debtor = null;

    @JsonProperty("afterTxAmount")
    private Double afterTxAmount = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("documentId")
    private Long documentId = null;

    @JsonProperty("txNumber")
    private String txNumber = null;

    @JsonProperty("issuerName")
    private String issuerName = null;

    @JsonProperty("canceled")
    private Boolean canceled = null;

    @JsonProperty("currency")
    private Currency currency = null;

    public AccountBillItem accountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get accountName
     *
     * @return accountName
     **/

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public AccountBillItem issuanceDate(String issuanceDate) {
        this.issuanceDate = issuanceDate;
        return this;
    }

    /**
     * Get issuanceDate
     *
     * @return issuanceDate
     **/

    public String getIssuanceDate() {
        return issuanceDate;
    }

    public void setIssuanceDate(String issuanceDate) {
        this.issuanceDate = issuanceDate;
    }

    public AccountBillItem amount(Double amount) {
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

    public AccountBillItem debtor(Boolean debtor) {
        this.debtor = debtor;
        return this;
    }

    /**
     * Get debtor
     *
     * @return debtor
     **/

    public Boolean isDebtor() {
        return debtor;
    }

    public void setDebtor(Boolean debtor) {
        this.debtor = debtor;
    }

    public AccountBillItem afterTxAmount(Double afterTxAmount) {
        this.afterTxAmount = afterTxAmount;
        return this;
    }

    /**
     * Get afterTxAmount
     *
     * @return afterTxAmount
     **/

    public Double getAfterTxAmount() {
        return afterTxAmount;
    }

    public void setAfterTxAmount(Double afterTxAmount) {
        this.afterTxAmount = afterTxAmount;
    }

    public AccountBillItem description(String description) {
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

    public AccountBillItem documentId(Long documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * Get documentId
     *
     * @return documentId
     **/

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public AccountBillItem txNumber(String txNumber) {
        this.txNumber = txNumber;
        return this;
    }

    /**
     * Get txNumber
     *
     * @return txNumber
     **/

    public String getTxNumber() {
        return txNumber;
    }

    public void setTxNumber(String txNumber) {
        this.txNumber = txNumber;
    }

    public AccountBillItem issuerName(String issuerName) {
        this.issuerName = issuerName;
        return this;
    }

    /**
     * Get issuerName
     *
     * @return issuerName
     **/

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public AccountBillItem canceled(Boolean canceled) {
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

    public AccountBillItem currency(Currency currency) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountBillItem accountBillItemSrv = (AccountBillItem) o;
        return Objects.equals(this.accountName, accountBillItemSrv.accountName) &&
                Objects.equals(this.issuanceDate, accountBillItemSrv.issuanceDate) &&
                Objects.equals(this.amount, accountBillItemSrv.amount) &&
                Objects.equals(this.debtor, accountBillItemSrv.debtor) &&
                Objects.equals(this.afterTxAmount, accountBillItemSrv.afterTxAmount) &&
                Objects.equals(this.description, accountBillItemSrv.description) &&
                Objects.equals(this.documentId, accountBillItemSrv.documentId) &&
                Objects.equals(this.txNumber, accountBillItemSrv.txNumber) &&
                Objects.equals(this.issuerName, accountBillItemSrv.issuerName) &&
                Objects.equals(this.canceled, accountBillItemSrv.canceled) &&
                Objects.equals(this.currency, accountBillItemSrv.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName, issuanceDate, amount, debtor, afterTxAmount, description, documentId, txNumber, issuerName, canceled, currency);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountBillItem {\n");

        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    issuanceDate: ").append(toIndentedString(issuanceDate)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
        sb.append("    afterTxAmount: ").append(toIndentedString(afterTxAmount)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    txNumber: ").append(toIndentedString(txNumber)).append("\n");
        sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
        sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

