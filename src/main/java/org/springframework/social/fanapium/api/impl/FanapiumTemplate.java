package org.springframework.social.fanapium.api.impl;

import org.springframework.social.fanapium.api.Fanapium;
import org.springframework.social.fanapium.api.UserOperations;
import org.springframework.social.fanapium.api.WalletOperations;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.support.ClientHttpRequestFactorySelector;

public class FanapiumTemplate extends AbstractOAuth2ApiBinding implements Fanapium {
    private UserOperations userOperations;
    private WalletOperations walletOperations;

    public FanapiumTemplate(String accessToken) {
        super(accessToken);
        wrapRequestFactory();
        initSubApis();
    }

    public UserOperations userOperations() {
        return userOperations;
    }

    public WalletOperations walletOperations() {
        return walletOperations;
    }

    private void wrapRequestFactory() {
        super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(getRestTemplate().getRequestFactory()));
    }

    private void initSubApis() {
        userOperations = new UserTemplate(getRestTemplate());
        walletOperations = new WalletTemplate(getRestTemplate());
    }
}
