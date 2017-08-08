/*
 * Fanapium Core API
 * Fanapium B2B2C services

 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FaqSrv
 */

public class Faq {
    @JsonProperty("question")
    private String question = null;

    @JsonProperty("answer")
    private String answer = null;

    public Faq question(String question) {
        this.question = question;
        return this;
    }

    /**
     * Get question
     *
     * @return question
     **/

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Faq answer(String answer) {
        this.answer = answer;
        return this;
    }

    /**
     * Get answer
     *
     * @return answer
     **/

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Faq faq = (Faq) o;
        return Objects.equals(this.question, faq.question) &&
                Objects.equals(this.answer, faq.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FaqSrv {\n");

        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
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

