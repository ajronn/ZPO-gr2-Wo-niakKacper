package stan.ex3;

public class Test {
    public static void main(String[] args) {
        Autoryzacja autoryzacja = new Autoryzacja("jeden", "dwa");
        autoryzacja.getState().login("", "");
        autoryzacja.getState().login("", "");
        autoryzacja.getState().login("", "");
        autoryzacja.getState().login("", "");
        System.out.println(autoryzacja.getLock());
    }
}
