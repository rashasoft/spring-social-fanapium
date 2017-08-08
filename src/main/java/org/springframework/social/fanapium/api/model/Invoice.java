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
 * InvoiceSrv
 */

public class Invoice {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("totalAmount")
    private Long totalAmount = null;

    @JsonProperty("payableAmount")
    private Long payableAmount = null;

    @JsonProperty("vat")
    private Long vat = null;

    @JsonProperty("issuanceDate")
    private Long issuanceDate = null;

    @JsonProperty("deliveryDate")
    private Long deliveryDate = null;

    @JsonProperty("billNumber")
    private String billNumber = null;

    @JsonProperty("issuancePersianDate")
    private String issuancePersianDate = null;

    @JsonProperty("paymentBillNumber")
    private String paymentBillNumber = null;

    @JsonProperty("transactionReferenceId")
    private String transactionReferenceId = null;

    @JsonProperty("uniqueNumber")
    private String uniqueNumber = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("paymentDate")
    private Long paymentDate = null;

    @JsonProperty("payed")
    private Boolean payed = null;

    @JsonProperty("canceled")
    private Boolean canceled = null;

    @JsonProperty("cancelDate")
    private Long cancelDate = null;

    @JsonProperty("business")
    private BusinessSoft business = null;

    @JsonProperty("invoiceItemSrvs")
    private List<InvoiceItem> invoiceItems = null;

    @JsonProperty("guildSrv")
    private Guild guild = null;

    @JsonProperty("addressSrv")
    private Address address = null;

    @JsonProperty("userSrv")
    private User user = null;

    @JsonProperty("phoneNumber")
    private String phoneNumber = null;

    @JsonProperty("cellphoneNumber")
    private String cellphoneNumber = null;

    @JsonProperty("closed")
    private Boolean closed = null;

