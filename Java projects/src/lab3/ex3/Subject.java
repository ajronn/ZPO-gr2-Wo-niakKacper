package lab3.ex3;

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers(int digit);
}
