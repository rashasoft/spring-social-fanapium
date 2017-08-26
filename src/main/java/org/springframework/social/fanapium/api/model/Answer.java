/*
 * Fanapium Core API
 * Fanapium B2B2C services
 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AnswerSrv
 */

public class Answer {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("text")
    private String text = null;

    @JsonProperty("count")
    private Integer count = null;

    public Answer id(Long id) {
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

    public Answer text(String text) {
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

    public Answer count(Integer count) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Answer answer = (Answer) o;
        return Objects.equals(this.id, answer.id) &&
                Objects.equals(this.text, answer.text) &&
                Objects.equals(this.count, answer.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, count);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnswerSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

