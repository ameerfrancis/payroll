package com.payroll.Factory.Demography;

import com.payroll.Domain.Demography.Race;

public class RaceFactory {

    public static Race getRace(String raceType) {
        return new Race.Builder().raceType(raceType)
                .build();
    }
}
