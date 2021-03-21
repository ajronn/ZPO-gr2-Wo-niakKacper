package lab2.ex1;

public class Duck {

    Duck(IDuckFly duckFly, IDuckVoice duckVoice, int age){
        this.duckFly = duckFly;
        this.duckVoice = duckVoice;
        this.age = age;
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

    public int age;
    private IDuckFly duckFly;
    private IDuckVoice duckVoice;
}
