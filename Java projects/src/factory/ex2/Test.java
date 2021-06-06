package factory.ex2;

public class Test {
    public static void load(String cargo) {
        Logistic logic;
        if(cargo == "large") {
            logic = new Logistic(new LoadOnContainerShip());
        } else {
            logic = new Logistic(new LoadOnTruck());
        }
        logic.delivery();
    }

    public static void main(String[] args) {
        load("large");
        load("small");
    }
}
