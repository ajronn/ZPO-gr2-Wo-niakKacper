package lab3.ex3;

public class IsDivisibleByTwo implements Observer{
    @Override
    public void update(int digit) {
        if(digit % 2 == 0){
            System.out.println("Podzielna przez 2!");
        }
    }
}
