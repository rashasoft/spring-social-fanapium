package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/7/17.
 */
public class AbstractResponseDTO<T> {

    private Boolean hasError;
    private Integer errorCode;
    private Integer count;
    private String ott;
    private String message;
    private T result;


    @JsonIgnore
    public Boolean isOk() {
        return !getHasError();
    }


    public Boolean getHasError() {
        return hasError;
    }

    public void setHasError(Boolean hasError) {
        this.hasError = hasError;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getOtt() {
        return ott;
    }

    public void setOtt(String ott) {
        this.ott = ott;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            mapper.setDateFormat(new SimpleDateFormat(""));
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {

            return String.valueOf(this);
        }
    }
}
