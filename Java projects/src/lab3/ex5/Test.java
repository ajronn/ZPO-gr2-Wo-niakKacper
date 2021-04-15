package lab3.ex5;

import java.util.Random;


public class Test {
    public static void main(String[] args) {
        Random rand = new Random();

        Exchange exchange = new Exchange(5);
        Company com1 = new Company(100, "com 1");
        Company com2 = new Company(200, "com 2");
        Company com3 = new Company(300, "com 3");
        exchange.register(com1);
        exchange.register(com2);
        exchange.register(com3);

        for(int i = 0; i<3; i++){
            int rate = rand.nextInt(100)+1;
            System.out.println("Iteration: " + (i+1) + " current rate: " + rate + "%");
            exchange.setRate(rate);
            System.out.println();
        }

    }
}
