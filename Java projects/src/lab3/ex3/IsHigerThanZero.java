package lab3.ex3;

public class IsHigerThanZero implements Observer{
    @Override
    public void update(int digit) {
        if(digit > 0) {
            System.out.println("Wieksza od 0!");
        }
    }
}
