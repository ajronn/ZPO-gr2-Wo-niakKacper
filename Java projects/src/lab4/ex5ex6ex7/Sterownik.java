package lab4.ex5ex6ex7;

public class Sterownik implements IMenadzerTuszu{

    public Sterownik(Klient klient){
        this.klient = klient;
    }

    @Override
    public void zaladujTusz(int ilosc) {
        klient.zaladujTusz(ilosc);
    }

    @Override
    public void pobierzTusz(int ilosc) {
        klient.pobierzTusz(ilosc);
    }

    @Override
    public void sprawdzIlosc() {
        System.out.println(klient.getIloscTuszu());
    }

    Klient klient;
}
