package lab4.ex4;

import java.util.HashMap;

public class BillWithTransport extends Bill{
    public BillWithTransport(Bill baseBill) {
        this.baseBill = baseBill;
    }

    @Override
    public HashMap<String, Integer> getCart() {
        HashMap<String, Integer> map = this.baseBill.getCart();
        map.put("transport", 13);
        return map;
    }

    private Bill baseBill;
}
