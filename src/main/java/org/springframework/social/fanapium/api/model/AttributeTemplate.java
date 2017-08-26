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
 * AttributeTemplateSrv
 */

public class AttributeTemplate {
    @JsonProperty("name")
    private String name = null;

    @JsonProperty("code")
    private String code = null;

    @JsonProperty("attributes")
    private List<Attribute> attributes = null;

    public AttributeTemplate name(String name) {
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

    public AttributeTemplate code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     **/

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public AttributeTemplate attributes(List<Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    public AttributeTemplate addAttributesItem(Attribute attributesItem) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<Attribute>();
        }
        this.attributes.add(attributesItem);
        return this;
    }

    /**
     * Get attributes
     *
     * @return attributes
     **/

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttributeTemplate attributeTemplate = (AttributeTemplate) o;
        return Objects.equals(this.name, attributeTemplate.name) &&
                Objects.equals(this.code, attributeTemplate.code) &&
                Objects.equals(this.attributes, attributeTemplate.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, attributes);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttributeTemplateSrv {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

