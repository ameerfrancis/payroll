package com.payroll.Factory.User;

import com.payroll.Domain.User.EmployeeGender;

public class EmployeeGenderFactory {

    public static EmployeeGender getEmployeeGender(String firstName, String lastName, String gender) {
        return new EmployeeGender.Builder().firstName(firstName)
                .lastName(lastName)
                .gender(gender)
                .build();
    }
}