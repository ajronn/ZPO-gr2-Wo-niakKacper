package factory.ex3;

public class ArtDecoFactory implements GUIFactory{
    @Override
    public Armchair produceArmchair() {
        return new ArmchairArtDeco();
    }

    @Override
    public Sofa produceSofa() {
        return new SofaArtDeco();
    }

    @Override
    public CoffeeTable produceCoffeeTable() {
        return new CoffeeTableArtDeco();
    }
}
