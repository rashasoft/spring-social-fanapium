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
 * VoucherSrv
 */

public class Voucher {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("active")
    private Boolean active = null;

    @JsonProperty("business")
    private BusinessSoft business = null;

    @JsonProperty("guild")
    private Guild guild = null;

    @JsonProperty("limitedConsumer")
    private User limitedConsumer = null;

    @JsonProperty("consumer")
    private User consumer = null;

    @JsonProperty("hash")
    private String hash = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("creditAmount")
    private Double creditAmount = null;

    @JsonProperty("discountPercentage")
    private Float discountPercentage = null;

    @JsonProperty("creationDate")
    private Long creationDate = null;

    @JsonProperty("expireDate")
    private Long expireDate = null;

    @JsonProperty("productList")
    private List<Product> productList = null;

    @JsonProperty("usedAmount")
    private Double usedAmount = null;

    @JsonProperty("type")
    private Integer type = null;

    @JsonProperty("usageList")
    private List<VoucherUsage> usageList = null;

    @JsonProperty("used")
    private Boolean used = null;

    public Voucher id(Long id) {
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

    public Voucher active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get active
     *
     * @return active
     **/

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Voucher business(BusinessSoft business) {
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

    public Voucher guild(Guild guild) {
        this.guild = guild;
        return this;
    }

    /**
     * Get guild
     *
     * @return guild
     **/

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public Voucher limitedConsumer(User limitedConsumer) {
        this.limitedConsumer = limitedConsumer;
        return this;
    }

    /**
     * Get limitedConsumer
     *
     * @return limitedConsumer
     **/

    public User getLimitedConsumer() {
        return limitedConsumer;
    }

    public void setLimitedConsumer(User limitedConsumer) {
        this.limitedConsumer = limitedConsumer;
    }

    public Voucher consumer(User consumer) {
        this.consumer = consumer;
        return this;
    }

    /**
     * Get consumer
     *
     * @return consumer
     **/

    public User getConsumer() {
        return consumer;
    }

    public void setConsumer(User consumer) {
        this.consumer = consumer;
    }

    public Voucher hash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * Get hash
     *
     * @return hash
     **/

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Voucher name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Voucher description(String description) {
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

    public Voucher creditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    /**
     * Get creditAmount
     *
     * @return creditAmount
     **/

    public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public Voucher discountPercentage(Float discountPercentage) {
        this.discountPercentage = discountPercentage;
        return this;
    }

    /**
     * Get discountPercentage
     *
     * @return discountPercentage
     **/

    public Float getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public Voucher creationDate(Long creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * Get creationDate
     *
     * @return creationDate
     **/

    public Long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }

    public Voucher expireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    /**
     * Get expireDate
     *
     * @return expireDate
     **/

    public Long getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
    }

    public Voucher productList(List<Product> productList) {
        this.productList = productList;
        return this;
    }

    public Voucher addProductListItem(Product productListItem) {
        if (this.productList == null) {
            this.productList = new ArrayList<Product>();
        }
        this.productList.add(productListItem);
        return this;
    }

    /**
     * Get productList
     *
     * @return productList
     **/

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Voucher usedAmount(Double usedAmount) {
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

    public Voucher type(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Voucher usageList(List<VoucherUsage> usageList) {
        this.usageList = usageList;
        return this;
    }

    public Voucher addUsageListItem(VoucherUsage usageListItem) {
        if (this.usageList == null) {
            this.usageList = new ArrayList<VoucherUsage>();
        }
        this.usageList.add(usageListItem);
        return this;
    }

    /**
     * Get usageList
     *
     * @return usageList
     **/

    public List<VoucherUsage> getUsageList() {
        return usageList;
    }

    public void setUsageList(List<VoucherUsage> usageList) {
        this.usageList = usageList;
    }

    public Voucher used(Boolean used) {
        this.used = used;
        return this;
    }

    /**
     * Get used
     *
     * @return used
     **/

    public Boolean isUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Voucher voucher = (Voucher) o;
        return Objects.equals(this.id, voucher.id) &&
                Objects.equals(this.active, voucher.active) &&
                Objects.equals(this.business, voucher.business) &&
                Objects.equals(this.guild, voucher.guild) &&
                Objects.equals(this.limitedConsumer, voucher.limitedConsumer) &&
                Objects.equals(this.consumer, voucher.consumer) &&
                Objects.equals(this.hash, voucher.hash) &&
                Objects.equals(this.name, voucher.name) &&
                Objects.equals(this.description, voucher.description) &&
                Objects.equals(this.creditAmount, voucher.creditAmount) &&
                Objects.equals(this.discountPercentage, voucher.discountPercentage) &&
                Objects.equals(this.creationDate, voucher.creationDate) &&
                Objects.equals(this.expireDate, voucher.expireDate) &&
                Objects.equals(this.productList, voucher.productList) &&
                Objects.equals(this.usedAmount, voucher.usedAmount) &&
                Objects.equals(this.type, voucher.type) &&
                Objects.equals(this.usageList, voucher.usageList) &&
                Objects.equals(this.used, voucher.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, active, business, guild, limitedConsumer, consumer, hash, name, description, creditAmount, discountPercentage, creationDate, expireDate, productList, usedAmount, type, usageList, used);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VoucherSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    business: ").append(toIndentedString(business)).append("\n");
        sb.append("    guild: ").append(toIndentedString(guild)).append("\n");
        sb.append("    limitedConsumer: ").append(toIndentedString(limitedConsumer)).append("\n");
        sb.append("    consumer: ").append(toIndentedString(consumer)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
        sb.append("    discountPercentage: ").append(toIndentedString(discountPercentage)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
        sb.append("    productList: ").append(toIndentedString(productList)).append("\n");
        sb.append("    usedAmount: ").append(toIndentedString(usedAmount)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    usageList: ").append(toIndentedString(usageList)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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

