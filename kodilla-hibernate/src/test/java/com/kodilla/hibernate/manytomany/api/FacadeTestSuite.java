//package com.kodilla.hibernate.manytomany.api;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class FacadeTestSuite {
//    @Autowired
//    private Facade facade;
//
//    @Test
//    public void testFindEmployee() {
//        //Given
//        //When
//        List<EmployeeDto> employees = facade.findEmployee("Smi");
//        employees.stream()
//                .map(e -> e.getFirstname() + " " + e.getLastname())
//                .forEach(System.out::println);
//        //Then
//        assertEquals(2, employees.size());
//    }
//}