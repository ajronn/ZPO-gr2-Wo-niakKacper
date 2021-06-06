package stan.ex3;

public class SprawdzenieStan extends State{
    public SprawdzenieStan(Autoryzacja autoryzacja) {
        super(autoryzacja);
        autoryzacja.setTrials(0);
    }

    @Override
    public String login(String login, String pass) {
        if(autoryzacja.getLogin() == login && autoryzacja.getPass() == pass){
            return "Access granted";
        }
        autoryzacja.setTrials(1);
        autoryzacja.setState(new Blad3RazyStan(autoryzacja));
        return "Access denied, incorrect login or password";
    }

    @Override
    public String logout() {
        return "Nothing happens";
    }

}
