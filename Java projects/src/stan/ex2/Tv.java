package stan.ex2;

public class Tv {
    public Tv() {
        this.state = new TurnedOffState(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state){
        this.state = state;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    private String channel = "Channel 0";
    private State state;
}
