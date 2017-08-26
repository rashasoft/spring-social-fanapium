package org.springframework.social.fanapium.api;

import org.springframework.social.ApiBinding;

public interface Fanapium extends ApiBinding {

    ChatOperations chatOperations();

    PostOperations postOperations();

    UserOperations userOperations();
}
