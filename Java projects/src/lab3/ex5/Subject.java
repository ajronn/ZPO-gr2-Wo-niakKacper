package lab3.ex5;

import lab3.ex5.Observer;

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
