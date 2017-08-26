package org.springframework.social.fanapium.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.social.fanapium.api.model.Item;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/7/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class TimelineItemMixin {

    @JsonProperty("type")
    private Integer type;

    @JsonProperty("item")
    private Item item;
}
