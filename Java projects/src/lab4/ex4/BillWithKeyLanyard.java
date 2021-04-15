package lab4.ex4;

import java.util.ArrayList;
import java.util.HashMap;

public class BillWithKeyLanyard extends Bill{
    public BillWithKeyLanyard(Bill baseBill) {
        this.baseBill = baseBill;

    }

    @Override
    public HashMap<String, Integer> getCart() {
        HashMap<String, Integer> map = this.baseBill.getCart();
        map.put("key lanyard", 0);
        return map;
    }

    private Bill baseBill;
}
