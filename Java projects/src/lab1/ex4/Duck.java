package lab1.ex4;

public class Duck {

    Duck(IDuckFly duckFly, IDuckVoice duckVoice){
        this.duckFly = duckFly;
        this.duckVoice = duckVoice;
    }

    public void tuningDuckFly(IDuckFly dF){
        this.duckFly = dF;
    }

    public void  tuningDuckVoice(IDuckVoice dV) {
        this.duckVoice = dV;
    }

    public void getFly(){
        duckFly.fly();
    }

    public void getVoice(){
        duckVoice.voice();
    }

    private IDuckFly duckFly;
    private IDuckVoice duckVoice;
}
