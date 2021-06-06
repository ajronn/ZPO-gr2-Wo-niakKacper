package stan.ex2;

public class TurnedOnState extends State{
    public TurnedOnState(Tv tv) {
        super(tv);
    }

    @Override
    public String turnOn() {
        return "Nothing happens";
    }

    @Override
    public String turnOff() {
        tv.setState(new TurnedOffState(tv));
        return "TV has been turned off";
    }

    @Override
    public String switchChannel(String channel) {
        tv.setChannel(channel);
        return "Channel has been changed";
    }

    @Override
    public String showChannel() {
        return tv.getChannel();
    }
}
