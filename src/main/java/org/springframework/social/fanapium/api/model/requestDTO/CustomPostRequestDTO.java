package org.springframework.social.fanapium.api.model.requestDTO;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/14/17.
 */
public class CustomPostRequestDTO extends AbstractRequestDTO {

    String[] categories;
    private String name;
    private String content;
    private String canComment;
    private String canLike;
    private String enable;
    private String metadata;
    private String tags;

    public CustomPostRequestDTO(String name, String content, String[] categories, String canComment, String canLike, String enable, String metadata, String tags) {
        this.name = name;
        this.content = content;
        this.categories = categories;
        this.canComment = canComment;
        this.canLike = canLike;
        this.enable = enable;
        this.metadata = metadata;
        this.tags = tags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public String getCanComment() {
        return canComment;
    }

    public void setCanComment(String canComment) {
        this.canComment = canComment;
    }

    public String getCanLike() {
        return canLike;
    }

    public void setCanLike(String canLike) {
        this.canLike = canLike;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
