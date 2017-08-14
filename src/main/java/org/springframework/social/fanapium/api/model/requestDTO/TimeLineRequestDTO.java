package org.springframework.social.fanapium.api.model.requestDTO;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/14/17.
 */
public class TimeLineRequestDTO extends AbstractRequestDTO {

    private String timelineId;
    private String entityId;
    private String query;
    private String firstId;
    private String lastId;
    private String offset;
    private String size;
    private String type;
    private String guildCodes;
    private String metadata;
    private String businessId;

    public TimeLineRequestDTO(String timelineId, String entityId, String query, String firstId, String lastId, String offset, String size, String type, String guildCodes, String metadata, String businessId) {
        this.timelineId = timelineId;
        this.entityId = entityId;
        this.query = query;
        this.firstId = firstId;
        this.lastId = lastId;
        this.offset = offset;
        this.size = size;
        this.type = type;
        this.guildCodes = guildCodes;
        this.metadata = metadata;
        this.businessId = businessId;
    }

    public String getTimelineId() {
        return timelineId;
    }

    public void setTimelineId(String timelineId) {
        this.timelineId = timelineId;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getFirstId() {
        return firstId;
    }

    public void setFirstId(String firstId) {
        this.firstId = firstId;
    }

    public String getLastId() {
        return lastId;
    }

    public void setLastId(String lastId) {
        this.lastId = lastId;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGuildCodes() {
        return guildCodes;
    }

    public void setGuildCodes(String guildCodes) {
        this.guildCodes = guildCodes;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }


}
