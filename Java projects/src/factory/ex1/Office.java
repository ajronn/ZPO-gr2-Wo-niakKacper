package factory.ex1;

public class Office {
    public Office(GUIFactory factory) {
        this.method = factory.createMethod();
    }

    public void name() {
        method.name();
    }

    private DeliveryMethod method;
}
