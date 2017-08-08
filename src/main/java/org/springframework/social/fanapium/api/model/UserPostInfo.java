/*
 * Fanapium Core API
 * Fanapium B2B2C services

 */


package org.springframework.social.fanapium.api.model;

import java.util.Objects;

/**
 * UserPostInfoSrv
 */

public class UserPostInfo {

    private Long postId = null;

    private Boolean liked = null;

    private Boolean favorite = null;

    public UserPostInfo postId(Long postId) {
        this.postId = postId;
        return this;
    }

    /**
     * Get postId
     *
     * @return postId
     **/

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public UserPostInfo liked(Boolean liked) {
        this.liked = liked;
        return this;
    }

    /**
     * Get liked
     *
     * @return liked
     **/

    public Boolean isLiked() {
        return liked;
    }

    public void setLiked(Boolean liked) {
        this.liked = liked;
    }

    public UserPostInfo favorite(Boolean favorite) {
        this.favorite = favorite;
        return this;
    }

    /**
     * Get favorite
     *
     * @return favorite
     **/

    public Boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserPostInfo userPostInfo = (UserPostInfo) o;
        return Objects.equals(this.postId, userPostInfo.postId) &&
                Objects.equals(this.liked, userPostInfo.liked) &&
                Objects.equals(this.favorite, userPostInfo.favorite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, liked, favorite);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserPostInfoSrv {\n");

        sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
        sb.append("    liked: ").append(toIndentedString(liked)).append("\n");
        sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
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

