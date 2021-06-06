package stan.ex2;

public class Test {
    public static void main(String[] args) {
        Tv tv = new Tv();
        System.out.println(tv.getState().switchChannel("Channel 1"));
        System.out.println(tv.getState().turnOn());
        System.out.println(tv.getState().switchChannel("Channel 1"));
        System.out.println(tv.getState().showChannel());
    }
}
