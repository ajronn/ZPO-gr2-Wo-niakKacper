package lab4.ex4;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.addToCart(2, "carrot");
        bill.addToCart(2, "paper");
        bill.addToCart(5, "piece of cake");

        HashMap<String,Integer> values = new BillWithTransport(new BillWithDiscount(new BillWithKeyLanyard(new BillWithMascot(bill)))).getCart();

        //checkout
        int cost = 0;
        boolean tr = false;
        for(HashMap.Entry<String, Integer> entry : values.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if(key != "transport") cost += value;
            else tr = true;
            System.out.println(key + " --- " + value + "c");
        }
        if(cost < 0) cost = 0;
        if(tr) cost += 13;
        System.out.println("All --- "+cost);

    }
}
