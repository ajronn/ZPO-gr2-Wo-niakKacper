package lab4.ex5ex6ex7;

public class Klient implements IMenadzerTuszu, IPloter{
    @Override
    public void ustalPozycje(int x, int y) {
        this.pozycjaX = x;
        this.pozycjaY = y;
    }

    @Override
    public void rysujDo(int x, int y) {
        if(x > 10 || y > 20) {
            return;
        }
        int ilePol = y * 10 - (10 - x);
        pobierzTusz(ilePol);

        if(this.iloscTuszu < 0) {
            ilePol -= Math.abs(this.iloscTuszu);
            this.iloscTuszu = 0;
        }

        for(int i = 0; i<20;i++) {
            for(int j = 0; j<10; j++) {
                if(ilePol > 0){
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
                ilePol--;
            }
            System.out.println();
        }

    }

    @Override
    public void zaladujTusz(int ilosc) {
        this.iloscTuszu += ilosc;
    }

    @Override
    public void pobierzTusz(int ilosc) {
        this.iloscTuszu -= ilosc;
        if(this.iloscTuszu<=0) {
            System.out.println("Koniec tuszu");
        }
    }

    @Override
    public void sprawdzIlosc() {
        System.out.println(iloscTuszu);
    }

    public int getIloscTuszu() {
        return iloscTuszu;
    }

    private int pozycjaX = 0;
    private int pozycjaY = 0;
    private int iloscTuszu = 20;
}
