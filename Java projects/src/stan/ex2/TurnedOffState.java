package stan.ex2;

public class TurnedOffState extends State{
    public TurnedOffState(Tv tv) {
        super(tv);
    }

    @Override
    public String turnOn() {
        tv.setState(new TurnedOnState(tv));
        return "TV has been turned on";
    }

    @Override
    public String turnOff() {
        return "Nothing happens";
    }

    @Override
    public String switchChannel(String channel) {
        return "Nothing happens";
    }

    @Override
    public String showChannel() {
        return "Nothing happens";
    }
}
