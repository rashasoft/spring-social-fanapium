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
 * ProductSrv
 */

public class Product {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("timelineId")
    private Long timelineId = null;

    @JsonProperty("entityId")
    private Long entityId = null;

    @JsonProperty("numOfLikes")
    private Integer numOfLikes = null;

    @JsonProperty("numOfFavorites")
    private Integer numOfFavorites = null;

    @JsonProperty("numOfComments")
    private Integer numOfComments = null;

    @JsonProperty("timestamp")
    private Long timestamp = null;

    @JsonProperty("enable")
    private Boolean enable = null;

    @JsonProperty("hide")
    private Boolean hide = null;

    @JsonProperty("business")
    private BusinessSoft business = null;

    @JsonProperty("userPostInfo")
    private UserPostInfo userPostInfo = null;

    @JsonProperty("metadata")
    private String metadata = null;

    @JsonProperty("latitude")
    private Double latitude = null;

    @JsonProperty("longitude")
    private Double longitude = null;

    @JsonProperty("canComment")
    private Boolean canComment = null;

    @JsonProperty("canLike")
    private Boolean canLike = null;

    @JsonProperty("tags")
    private List<String> tags = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("categoryList")
    private List<String> categoryList = null;

    @JsonProperty("previewInfo")
    private ImageInfo previewInfo = null;

    @JsonProperty("preview")
    private String preview = null;

    @JsonProperty("availableCount")
    private Integer availableCount = null;

    @JsonProperty("price")
    private Long price = null;

    @JsonProperty("discount")
    private Long discount = null;

    @JsonProperty("rate")
    private Rate rate = null;

    @JsonProperty("saleInfo")
    private SaleInfo saleInfo = null;

    @JsonProperty("attributeValues")
    private List<AttributeValue> attributeValues = null;

    @JsonProperty("guilds")
    private List<Guild> guilds = null;

    @JsonProperty("templateCode")
    private String templateCode = null;

    @JsonProperty("subProducts")
    private List<SubProduct> subProducts = null;

    @JsonProperty("productGroup")
    private ProductGroup productGroup = null;

    @JsonProperty("content")
    private String content = null;

    @JsonProperty("currency")
    private Currency currency = null;

