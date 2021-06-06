package factory.ex2;

public class LoadOnContainerShip implements GUIFactory{
    @Override
    public Transport load() {
        return new ContainerShip();
    }
}
