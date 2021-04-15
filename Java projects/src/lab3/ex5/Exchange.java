package lab3.ex5;

import java.util.ArrayList;

public class Exchange implements Subject{
    public Exchange(Integer rate) {
        this.rate = rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
        notifyObservers();
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
    public void notifyObservers() {
        for(Observer o : observersList){
            o.update(rate);
        }
    }

    private Integer rate;
    private ArrayList<Observer> observersList = new ArrayList<>();
}
