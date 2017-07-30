package org.springframework.social.fanapium.api;

import java.util.List;

public interface WalletOperations {
    Object follow(String businessId);

    Object unFollow(String businessId);

    Object issueInvoice(); // FIXME add invoiceDTO

    Object payInvoice(); // FIXME

    List<Object> getInvoices(); // FIXME

    Float getCustomerCredit();

    Float getBusinessCredit();

    void buyCredit();

    void payInvoiceByCredit();

    void cancellInvoiceByUser();

    void cancellInvoiceByBusiness();
}
