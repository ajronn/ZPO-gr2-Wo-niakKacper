package stan.ex3;

public class Autoryzacja {

    public Autoryzacja(String login, String pass) {
        this.login = login;
        this.pass = pass;
        this.state = new SprawdzenieStan(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public int getTrials() {
        return trials;
    }

    public void setTrials(int trials) {
        this.trials = trials;
    }

    public int getLock() {
        return lock;
    }

    public void setLock(int lock) {
        this.lock = lock;
    }

    private int lock = 0;
    private int trials = 0;
    private String login;
    private String pass;
    private State state;
}
