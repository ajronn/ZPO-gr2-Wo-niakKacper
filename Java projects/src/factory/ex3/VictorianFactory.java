package factory.ex3;

public class VictorianFactory implements GUIFactory{
    @Override
    public Armchair produceArmchair() {
        return new ArmchairVictorian();
    }

    @Override
    public Sofa produceSofa() {
        return new SofaVictorian();
    }

    @Override
    public CoffeeTable produceCoffeeTable() {
        return new CoffeeTableVictorian();
    }
}
