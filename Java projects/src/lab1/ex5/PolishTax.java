package lab1.ex5;

public class PolishTax implements ITax{
    @Override
    public double calcTax(int price) {
        return price * 0.23;
    }
}
