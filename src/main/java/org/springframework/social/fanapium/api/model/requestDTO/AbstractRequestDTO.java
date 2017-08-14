package org.springframework.social.fanapium.api.model.requestDTO;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/14/17.
 */
public abstract class AbstractRequestDTO {

    public Map<String, String> getMap() {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> map = objectMapper.convertValue(this, Map.class);
        return map;
    }
}
