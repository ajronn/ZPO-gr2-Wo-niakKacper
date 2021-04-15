package lab4.ex4;

import java.util.HashMap;

public class BillWithDiscount extends Bill{
    public BillWithDiscount(Bill baseBill) {
        this.baseBill = baseBill;
    }

    @Override
    public HashMap<String, Integer> getCart() {
        HashMap<String, Integer> map = this.baseBill.getCart();
        map.put("discount", -10);
        return map;
    }

    private Bill baseBill;
}
