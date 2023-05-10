//package com.kodilla.hibernate.invoice.dao;
//
//import com.kodilla.hibernate.invoice.Invoice;
//import com.kodilla.hibernate.invoice.Item;
//import com.kodilla.hibernate.invoice.Product;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.math.BigDecimal;
//import java.util.Arrays;
//
//@SpringBootTest
//public class InvoiceDaoTestSuite {
//
//    @Autowired
//    private InvoiceDao invoiceDao;
//    @Autowired
//    private ItemDao itemDao;
//    @Autowired
//    private ProductDao productDao;
//
//    @Test
//    public void testInvoiceDaoSave(){
//
//
//        //Given
//        Product product1 = new Product("Product1");
//        Product product2 = new Product("Product2");
//        Product product3 = new Product("Product3");
//        productDao.save(product1);
//        productDao.save(product2);
//        productDao.save(product3);
//
//        Item item1 = new Item(product1,new BigDecimal("100.50"),2,new BigDecimal("50.00"));
//        Item item2 = new Item(product2,new BigDecimal("200.60"),3,new BigDecimal("60.00"));
//        Item item3 = new Item(product3,new BigDecimal("300.70"),4,new BigDecimal("60.00"));
//
//
//        Invoice invoice = new Invoice("1", Arrays.asList(item1,item2,item3));
//
//        //When
//
//        //Then
//
//        // clean up
//
//    }
//}
