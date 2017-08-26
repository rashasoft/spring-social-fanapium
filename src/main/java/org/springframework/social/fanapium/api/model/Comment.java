/*
 * Fanapium Core API
 * Fanapium B2B2C services

 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CommentSrv
 */

public class Comment {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("text")
    private String text = null;

    @JsonProperty("timestamp")
    private Long timestamp = null;

    @JsonProperty("user")
    private User user = null;

    @JsonProperty("confirmed")
    private Boolean confirmed = null;

    public Comment id(Long id) {
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

    public Comment text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get text
     *
     * @return text
     **/

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Comment timestamp(Long timestamp) {
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

    public Comment user(User user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     *
     * @return user
     **/

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Comment confirmed(Boolean confirmed) {
        this.confirmed = confirmed;
        return this;
    }

    /**
     * Get confirmed
     *
     * @return confirmed
     **/

    public Boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Comment comment = (Comment) o;
        return Objects.equals(this.id, comment.id) &&
                Objects.equals(this.text, comment.text) &&
                Objects.equals(this.timestamp, comment.timestamp) &&
                Objects.equals(this.user, comment.user) &&
                Objects.equals(this.confirmed, comment.confirmed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, timestamp, user, confirmed);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommentSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
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

