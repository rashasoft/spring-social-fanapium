package org.springframework.social.fanapium.api;

import org.springframework.social.ApiBinding;

public interface Fanapium extends ApiBinding {

    UserOperations userOperations();

    WalletOperations walletOperations();
}
