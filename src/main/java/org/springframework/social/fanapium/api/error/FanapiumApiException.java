package org.springframework.social.fanapium.api.error;

import org.springframework.social.SocialException;

@SuppressWarnings("serial")
public class FanapiumApiException extends SocialException {

    private int code;

    public FanapiumApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
