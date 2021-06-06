package factory.ex2;

public class ContainerShip implements Transport{
    @Override
    public void delivery() {
        System.out.println("By container ship");
    }
}
