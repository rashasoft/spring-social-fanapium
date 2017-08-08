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
 * CompetitionSrv
 */

public class Competition {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("timelineId")
    private Long timelineId = null;

    @JsonProperty("entityId")
    private Long entityId = null;

    @JsonProperty("numOfLikes")
    private Integer numOfLikes = null;

    @JsonProperty("numOfFavorites")
    private Integer numOfFavorites = null;

    @JsonProperty("numOfComments")
    private Integer numOfComments = null;

    @JsonProperty("timestamp")
    private Long timestamp = null;

    @JsonProperty("enable")
    private Boolean enable = null;

    @JsonProperty("hide")
    private Boolean hide = null;

    @JsonProperty("business")
    private BusinessSoft business = null;

    @JsonProperty("userPostInfo")
    private UserPostInfo userPostInfo = null;

    @JsonProperty("metadata")
    private String metadata = null;

    @JsonProperty("latitude")
    private Double latitude = null;

    @JsonProperty("longitude")
    private Double longitude = null;

    @JsonProperty("canComment")
    private Boolean canComment = null;

    @JsonProperty("canLike")
    private Boolean canLike = null;

    @JsonProperty("tags")
    private List<String> tags = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("text")
    private String text = null;

    @JsonProperty("open")
    private Boolean open = null;

    @JsonProperty("confirmed")
    private Boolean confirmed = null;

    @JsonProperty("answerList")
    private List<Answer> answerList = null;

    @JsonProperty("startDate")
    private Long startDate = null;

    @JsonProperty("endDate")
    private Long endDate = null;

    @JsonProperty("subscriptionCount")
    private Integer subscriptionCount = null;

    @JsonProperty("correctAnswerIndex")
    private Integer correctAnswerIndex = null;

    @JsonProperty("awardSrvs")
    private List<Award> awards = null;

    @JsonProperty("awardCount")
    private Long awardCount = null;

    @JsonProperty("awardUserCount")
    private Long awardUserCount = null;

    @JsonProperty("lotteryId")
    private Long lotteryId = null;

    @JsonProperty("selected")
    private Integer selected = null;

    @JsonProperty("guildSrv")
    private Guild guild = null;

    @JsonProperty("costAmount")
    private Double costAmount = null;

    @JsonProperty("blockAmount")
    private Double blockAmount = null;

    @JsonProperty("done")
    private Boolean done = null;

    @JsonProperty("canceled")
    private Boolean canceled = null;

    @JsonProperty("currency")
    private Currency currency = null;

