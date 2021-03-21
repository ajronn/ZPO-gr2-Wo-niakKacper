package lab1.ex6;

public class Pracownik {

    Pracownik(IPracowac p, IDojezdzac d, ISpedzanieWolnegoCzasu s){
        this.pracowac = p;
        this.dojezdzac = d;
        this.spedzanieWolnegoCzasu = s;
    }

    public void pracowac() {
        pracowac.pracuj();
    }

    public void dojezdzac() {
        dojezdzac.dojezdzaj();
    }

    public void spedzanieWolnegoCzasu() {
        spedzanieWolnegoCzasu.spedzajWolnyCzas();
    }

    IPracowac pracowac;
    IDojezdzac dojezdzac;
    ISpedzanieWolnegoCzasu spedzanieWolnegoCzasu;
}
