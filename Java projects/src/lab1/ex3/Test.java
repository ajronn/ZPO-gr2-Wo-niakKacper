package lab1.ex3;

public class Test {
    public static void main(String[] args) {
        CarSpeed car_speed = new CarSpeed(new Audi("Audi A4", 180));
        car_speed.showCarName();
        System.out.println(car_speed.getMaxSpeed());
    }
}
