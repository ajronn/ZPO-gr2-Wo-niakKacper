package com.company.Lab1_5;

public abstract  class VeryBigShop {
    TaxType taxType;
    int startUpCapital = 1000;

    public VeryBigShop(){}

    public void calculateTax () {
        taxType.run(startUpCapital);
    }

}

