package factory.ex2;

public class Truck implements Transport{
    @Override
    public void delivery() {
        System.out.println("By truck!");
    }
}
