package factory.ex3;

public class Test {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory1 = new FurnitureFactory(new ModernFactory());
        FurnitureFactory furnitureFactory2 = new FurnitureFactory(new VictorianFactory());
        FurnitureFactory furnitureFactory3 = new FurnitureFactory(new ArtDecoFactory());

        furnitureFactory1.show();
        furnitureFactory2.show();
        furnitureFactory3.show();
    }
}
