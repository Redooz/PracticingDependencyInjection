package com.rd.co.class2di;

import com.rd.co.class2di.domain.InvoiceRows;
import com.rd.co.class2di.domain.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {
    @Bean
    public List<InvoiceRows> invoiceRowsList(){
        Product product1 = new Product("Computer",500);
        Product product2 = new Product("Desk",100);
        Product product3 = new Product("Mouse",12);
        Product product4 = new Product("Keyboard",25);

        InvoiceRows row1 = new InvoiceRows(product1,2);
        InvoiceRows row2 = new InvoiceRows(product2,4);
        InvoiceRows row3 = new InvoiceRows(product3,2);
        InvoiceRows row4 = new InvoiceRows(product4,2);

        return Arrays.asList(row1,row2,row3,row4);
    }
}
