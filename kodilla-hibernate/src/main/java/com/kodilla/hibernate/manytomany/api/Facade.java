package com.kodilla.hibernate.manytomany.api;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class Facade {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<EmployeeDto> findEmployee(String name) {

        List<Employee> employees = employeeDao.retrieveEmployeeByPartName("%" + name + "%");
        List<EmployeeDto> employessDto = new LinkedList<>();

        for (Employee employee : employees) {

            employessDto.add(new EmployeeDto(
                    employee.getId(),
                    employee.getFirstname(),
                    employee.getLastname(),
                    employee.getCompanies()));

        }
        return employessDto;
    }

    public List<CompanyDto> findCompany(String name) {

        List<Company> companies = companyDao.retrieveCompanyByPartName("%" + name + "%");
        List<CompanyDto> companiesDto = new LinkedList<>();

        for (Company company : companies) {

            companiesDto.add(new CompanyDto(
                    company.getId(),
                    company.getName(),
                    company.getEmployees()));

        }
        return companiesDto;
    }
}
