package factory.ex3;

public class ModernFactory implements GUIFactory{
    @Override
    public CoffeeTable produceCoffeeTable() {
        return new CoffeeTableModern();
    }

    @Override
    public Sofa produceSofa() {
        return new SofaModern();
    }

    @Override
    public Armchair produceArmchair() {
        return new ArmchairModern();
    }
}
