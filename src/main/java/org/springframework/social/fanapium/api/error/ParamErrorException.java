package org.springframework.social.fanapium.api.error;

public class ParamErrorException extends FanapiumApiException {

    private static final long serialVersionUID = 1L;

    public ParamErrorException(int code, String errorType, String message) {
        super(code, message);
    }

}
