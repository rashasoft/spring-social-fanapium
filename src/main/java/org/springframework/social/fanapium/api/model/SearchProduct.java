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
 * SearchProductSrv
 */

public class SearchProduct {
    @JsonProperty("products")
    private List<Product> products = null;

    @JsonProperty("guilds")
    private List<Guild> guilds = null;

    public SearchProduct products(List<Product> products) {
        this.products = products;
        return this;
    }

    public SearchProduct addProductsItem(Product productsItem) {
        if (this.products == null) {
            this.products = new ArrayList<Product>();
        }
        this.products.add(productsItem);
        return this;
    }

    /**
     * Get products
     *
     * @return products
     **/

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public SearchProduct guilds(List<Guild> guilds) {
        this.guilds = guilds;
        return this;
    }

    public SearchProduct addGuildsItem(Guild guildsItem) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchProduct searchProduct = (SearchProduct) o;
        return Objects.equals(this.products, searchProduct.products) &&
                Objects.equals(this.guilds, searchProduct.guilds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, guilds);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchProductSrv {\n");

        sb.append("    products: ").append(toIndentedString(products)).append("\n");
        sb.append("    guilds: ").append(toIndentedString(guilds)).append("\n");
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

