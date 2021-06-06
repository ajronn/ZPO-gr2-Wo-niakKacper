package factory.ex1;

public class Test {
    public static void main(String[] args) {
        Office office1 = new Office(new InPostPackage());
        office1.name();
        Office office2 = new Office(new CourierPackage());
        office2.name();
    }
}
