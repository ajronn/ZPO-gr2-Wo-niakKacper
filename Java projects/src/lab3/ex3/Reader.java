package lab3.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Reader implements Subject{

    void ask(int digit){
        Scanner input = new Scanner(System.in);
        if(digit == 0){
            System.out.println("Wybierz opcje:\n1 Nasluchuj wieksza od 0\n2 Nasluchuj rowna 3\n3 Nasluchuj podzielna przez 2");
            char sign = input.next().charAt(0);
            this.changeListening(sign);
        } else {
            this.notifyObservers(digit);
        }

    }

    private void changeListening(char sign){
        if(observersList.size()>0){
            this.unregister(observersList.get(0));
        }

        switch (sign){
            case '1':
                register(new IsHigerThanZero());
                break;
            case '2':
                register(new IsThree());
                break;
            default:
                register(new IsDivisibleByTwo());
        }
    }

    @Override
    public void register(Observer o) {
        observersList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observersList.remove(o);
    }

    @Override
    public void notifyObservers(int digit) {
        for(Observer o : observersList){
            o.update(digit);
        }
    }

    public Reader() {
        this.observersList = new ArrayList<>();
    }

    private ArrayList<Observer> observersList;
}
