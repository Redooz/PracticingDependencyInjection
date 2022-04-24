package com.rd.co.class2di.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Invoice {
    @Value("${invoice.description}")
    private String description;
    @Autowired
    private Client client;
    @Autowired
    private List<InvoiceRows> arrows;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<InvoiceRows> getArrows() {
        return arrows;
    }

    public void setArrows(List<InvoiceRows> arrows) {
        this.arrows = arrows;
    }
}
