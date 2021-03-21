package lab1.ex5;

public class Shop {
    Shop(ITax tax){
        this.tax = tax;
    }

    public void sell(int price) {
        double value = price + tax.calcTax(price);
        System.out.println(value);
    }

    public void changeTax(ITax t){
        this.tax = t;
    }

    ITax tax;
}
