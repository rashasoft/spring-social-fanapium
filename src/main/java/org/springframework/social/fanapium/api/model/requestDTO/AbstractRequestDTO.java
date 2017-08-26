package org.springframework.social.fanapium.api.model.requestDTO;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.validation.Validator;
import java.util.Map;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/14/17.
 */
public abstract class AbstractRequestDTO {


    private Validator validator;

    public Boolean validate() {
        validator.validate(this);
        return false;
    }

    public Map<String, String> getMap() {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> map = objectMapper.convertValue(this, Map.class);
        return map;
    }
}
