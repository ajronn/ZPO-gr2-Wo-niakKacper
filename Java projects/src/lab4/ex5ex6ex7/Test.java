package lab4.ex5ex6ex7;

public class Test {
    public static void main(String[] args) {
        Klient drukarka = new Klient();
        Sterownik sterownik = new Sterownik(drukarka);
        drukarka.rysujDo(5,3);
        sterownik.sprawdzIlosc();
        drukarka.rysujDo(1,1);
        sterownik.zaladujTusz(100);
        drukarka.rysujDo(10,10);
    }
}