    public Product id(Long id) {
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

    public Product timelineId(Long timelineId) {
        this.timelineId = timelineId;
        return this;
    }

    /**
     * Get timelineId
     *
     * @return timelineId
     **/

    public Long getTimelineId() {
        return timelineId;
    }

    public void setTimelineId(Long timelineId) {
        this.timelineId = timelineId;
    }

    public Product entityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Get entityId
     *
     * @return entityId
     **/

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Product numOfLikes(Integer numOfLikes) {
        this.numOfLikes = numOfLikes;
        return this;
    }

    /**
     * Get numOfLikes
     *
     * @return numOfLikes
     **/

    public Integer getNumOfLikes() {
        return numOfLikes;
    }

    public void setNumOfLikes(Integer numOfLikes) {
        this.numOfLikes = numOfLikes;
    }

    public Product numOfFavorites(Integer numOfFavorites) {
        this.numOfFavorites = numOfFavorites;
        return this;
    }

    /**
     * Get numOfFavorites
     *
     * @return numOfFavorites
     **/

    public Integer getNumOfFavorites() {
        return numOfFavorites;
    }

    public void setNumOfFavorites(Integer numOfFavorites) {
        this.numOfFavorites = numOfFavorites;
    }

    public Product numOfComments(Integer numOfComments) {
        this.numOfComments = numOfComments;
        return this;
    }

    /**
     * Get numOfComments
     *
     * @return numOfComments
     **/

    public Integer getNumOfComments() {
        return numOfComments;
    }

    public void setNumOfComments(Integer numOfComments) {
        this.numOfComments = numOfComments;
    }

    public Product timestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     **/

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Product enable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * Get enable
     *
     * @return enable
     **/

    public Boolean isEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Product hide(Boolean hide) {
        this.hide = hide;
        return this;
    }

    /**
     * Get hide
     *
     * @return hide
     **/

    public Boolean isHide() {
        return hide;
    }

    public void setHide(Boolean hide) {
        this.hide = hide;
    }

    public Product business(BusinessSoft business) {
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

    public Product userPostInfo(UserPostInfo userPostInfo) {
        this.userPostInfo = userPostInfo;
        return this;
    }

    /**
     * Get userPostInfo
     *
     * @return userPostInfo
     **/

    public UserPostInfo getUserPostInfo() {
        return userPostInfo;
    }

    public void setUserPostInfo(UserPostInfo userPostInfo) {
        this.userPostInfo = userPostInfo;
    }

    public Product metadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get metadata
     *
     * @return metadata
     **/

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public Product latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Get latitude
     *
     * @return latitude
     **/

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Product longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Get longitude
     *
     * @return longitude
     **/

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Product canComment(Boolean canComment) {
        this.canComment = canComment;
        return this;
    }

    /**
     * Get canComment
     *
     * @return canComment
     **/

    public Boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(Boolean canComment) {
        this.canComment = canComment;
    }

    public Product canLike(Boolean canLike) {
        this.canLike = canLike;
        return this;
    }

    /**
     * Get canLike
     *
     * @return canLike
     **/

    public Boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(Boolean canLike) {
        this.canLike = canLike;
    }

    public Product tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public Product addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<String>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Get tags
     *
     * @return tags
     **/

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Product name(String name) {
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

    public Product description(String description) {
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

    public Product categoryList(List<String> categoryList) {
        this.categoryList = categoryList;
        return this;
    }

    public Product addCategoryListItem(String categoryListItem) {
        if (this.categoryList == null) {
            this.categoryList = new ArrayList<String>();
        }
        this.categoryList.add(categoryListItem);
        return this;
    }

    /**
     * Get categoryList
     *
     * @return categoryList
     **/

    public List<String> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<String> categoryList) {
        this.categoryList = categoryList;
    }

    public Product previewInfo(ImageInfo previewInfo) {
        this.previewInfo = previewInfo;
        return this;
    }

    /**
     * Get previewInfo
     *
     * @return previewInfo
     **/

    public ImageInfo getPreviewInfo() {
        return previewInfo;
    }

    public void setPreviewInfo(ImageInfo previewInfo) {
        this.previewInfo = previewInfo;
    }

    public Product preview(String preview) {
        this.preview = preview;
        return this;
    }

    /**
     * Get preview
     *
     * @return preview
     **/

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public Product availableCount(Integer availableCount) {
        this.availableCount = availableCount;
        return this;
    }

    /**
     * Get availableCount
     *
     * @return availableCount
     **/

    public Integer getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(Integer availableCount) {
        this.availableCount = availableCount;
    }

    public Product price(Long price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     **/

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Product discount(Long discount) {
        this.discount = discount;
        return this;
    }

    /**
     * Get discount
     *
     * @return discount
     **/

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public Product rate(Rate rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Get rate
     *
     * @return rate
     **/

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public Product saleInfo(SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
        return this;
    }

    /**
     * Get saleInfo
     *
     * @return saleInfo
     **/

    public SaleInfo getSaleInfo() {
        return saleInfo;
    }

    public void setSaleInfo(SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    public Product attributeValues(List<AttributeValue> attributeValues) {
        this.attributeValues = attributeValues;
        return this;
    }

    public Product addAttributeValuesItem(AttributeValue attributeValuesItem) {
        if (this.attributeValues == null) {
            this.attributeValues = new ArrayList<AttributeValue>();
        }
        this.attributeValues.add(attributeValuesItem);
        return this;
    }

    /**
     * Get attributeValues
     *
     * @return attributeValues
     **/

    public List<AttributeValue> getAttributeValues() {
        return attributeValues;
    }

    public void setAttributeValues(List<AttributeValue> attributeValues) {
        this.attributeValues = attributeValues;
    }

    public Product guilds(List<Guild> guilds) {
        this.guilds = guilds;
        return this;
    }

    public Product addGuildsItem(Guild guildsItem) {
        if (this.guilds == null) {
            this.guilds = new ArrayList<Guild>();
        }
        this.guilds.add(guildsItem);
        return this;
    }

    /**
     * Get guilds
     *
     * @return guilds
     **/

    public List<Guild> getGuilds() {
        return guilds;
    }

    public void setGuilds(List<Guild> guilds) {
        this.guilds = guilds;
    }

    public Product templateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }

    /**
     * Get templateCode
     *
     * @return templateCode
     **/

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public Product subProducts(List<SubProduct> subProducts) {
        this.subProducts = subProducts;
        return this;
    }

    public Product addSubProductsItem(SubProduct subProductsItem) {
        if (this.subProducts == null) {
            this.subProducts = new ArrayList<SubProduct>();
        }
        this.subProducts.add(subProductsItem);
        return this;
    }

    /**
     * Get subProducts
     *
     * @return subProducts
     **/

    public List<SubProduct> getSubProducts() {
        return subProducts;
    }

    public void setSubProducts(List<SubProduct> subProducts) {
        this.subProducts = subProducts;
    }

    public Product productGroup(ProductGroup productGroup) {
        this.productGroup = productGroup;
        return this;
    }

    /**
     * Get productGroup
     *
     * @return productGroup
     **/

    public ProductGroup getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(ProductGroup productGroup) {
        this.productGroup = productGroup;
    }

    public Product content(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get content
     *
     * @return content
     **/

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Product currency(Currency currency) {
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
        Product product = (Product) o;
        return Objects.equals(this.id, product.id) &&
                Objects.equals(this.timelineId, product.timelineId) &&
                Objects.equals(this.entityId, product.entityId) &&
                Objects.equals(this.numOfLikes, product.numOfLikes) &&
                Objects.equals(this.numOfFavorites, product.numOfFavorites) &&
                Objects.equals(this.numOfComments, product.numOfComments) &&
                Objects.equals(this.timestamp, product.timestamp) &&
                Objects.equals(this.enable, product.enable) &&
                Objects.equals(this.hide, product.hide) &&
                Objects.equals(this.business, product.business) &&
                Objects.equals(this.userPostInfo, product.userPostInfo) &&
                Objects.equals(this.metadata, product.metadata) &&
                Objects.equals(this.latitude, product.latitude) &&
                Objects.equals(this.longitude, product.longitude) &&
                Objects.equals(this.canComment, product.canComment) &&
                Objects.equals(this.canLike, product.canLike) &&
                Objects.equals(this.tags, product.tags) &&
                Objects.equals(this.name, product.name) &&
                Objects.equals(this.description, product.description) &&
                Objects.equals(this.categoryList, product.categoryList) &&
                Objects.equals(this.previewInfo, product.previewInfo) &&
                Objects.equals(this.preview, product.preview) &&
                Objects.equals(this.availableCount, product.availableCount) &&
                Objects.equals(this.price, product.price) &&
                Objects.equals(this.discount, product.discount) &&
                Objects.equals(this.rate, product.rate) &&
                Objects.equals(this.saleInfo, product.saleInfo) &&
                Objects.equals(this.attributeValues, product.attributeValues) &&
                Objects.equals(this.guilds, product.guilds) &&
                Objects.equals(this.templateCode, product.templateCode) &&
                Objects.equals(this.subProducts, product.subProducts) &&
                Objects.equals(this.productGroup, product.productGroup) &&
                Objects.equals(this.content, product.content) &&
                Objects.equals(this.currency, product.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, timelineId, entityId, numOfLikes, numOfFavorites, numOfComments, timestamp, enable, hide, business, userPostInfo, metadata, latitude, longitude, canComment, canLike, tags, name, description, categoryList, previewInfo, preview, availableCount, price, discount, rate, saleInfo, attributeValues, guilds, templateCode, subProducts, productGroup, content, currency);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    timelineId: ").append(toIndentedString(timelineId)).append("\n");
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    numOfLikes: ").append(toIndentedString(numOfLikes)).append("\n");
        sb.append("    numOfFavorites: ").append(toIndentedString(numOfFavorites)).append("\n");
        sb.append("    numOfComments: ").append(toIndentedString(numOfComments)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    hide: ").append(toIndentedString(hide)).append("\n");
        sb.append("    business: ").append(toIndentedString(business)).append("\n");
        sb.append("    userPostInfo: ").append(toIndentedString(userPostInfo)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    canComment: ").append(toIndentedString(canComment)).append("\n");
        sb.append("    canLike: ").append(toIndentedString(canLike)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    categoryList: ").append(toIndentedString(categoryList)).append("\n");
        sb.append("    previewInfo: ").append(toIndentedString(previewInfo)).append("\n");
        sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
        sb.append("    availableCount: ").append(toIndentedString(availableCount)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    saleInfo: ").append(toIndentedString(saleInfo)).append("\n");
        sb.append("    attributeValues: ").append(toIndentedString(attributeValues)).append("\n");
        sb.append("    guilds: ").append(toIndentedString(guilds)).append("\n");
        sb.append("    templateCode: ").append(toIndentedString(templateCode)).append("\n");
        sb.append("    subProducts: ").append(toIndentedString(subProducts)).append("\n");
        sb.append("    productGroup: ").append(toIndentedString(productGroup)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

