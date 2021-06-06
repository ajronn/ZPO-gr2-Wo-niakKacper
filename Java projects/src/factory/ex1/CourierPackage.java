package factory.ex1;

public class CourierPackage implements GUIFactory{
    @Override
    public DeliveryMethod createMethod() {
        return new Courier();
    }
}
