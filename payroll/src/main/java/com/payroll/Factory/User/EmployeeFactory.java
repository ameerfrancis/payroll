package com.payroll.Factory.User;

import com.payroll.Domain.User.Employee;

public class EmployeeFactory {

    public static Employee getEmployee(String firstName, String lastName) {
        return new Employee.Builder().firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
