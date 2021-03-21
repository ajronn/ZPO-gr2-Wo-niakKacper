package lab1.ex5;

public class GBTax implements ITax{
    @Override
    public double calcTax(int price) {
        return price * 0.44;
    }
}