    public Invoice id(Long id) {
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

    public Invoice totalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Get totalAmount
     *
     * @return totalAmount
     **/

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Invoice payableAmount(Long payableAmount) {
        this.payableAmount = payableAmount;
        return this;
    }

    /**
     * Get payableAmount
     *
     * @return payableAmount
     **/

    public Long getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(Long payableAmount) {
        this.payableAmount = payableAmount;
    }

    public Invoice vat(Long vat) {
        this.vat = vat;
        return this;
    }

    /**
     * Get vat
     *
     * @return vat
     **/

    public Long getVat() {
        return vat;
    }

    public void setVat(Long vat) {
        this.vat = vat;
    }

    public Invoice issuanceDate(Long issuanceDate) {
        this.issuanceDate = issuanceDate;
        return this;
    }

    /**
     * Get issuanceDate
     *
     * @return issuanceDate
     **/

    public Long getIssuanceDate() {
        return issuanceDate;
    }

    public void setIssuanceDate(Long issuanceDate) {
        this.issuanceDate = issuanceDate;
    }

    public Invoice deliveryDate(Long deliveryDate) {
        this.deliveryDate = deliveryDate;
        return this;
    }

    /**
     * Get deliveryDate
     *
     * @return deliveryDate
     **/

    public Long getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Long deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Invoice billNumber(String billNumber) {
        this.billNumber = billNumber;
        return this;
    }

    /**
     * Get billNumber
     *
     * @return billNumber
     **/

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public Invoice issuancePersianDate(String issuancePersianDate) {
        this.issuancePersianDate = issuancePersianDate;
        return this;
    }

    /**
     * Get issuancePersianDate
     *
     * @return issuancePersianDate
     **/

    public String getIssuancePersianDate() {
        return issuancePersianDate;
    }

    public void setIssuancePersianDate(String issuancePersianDate) {
        this.issuancePersianDate = issuancePersianDate;
    }

    public Invoice paymentBillNumber(String paymentBillNumber) {
        this.paymentBillNumber = paymentBillNumber;
        return this;
    }

    /**
     * Get paymentBillNumber
     *
     * @return paymentBillNumber
     **/

    public String getPaymentBillNumber() {
        return paymentBillNumber;
    }

    public void setPaymentBillNumber(String paymentBillNumber) {
        this.paymentBillNumber = paymentBillNumber;
    }

    public Invoice transactionReferenceId(String transactionReferenceId) {
        this.transactionReferenceId = transactionReferenceId;
        return this;
    }

    /**
     * Get transactionReferenceId
     *
     * @return transactionReferenceId
     **/

    public String getTransactionReferenceId() {
        return transactionReferenceId;
    }

    public void setTransactionReferenceId(String transactionReferenceId) {
        this.transactionReferenceId = transactionReferenceId;
    }

    public Invoice uniqueNumber(String uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
        return this;
    }

    /**
     * Get uniqueNumber
     *
     * @return uniqueNumber
     **/

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(String uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public Invoice description(String description) {
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

    public Invoice paymentDate(Long paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    /**
     * Get paymentDate
     *
     * @return paymentDate
     **/

    public Long getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Long paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Invoice payed(Boolean payed) {
        this.payed = payed;
        return this;
    }

    /**
     * Get payed
     *
     * @return payed
     **/

    public Boolean isPayed() {
        return payed;
    }

    public void setPayed(Boolean payed) {
        this.payed = payed;
    }

    public Invoice canceled(Boolean canceled) {
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

    public Invoice cancelDate(Long cancelDate) {
        this.cancelDate = cancelDate;
        return this;
    }

    /**
     * Get cancelDate
     *
     * @return cancelDate
     **/

    public Long getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Long cancelDate) {
        this.cancelDate = cancelDate;
    }

    public Invoice business(BusinessSoft business) {
        this.business = business;
        return this;
    }

    /**
     * Get business
     *
     * @return business
     **/

    public BusinessSoft getBusiness() {
        return business;
    }

    public void setBusiness(BusinessSoft business) {
        this.business = business;
    }

    public Invoice invoiceItemSrvs(List<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
        return this;
    }

    public Invoice addInvoiceItemSrvsItem(InvoiceItem invoiceItemSrvsItem) {
        if (this.invoiceItems == null) {
            this.invoiceItems = new ArrayList<InvoiceItem>();
        }
        this.invoiceItems.add(invoiceItemSrvsItem);
        return this;
    }

    /**
     * Get invoiceItemSrvs
     *
     * @return invoiceItemSrvs
     **/

    public List<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(List<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

    public Invoice guildSrv(Guild guild) {
        this.guild = guild;
        return this;
    }

    /**
     * Get guildSrv
     *
     * @return guildSrv
     **/

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public Invoice addressSrv(Address address) {
        this.address = address;
        return this;
    }

    /**
     * Get addressSrv
     *
     * @return addressSrv
     **/

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Invoice userSrv(User user) {
        this.user = user;
        return this;
    }

    /**
     * Get userSrv
     *
     * @return userSrv
     **/

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Invoice phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get phoneNumber
     *
     * @return phoneNumber
     **/

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Invoice cellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
        return this;
    }

    /**
     * Get cellphoneNumber
     *
     * @return cellphoneNumber
     **/

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public Invoice closed(Boolean closed) {
        this.closed = closed;
        return this;
    }

    /**
     * Get closed
     *
     * @return closed
     **/

    public Boolean isClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Invoice invoice = (Invoice) o;
        return Objects.equals(this.id, invoice.id) &&
                Objects.equals(this.totalAmount, invoice.totalAmount) &&
                Objects.equals(this.payableAmount, invoice.payableAmount) &&
                Objects.equals(this.vat, invoice.vat) &&
                Objects.equals(this.issuanceDate, invoice.issuanceDate) &&
                Objects.equals(this.deliveryDate, invoice.deliveryDate) &&
                Objects.equals(this.billNumber, invoice.billNumber) &&
                Objects.equals(this.issuancePersianDate, invoice.issuancePersianDate) &&
                Objects.equals(this.paymentBillNumber, invoice.paymentBillNumber) &&
                Objects.equals(this.transactionReferenceId, invoice.transactionReferenceId) &&
                Objects.equals(this.uniqueNumber, invoice.uniqueNumber) &&
                Objects.equals(this.description, invoice.description) &&
                Objects.equals(this.paymentDate, invoice.paymentDate) &&
                Objects.equals(this.payed, invoice.payed) &&
                Objects.equals(this.canceled, invoice.canceled) &&
                Objects.equals(this.cancelDate, invoice.cancelDate) &&
                Objects.equals(this.business, invoice.business) &&
                Objects.equals(this.invoiceItems, invoice.invoiceItems) &&
                Objects.equals(this.guild, invoice.guild) &&
                Objects.equals(this.address, invoice.address) &&
                Objects.equals(this.user, invoice.user) &&
                Objects.equals(this.phoneNumber, invoice.phoneNumber) &&
                Objects.equals(this.cellphoneNumber, invoice.cellphoneNumber) &&
                Objects.equals(this.closed, invoice.closed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, totalAmount, payableAmount, vat, issuanceDate, deliveryDate, billNumber, issuancePersianDate, paymentBillNumber, transactionReferenceId, uniqueNumber, description, paymentDate, payed, canceled, cancelDate, business, invoiceItems, guild, address, user, phoneNumber, cellphoneNumber, closed);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvoiceSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
        sb.append("    payableAmount: ").append(toIndentedString(payableAmount)).append("\n");
        sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
        sb.append("    issuanceDate: ").append(toIndentedString(issuanceDate)).append("\n");
        sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
        sb.append("    billNumber: ").append(toIndentedString(billNumber)).append("\n");
        sb.append("    issuancePersianDate: ").append(toIndentedString(issuancePersianDate)).append("\n");
        sb.append("    paymentBillNumber: ").append(toIndentedString(paymentBillNumber)).append("\n");
        sb.append("    transactionReferenceId: ").append(toIndentedString(transactionReferenceId)).append("\n");
        sb.append("    uniqueNumber: ").append(toIndentedString(uniqueNumber)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
        sb.append("    payed: ").append(toIndentedString(payed)).append("\n");
        sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
        sb.append("    cancelDate: ").append(toIndentedString(cancelDate)).append("\n");
        sb.append("    business: ").append(toIndentedString(business)).append("\n");
        sb.append("    invoiceItemSrvs: ").append(toIndentedString(invoiceItems)).append("\n");
        sb.append("    guildSrv: ").append(toIndentedString(guild)).append("\n");
        sb.append("    addressSrv: ").append(toIndentedString(address)).append("\n");
        sb.append("    userSrv: ").append(toIndentedString(user)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    cellphoneNumber: ").append(toIndentedString(cellphoneNumber)).append("\n");
        sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
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

