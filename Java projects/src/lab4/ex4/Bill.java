package lab4.ex4;

import java.util.ArrayList;
import java.util.HashMap;

public class Bill {
    public void addToCart(Integer value, String thing) {
        cart.put(thing, value);
    }

    public HashMap<String, Integer> getCart() {
        return cart;
    }

    private HashMap<String, Integer> cart = new HashMap<>();
}
