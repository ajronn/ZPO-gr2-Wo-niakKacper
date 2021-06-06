package lab2.ex2;

public class Test {
    public static void main(String[] args) {
        Controller controller = new Controller(new DolbyDigital());
        controller.play();
        controller.switchDecoder(new DolbyProLogic());
        controller.play();
    }
}
