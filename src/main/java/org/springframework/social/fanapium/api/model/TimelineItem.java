/*
 * Fanapium Core API
 * Fanapium B2B2C services

 */


package org.springframework.social.fanapium.api.model;

import java.util.Objects;

/**
 * TimelineItemSrv
 */

public class TimelineItem {

    private Integer type = null;

    private Item item = null;

    public TimelineItem type(Integer type) {
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

    public TimelineItem item(Item item) {
        this.item = item;
        return this;
    }

    /**
     * Get item
     *
     * @return item
     **/

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimelineItem timelineItem = (TimelineItem) o;
        return Objects.equals(this.type, timelineItem.type) &&
                Objects.equals(this.item, timelineItem.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, item);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimelineItemSrv {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

