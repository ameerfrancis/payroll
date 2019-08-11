package com.payroll.Repository.impl;

import com.payroll.Domain.User.Employee;
import com.payroll.Factory.User.EmployeeFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRepositoryTest {

    EmployeeRepository object = EmployeeRepository.getRepository();

    EmployeeFactory empFac = new EmployeeFactory();

    Employee test1 = empFac.getEmployee("ameer","francis");
    Employee test2 = empFac.getEmployee("bob", "marley");
    Employee test3 = empFac.getEmployee("john", "smith");

    @Test
    public void getRepository() {

        EmployeeRepository employee = EmployeeRepository.getRepository();

        Assert.assertNotNull(employee);
    }

    @Test
    public void create() {

        object.create(test1);

        int num = object.getAll().size();

        Assert.assertEquals(1, num);
    }

    @Test
    public void read() {

        object.create(test1);
        object.create(test2);

        Employee emp = object.read("ameer");

        Assert.assertEquals(test1, emp);

    }

    @Test
    public void update() {

        object.create(test1);
        object.create(test2);

        Employee emp = object.update(test2);

        Assert.assertEquals(test2,emp);
    }

    @Test
    public void delete() {

        object.create(test1);

        object.delete("ameer");

        Assert.assertEquals(1, object.getAll().size());
    }
}