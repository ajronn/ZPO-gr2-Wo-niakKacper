package stan.ex3;

public abstract class State {
    public State(Autoryzacja autoryzacja) {
        this.autoryzacja = autoryzacja;
    }

    public abstract String login(String login, String pass);
    public abstract String logout();
    Autoryzacja autoryzacja;
}