    public Competition id(Long id) {
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

    public Competition timelineId(Long timelineId) {
        this.timelineId = timelineId;
        return this;
    }

    /**
     * Get timelineId
     *
     * @return timelineId
     **/

    public Long getTimelineId() {
        return timelineId;
    }

    public void setTimelineId(Long timelineId) {
        this.timelineId = timelineId;
    }

    public Competition entityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Get entityId
     *
     * @return entityId
     **/

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Competition numOfLikes(Integer numOfLikes) {
        this.numOfLikes = numOfLikes;
        return this;
    }

    /**
     * Get numOfLikes
     *
     * @return numOfLikes
     **/

    public Integer getNumOfLikes() {
        return numOfLikes;
    }

    public void setNumOfLikes(Integer numOfLikes) {
        this.numOfLikes = numOfLikes;
    }

    public Competition numOfFavorites(Integer numOfFavorites) {
        this.numOfFavorites = numOfFavorites;
        return this;
    }

    /**
     * Get numOfFavorites
     *
     * @return numOfFavorites
     **/

    public Integer getNumOfFavorites() {
        return numOfFavorites;
    }

    public void setNumOfFavorites(Integer numOfFavorites) {
        this.numOfFavorites = numOfFavorites;
    }

    public Competition numOfComments(Integer numOfComments) {
        this.numOfComments = numOfComments;
        return this;
    }

    /**
     * Get numOfComments
     *
     * @return numOfComments
     **/

    public Integer getNumOfComments() {
        return numOfComments;
    }

    public void setNumOfComments(Integer numOfComments) {
        this.numOfComments = numOfComments;
    }

    public Competition timestamp(Long timestamp) {
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

    public Competition enable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * Get enable
     *
     * @return enable
     **/

    public Boolean isEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Competition hide(Boolean hide) {
        this.hide = hide;
        return this;
    }

    /**
     * Get hide
     *
     * @return hide
     **/

    public Boolean isHide() {
        return hide;
    }

    public void setHide(Boolean hide) {
        this.hide = hide;
    }

    public Competition business(BusinessSoft business) {
        this.business = business;
        return this;
    }

    /**
     * Get business
     *
     * @return business
     **/

    public BusinessSoft getBusiness() {
        return business;
    }

    public void setBusiness(BusinessSoft business) {
        this.business = business;
    }

    public Competition userPostInfo(UserPostInfo userPostInfo) {
        this.userPostInfo = userPostInfo;
        return this;
    }

    /**
     * Get userPostInfo
     *
     * @return userPostInfo
     **/

    public UserPostInfo getUserPostInfo() {
        return userPostInfo;
    }

    public void setUserPostInfo(UserPostInfo userPostInfo) {
        this.userPostInfo = userPostInfo;
    }

    public Competition metadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get metadata
     *
     * @return metadata
     **/

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public Competition latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Get latitude
     *
     * @return latitude
     **/

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Competition longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Get longitude
     *
     * @return longitude
     **/

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Competition canComment(Boolean canComment) {
        this.canComment = canComment;
        return this;
    }

    /**
     * Get canComment
     *
     * @return canComment
     **/

    public Boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(Boolean canComment) {
        this.canComment = canComment;
    }

    public Competition canLike(Boolean canLike) {
        this.canLike = canLike;
        return this;
    }

    /**
     * Get canLike
     *
     * @return canLike
     **/

    public Boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(Boolean canLike) {
        this.canLike = canLike;
    }

    public Competition tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public Competition addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<String>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Get tags
     *
     * @return tags
     **/

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Competition type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Competition text(String text) {
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

    public Competition open(Boolean open) {
        this.open = open;
        return this;
    }

    /**
     * Get open
     *
     * @return open
     **/

    public Boolean isOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Competition confirmed(Boolean confirmed) {
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

    public Competition answerList(List<Answer> answerList) {
        this.answerList = answerList;
        return this;
    }

    public Competition addAnswerListItem(Answer answerListItem) {
        if (this.answerList == null) {
            this.answerList = new ArrayList<Answer>();
        }
        this.answerList.add(answerListItem);
        return this;
    }

    /**
     * Get answerList
     *
     * @return answerList
     **/

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    public Competition startDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get startDate
     *
     * @return startDate
     **/

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Competition endDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get endDate
     *
     * @return endDate
     **/

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public Competition subscriptionCount(Integer subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
        return this;
    }

    /**
     * Get subscriptionCount
     *
     * @return subscriptionCount
     **/

    public Integer getSubscriptionCount() {
        return subscriptionCount;
    }

    public void setSubscriptionCount(Integer subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
    }

    public Competition correctAnswerIndex(Integer correctAnswerIndex) {
        this.correctAnswerIndex = correctAnswerIndex;
        return this;
    }

    /**
     * Get correctAnswerIndex
     *
     * @return correctAnswerIndex
     **/

    public Integer getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public void setCorrectAnswerIndex(Integer correctAnswerIndex) {
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public Competition awardSrvs(List<Award> awards) {
        this.awards = awards;
        return this;
    }

    public Competition addAwardSrvsItem(Award awardSrvsItem) {
        if (this.awards == null) {
            this.awards = new ArrayList<Award>();
        }
        this.awards.add(awardSrvsItem);
        return this;
    }

    /**
     * Get awardSrvs
     *
     * @return awardSrvs
     **/

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }

    public Competition awardCount(Long awardCount) {
        this.awardCount = awardCount;
        return this;
    }

    /**
     * Get awardCount
     *
     * @return awardCount
     **/

    public Long getAwardCount() {
        return awardCount;
    }

    public void setAwardCount(Long awardCount) {
        this.awardCount = awardCount;
    }

    public Competition awardUserCount(Long awardUserCount) {
        this.awardUserCount = awardUserCount;
        return this;
    }

    /**
     * Get awardUserCount
     *
     * @return awardUserCount
     **/

    public Long getAwardUserCount() {
        return awardUserCount;
    }

    public void setAwardUserCount(Long awardUserCount) {
        this.awardUserCount = awardUserCount;
    }

    public Competition lotteryId(Long lotteryId) {
        this.lotteryId = lotteryId;
        return this;
    }

    /**
     * Get lotteryId
     *
     * @return lotteryId
     **/

    public Long getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(Long lotteryId) {
        this.lotteryId = lotteryId;
    }

    public Competition selected(Integer selected) {
        this.selected = selected;
        return this;
    }

    /**
     * Get selected
     *
     * @return selected
     **/

    public Integer getSelected() {
        return selected;
    }

    public void setSelected(Integer selected) {
        this.selected = selected;
    }

    public Competition guildSrv(Guild guild) {
        this.guild = guild;
        return this;
    }

    /**
     * Get guildSrv
     *
     * @return guildSrv
     **/

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public Competition costAmount(Double costAmount) {
        this.costAmount = costAmount;
        return this;
    }

    /**
     * Get costAmount
     *
     * @return costAmount
     **/

    public Double getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(Double costAmount) {
        this.costAmount = costAmount;
    }

    public Competition blockAmount(Double blockAmount) {
        this.blockAmount = blockAmount;
        return this;
    }

    /**
     * Get blockAmount
     *
     * @return blockAmount
     **/

    public Double getBlockAmount() {
        return blockAmount;
    }

    public void setBlockAmount(Double blockAmount) {
        this.blockAmount = blockAmount;
    }

    public Competition done(Boolean done) {
        this.done = done;
        return this;
    }

    /**
     * Get done
     *
     * @return done
     **/

    public Boolean isDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Competition canceled(Boolean canceled) {
        this.canceled = canceled;
        return this;
    }

    /**
     * Get canceled
     *
     * @return canceled
     **/

    public Boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(Boolean canceled) {
        this.canceled = canceled;
    }

    public Competition currency(Currency currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     **/

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Competition competition = (Competition) o;
        return Objects.equals(this.id, competition.id) &&
                Objects.equals(this.timelineId, competition.timelineId) &&
                Objects.equals(this.entityId, competition.entityId) &&
                Objects.equals(this.numOfLikes, competition.numOfLikes) &&
                Objects.equals(this.numOfFavorites, competition.numOfFavorites) &&
                Objects.equals(this.numOfComments, competition.numOfComments) &&
                Objects.equals(this.timestamp, competition.timestamp) &&
                Objects.equals(this.enable, competition.enable) &&
                Objects.equals(this.hide, competition.hide) &&
                Objects.equals(this.business, competition.business) &&
                Objects.equals(this.userPostInfo, competition.userPostInfo) &&
                Objects.equals(this.metadata, competition.metadata) &&
                Objects.equals(this.latitude, competition.latitude) &&
                Objects.equals(this.longitude, competition.longitude) &&
                Objects.equals(this.canComment, competition.canComment) &&
                Objects.equals(this.canLike, competition.canLike) &&
                Objects.equals(this.tags, competition.tags) &&
                Objects.equals(this.type, competition.type) &&
                Objects.equals(this.text, competition.text) &&
                Objects.equals(this.open, competition.open) &&
                Objects.equals(this.confirmed, competition.confirmed) &&
                Objects.equals(this.answerList, competition.answerList) &&
                Objects.equals(this.startDate, competition.startDate) &&
                Objects.equals(this.endDate, competition.endDate) &&
                Objects.equals(this.subscriptionCount, competition.subscriptionCount) &&
                Objects.equals(this.correctAnswerIndex, competition.correctAnswerIndex) &&
                Objects.equals(this.awards, competition.awards) &&
                Objects.equals(this.awardCount, competition.awardCount) &&
                Objects.equals(this.awardUserCount, competition.awardUserCount) &&
                Objects.equals(this.lotteryId, competition.lotteryId) &&
                Objects.equals(this.selected, competition.selected) &&
                Objects.equals(this.guild, competition.guild) &&
                Objects.equals(this.costAmount, competition.costAmount) &&
                Objects.equals(this.blockAmount, competition.blockAmount) &&
                Objects.equals(this.done, competition.done) &&
                Objects.equals(this.canceled, competition.canceled) &&
                Objects.equals(this.currency, competition.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, timelineId, entityId, numOfLikes, numOfFavorites, numOfComments, timestamp, enable, hide, business, userPostInfo, metadata, latitude, longitude, canComment, canLike, tags, type, text, open, confirmed, answerList, startDate, endDate, subscriptionCount, correctAnswerIndex, awards, awardCount, awardUserCount, lotteryId, selected, guild, costAmount, blockAmount, done, canceled, currency);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompetitionSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    timelineId: ").append(toIndentedString(timelineId)).append("\n");
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    numOfLikes: ").append(toIndentedString(numOfLikes)).append("\n");
        sb.append("    numOfFavorites: ").append(toIndentedString(numOfFavorites)).append("\n");
        sb.append("    numOfComments: ").append(toIndentedString(numOfComments)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    hide: ").append(toIndentedString(hide)).append("\n");
        sb.append("    business: ").append(toIndentedString(business)).append("\n");
        sb.append("    userPostInfo: ").append(toIndentedString(userPostInfo)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    canComment: ").append(toIndentedString(canComment)).append("\n");
        sb.append("    canLike: ").append(toIndentedString(canLike)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    open: ").append(toIndentedString(open)).append("\n");
        sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
        sb.append("    answerList: ").append(toIndentedString(answerList)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    subscriptionCount: ").append(toIndentedString(subscriptionCount)).append("\n");
        sb.append("    correctAnswerIndex: ").append(toIndentedString(correctAnswerIndex)).append("\n");
        sb.append("    awardSrvs: ").append(toIndentedString(awards)).append("\n");
        sb.append("    awardCount: ").append(toIndentedString(awardCount)).append("\n");
        sb.append("    awardUserCount: ").append(toIndentedString(awardUserCount)).append("\n");
        sb.append("    lotteryId: ").append(toIndentedString(lotteryId)).append("\n");
        sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
        sb.append("    guildSrv: ").append(toIndentedString(guild)).append("\n");
        sb.append("    costAmount: ").append(toIndentedString(costAmount)).append("\n");
        sb.append("    blockAmount: ").append(toIndentedString(blockAmount)).append("\n");
        sb.append("    done: ").append(toIndentedString(done)).append("\n");
        sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

