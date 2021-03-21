package lab1.ex3;

public class Audi implements Car {

    Audi(String name, int speed){
        this.maxSpeed = speed;
        this.carName = name;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String getCarName() {
        return carName;
    }

    private int maxSpeed;
    private String carName;
}
