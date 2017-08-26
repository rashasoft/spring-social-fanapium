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
 * AwardSrv
 */

public class Award {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("value")
    private Double value = null;

    @JsonProperty("count")
    private Integer count = null;

    @JsonProperty("userSrvs")
    private List<User> users = null;

    @JsonProperty("userCount")
    private Long userCount = null;

    @JsonProperty("cash")
    private Boolean cash = null;

    public Award id(Long id) {
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

    public Award description(String description) {
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

    public Award value(Double value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     **/

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Award count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get count
     *
     * @return count
     **/

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Award userSrvs(List<User> users) {
        this.users = users;
        return this;
    }

    public Award addUserSrvsItem(User userSrvsItem) {
        if (this.users == null) {
            this.users = new ArrayList<User>();
        }
        this.users.add(userSrvsItem);
        return this;
    }

    /**
     * Get userSrvs
     *
     * @return userSrvs
     **/

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Award userCount(Long userCount) {
        this.userCount = userCount;
        return this;
    }

    /**
     * Get userCount
     *
     * @return userCount
     **/

    public Long getUserCount() {
        return userCount;
    }

    public void setUserCount(Long userCount) {
        this.userCount = userCount;
    }

    public Award cash(Boolean cash) {
        this.cash = cash;
        return this;
    }

    /**
     * Get cash
     *
     * @return cash
     **/

    public Boolean isCash() {
        return cash;
    }

    public void setCash(Boolean cash) {
        this.cash = cash;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Award award = (Award) o;
        return Objects.equals(this.id, award.id) &&
                Objects.equals(this.description, award.description) &&
                Objects.equals(this.value, award.value) &&
                Objects.equals(this.count, award.count) &&
                Objects.equals(this.users, award.users) &&
                Objects.equals(this.userCount, award.userCount) &&
                Objects.equals(this.cash, award.cash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, value, count, users, userCount, cash);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AwardSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    userSrvs: ").append(toIndentedString(users)).append("\n");
        sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
        sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
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

