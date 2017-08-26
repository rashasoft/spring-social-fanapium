/*
 * Fanapium Core API
 * Fanapium B2B2C services

 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InvoiceItemSrv
 */

public class InvoiceItem {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("productSrv")
    private Product product = null;

    @JsonProperty("amount")
    private Long amount = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("quantity")
    private Integer quantity = null;

    public InvoiceItem id(Long id) {
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

    public InvoiceItem productSrv(Product product) {
        this.product = product;
        return this;
    }

    /**
     * Get productSrv
     *
     * @return productSrv
     **/

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public InvoiceItem amount(Long amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public InvoiceItem description(String description) {
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

    public InvoiceItem quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get quantity
     *
     * @return quantity
     **/

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvoiceItem invoiceItem = (InvoiceItem) o;
        return Objects.equals(this.id, invoiceItem.id) &&
                Objects.equals(this.product, invoiceItem.product) &&
                Objects.equals(this.amount, invoiceItem.amount) &&
                Objects.equals(this.description, invoiceItem.description) &&
                Objects.equals(this.quantity, invoiceItem.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, amount, description, quantity);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvoiceItemSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    productSrv: ").append(toIndentedString(product)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

