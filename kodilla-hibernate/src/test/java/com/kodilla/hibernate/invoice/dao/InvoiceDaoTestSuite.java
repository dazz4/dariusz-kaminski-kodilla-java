package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Sczoteczka");
        Product product2 = new Product("Mikrofon");
        Product product3 = new Product("Monitor");

        Item item1 = new Item(1, new BigDecimal(50), new BigDecimal(50));
        Item item2 = new Item(1, new BigDecimal(66), new BigDecimal(66));
        Item item3 = new Item(1, new BigDecimal(77), new BigDecimal(77));

        Invoice invoice = new Invoice("IN1234");

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);

        Product productToCheck = productDao.findById(product1.getId());
        Item itemToCheck = itemDao.findById(item1.getId());

        int productId = productToCheck.getId();
        int itemProductId = itemToCheck.getProduct().getId();

        //Then
        Assert.assertEquals(productId, itemProductId);

        //CleanUp
        invoiceDao.deleteAll();
    }
}
