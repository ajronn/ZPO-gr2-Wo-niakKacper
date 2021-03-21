package lab1.ex6;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik(new Leczenie(), new Samochod(), new Silownia());
        Pracownik pracownik2 = new Pracownik(new RoznoszenieListow(), new Samochod(), new LiteraturaPopularnoNaukowa());
        Pracownik pracownik3 = new Pracownik(new NaprawaSamochodow(), new Rower(), new Silownia());

        ArrayList<Pracownik> listaPracownikow = new ArrayList<Pracownik>();
        listaPracownikow.add(pracownik1);
        listaPracownikow.add(pracownik2);
        listaPracownikow.add(pracownik3);

        listaPracownikow.forEach((pracownik -> {
            System.out.println("Pracownik nr: "+ (listaPracownikow.indexOf(pracownik)+1));
            pracownik.pracowac();
            pracownik.dojezdzac();
            pracownik.spedzanieWolnegoCzasu();
            System.out.println("--------------------------");
        }));
    }
}
