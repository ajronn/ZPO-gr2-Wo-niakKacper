package factory.ex2;

public class Logistic {
    public Logistic(GUIFactory transport) {
        this.transport = transport.load();
    }

    public void delivery() {
        this.transport.delivery();
    }

    private Transport transport;
}
