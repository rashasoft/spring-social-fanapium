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
 * ProductGroupSrv
 */

public class ProductGroup {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("sharedAttributeCodes")
    private List<String> sharedAttributeCodes = null;

    public ProductGroup id(Long id) {
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

    public ProductGroup sharedAttributeCodes(List<String> sharedAttributeCodes) {
        this.sharedAttributeCodes = sharedAttributeCodes;
        return this;
    }

    public ProductGroup addSharedAttributeCodesItem(String sharedAttributeCodesItem) {
        if (this.sharedAttributeCodes == null) {
            this.sharedAttributeCodes = new ArrayList<String>();
        }
        this.sharedAttributeCodes.add(sharedAttributeCodesItem);
        return this;
    }

    /**
     * Get sharedAttributeCodes
     *
     * @return sharedAttributeCodes
     **/

    public List<String> getSharedAttributeCodes() {
        return sharedAttributeCodes;
    }

    public void setSharedAttributeCodes(List<String> sharedAttributeCodes) {
        this.sharedAttributeCodes = sharedAttributeCodes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductGroup productGroup = (ProductGroup) o;
        return Objects.equals(this.id, productGroup.id) &&
                Objects.equals(this.sharedAttributeCodes, productGroup.sharedAttributeCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sharedAttributeCodes);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductGroupSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sharedAttributeCodes: ").append(toIndentedString(sharedAttributeCodes)).append("\n");
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

