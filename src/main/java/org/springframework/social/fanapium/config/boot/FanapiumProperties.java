package org.springframework.social.fanapium.config.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("spring.social.fanapium")
public class FanapiumProperties {
    private String clientId;
    private String clientSecret;
    private String clientToken;
    private String ssoAddress;
    private String platformAddress;
    private String privateAddress;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public String getSsoAddress() {
        return ssoAddress;
    }

    public void setSsoAddress(String ssoAddress) {
        this.ssoAddress = ssoAddress;
    }

    public String getPlatformAddress() {
        return platformAddress;
    }

    public void setPlatformAddress(String platformAddress) {
        this.platformAddress = platformAddress;
    }

    public String getPrivateAddress() {
        return privateAddress;
    }

    public void setPrivateAddress(String privateAddress) {
        this.privateAddress = privateAddress;
    }
}
