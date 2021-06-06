package factory.ex2;

public class LoadOnTruck implements GUIFactory{
    @Override
    public Transport load() {
        return new Truck();
    }
}
