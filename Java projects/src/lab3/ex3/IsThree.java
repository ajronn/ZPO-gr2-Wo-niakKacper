package lab3.ex3;

public class IsThree implements Observer{
    @Override
    public void update(int digit) {
        if(digit == 3){
            System.out.println("Rowna 3!");
        }
    }
}
