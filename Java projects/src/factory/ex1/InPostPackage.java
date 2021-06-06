package factory.ex1;

public class InPostPackage implements GUIFactory{
    @Override
    public DeliveryMethod createMethod() {
        return new InPost();
    }
}
