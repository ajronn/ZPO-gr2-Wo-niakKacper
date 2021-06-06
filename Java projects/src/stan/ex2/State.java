package stan.ex2;

public abstract class State {
    public State(Tv tv) {
        this.tv = tv;
    }

    public abstract String turnOn();
    public abstract String turnOff();
    public abstract String switchChannel(String channel);
    public abstract String showChannel();
    Tv tv;
}
