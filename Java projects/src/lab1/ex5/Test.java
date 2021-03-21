package lab1.ex5;

public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop(new PolishTax());

        shop.sell(100);
        shop.changeTax(new GBTax());
        shop.sell(100);
        shop.changeTax(new GermanTax());
        shop.sell(100);
    }
}
