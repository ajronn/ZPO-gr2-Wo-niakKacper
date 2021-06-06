package factory.ex3;

public class FurnitureFactory {
    public FurnitureFactory(GUIFactory factory) {
        this.armchair = factory.produceArmchair();
        this.sofa = factory.produceSofa();
        this.coffeeTable = factory.produceCoffeeTable();
    }

    public void show() {
        this.armchair.name();
        this.sofa.name();
        this.coffeeTable.name();
    }

    private Armchair armchair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;
}
