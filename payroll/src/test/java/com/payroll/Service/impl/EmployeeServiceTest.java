package com.payroll.Service.impl;

import com.payroll.Domain.User.Employee;
import com.payroll.Factory.User.EmployeeFactory;
import com.payroll.Repository.impl.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EmployeeServiceTest {

    private EmployeeRepository repository;
    private Employee employee;


    private Employee getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = EmployeeRepository.getRepository();
        this.employee = EmployeeFactory.getEmployee("Ameer", "Francis");
    }

    //@Test
   // public void getService() {
    //}

    @Test
    public void create() {

        Employee created = this.repository.create(this.employee);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.employee);
    }

    @Test
    public void update() {

        String newEmployeeName = "John";
        Employee updated = new Employee.Builder().firstName(newEmployeeName).firstName(newEmployeeName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newEmployeeName, updated.getFirstName());
    }

    //com.library.repository.impl.people.AuthorRepositoryImpl object = com.library.repository.impl.people.AuthorRepositoryImpl.getRepository();
    com.payroll.Repository.impl.EmployeeRepository object = com.payroll.Repository.impl.EmployeeRepository.getRepository();

    EmployeeFactory empFac = new EmployeeFactory();

    Employee test1 = empFac.getEmployee("Chad", "W");
    Employee test2 = empFac.getEmployee("Ameer", "F");


    @Test
    public void delete() {

        object.create(test1);
        this.repository.delete(test1.getFirstName());
        getAll();
    }

    @Test
    public void read() {

        object.create(test2);
        Employee read = object.read(test2.getFirstName());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, test2);
    }

    @Test
    public void getAll() {

        ArrayList<Employee> employees = this.repository.getAll();
        System.out.println("In getall, all = " + employees);
    }
}