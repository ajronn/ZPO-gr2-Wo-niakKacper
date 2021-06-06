package stan.ex3;

public class Blad3RazyStan extends State{
    public Blad3RazyStan(Autoryzacja autoryzacja) {
        super(autoryzacja);
    }

    @Override
    public String login(String login, String pass) {
        if(autoryzacja.getLogin() == login && autoryzacja.getPass() == pass && autoryzacja.getLock() == 0){
            autoryzacja.setState(new SprawdzenieStan(autoryzacja));
            return "Access granted";
        }
        if(autoryzacja.getTrials() < 3){
            autoryzacja.setTrials(autoryzacja.getTrials() + 1);
        }

        if(autoryzacja.getTrials() == 3) {
            autoryzacja.setLock(30);
        }
        return "Access denied, incorrect login or password";
    }

    @Override
    public String logout() {
        return "Nothing happens";
    }
}
