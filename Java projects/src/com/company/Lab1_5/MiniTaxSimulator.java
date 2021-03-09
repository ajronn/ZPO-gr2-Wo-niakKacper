package com.company.Lab1_5;

public class MiniTaxSimulator {
    public MiniTaxSimulator(){
        VeryBigPolishShop p = new VeryBigPolishShop();
        VeryBigGBShop gb = new VeryBigGBShop();
        VeryBigGermanShop g = new VeryBigGermanShop();

        p.calculateTax();
        gb.calculateTax();
        g.calculateTax();
    }
}

class VeryBigPolishShop extends VeryBigShop {
    public VeryBigPolishShop() {
        taxType = new PolishTax();
    }

    class PolishTax implements TaxType{
        public void run(int value){
            System.out.println("Polish tax - "+value*0.23);
        }
    }
}

class VeryBigGBShop extends VeryBigShop {
    public VeryBigGBShop() {
        taxType = new GBTax();
    }

    class GBTax implements TaxType{
        public void run(int value){
            System.out.println("Great Britain tax - "+value*0.30);
        }
    }
}

class VeryBigGermanShop extends VeryBigShop {
    public VeryBigGermanShop() {
        taxType = new GermanTax();
    }

    class GermanTax implements TaxType{
        public void run(int value){
            System.out.println("German tax - "+value*0.50);
        }
    }
}