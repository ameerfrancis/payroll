package com.payroll.Factory.Demography;

import com.payroll.Domain.Demography.Gender;

public class GenderFactory {

    public static Gender getGender(String genderType) {
        return new Gender.Builder().genderType(genderType)
                .build();
    }
}
