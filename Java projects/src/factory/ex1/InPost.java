package factory.ex1;

public class InPost implements DeliveryMethod{
    @Override
    public void name() {
        System.out.println("Send by InPost");
    }
}
