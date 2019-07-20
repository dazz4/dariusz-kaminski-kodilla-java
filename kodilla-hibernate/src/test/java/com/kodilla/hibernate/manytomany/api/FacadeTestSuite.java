package com.kodilla.hibernate.manytomany.api;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private Facade facade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindEmployee() {
        //Given
        Employee darek = new Employee("Dariusz", "Kaminski");
        Employee kamil = new Employee("Kamil", "Chrapek");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(darek);
        employeeList.add(kamil);
        employeeDao.saveAll(employeeList);

        //When
        List<EmployeeDto> employees = facade.findEmployee("apek");

        //Then
        assertEquals(1, employees.size());

        //CleanUp
        employeeDao.deleteAll();
    }

    @Test
    public void testFindCompany() {
        //Given
        Company apple = new Company("Apple");
        Company google = new Company("Google");
        List<Company> companyList = new ArrayList<>();
        companyList.add(apple);
        companyList.add(google);
        companyDao.saveAll(companyList);

        //When
        List<CompanyDto> companies = facade.findCompany("ppl");

        //Then
        assertEquals(1, companies.size());

        //CleanUp
        companyDao.deleteAll();
    }
}