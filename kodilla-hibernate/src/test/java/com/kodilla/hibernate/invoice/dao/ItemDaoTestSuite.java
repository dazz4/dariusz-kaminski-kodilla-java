package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemDaoTestSuite {
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testItemDaoSave() {
        Product product = new Product("Klapki");

        Item item = new Item(1, new BigDecimal(50), new BigDecimal(50));
        item.setProduct(product);
        product.getItems().add(item);

        //When
        itemDao.save(item);
        //int id = item.getId();

    }
}
