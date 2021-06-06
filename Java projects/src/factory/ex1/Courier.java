package factory.ex1;

public class Courier implements DeliveryMethod{
    @Override
    public void name() {
        System.out.println("Send by courier");
    }
}
