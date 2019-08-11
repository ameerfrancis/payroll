package com.payroll.Factory.User;

import com.payroll.Domain.User.EmployeeRace;

public class EmployeeRaceFactory {

    public static EmployeeRace getEmployeeRace(String firstName, String lastName, String race) {
        return new EmployeeRace.Builder().firstName(firstName)
                .lastName(lastName)
                .race(race)
                .build();
    }
}
