package org.springframework.social.fanapium.api.impl;

import org.springframework.social.fanapium.api.UserOperations;
import org.springframework.social.fanapium.api.WalletOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class WalletTemplate implements WalletOperations {

    private static String USER_INFO_URL = "/users";

    private final RestTemplate restTemplate;

    public WalletTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Object follow(String businessId) {
        return null;
    }

    public Object unFollow(String businessId) {
        return null;
    }

    public Object issueInvoice() {
        return null;
    }

    public Object payInvoice() {
        return null;
    }

    public List<Object> getInvoices() {
        return null;
    }

    public Float getCustomerCredit() {
        return null;
    }

    public Float getBusinessCredit() {
        return null;
    }

    public void buyCredit() {

    }

    public void payInvoiceByCredit() {

    }

    public void cancellInvoiceByUser() {

    }

    public void cancellInvoiceByBusiness() {

    }
}
