package lab1.ex4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Duck rubberDuck = new Duck(new Flightless(), new Squeak());
        Duck mallardDuck = new Duck(new Flightable(), new Quack());
        ArrayList<Duck> listOfDucks = new ArrayList<Duck>();
        listOfDucks.add(rubberDuck);
        listOfDucks.add(mallardDuck);

        listOfDucks.forEach((duck -> {
            duck.getVoice();
            duck.getFly();
            System.out.println("------------");
        }));

        listOfDucks.get(0).tuningDuckFly(new IDuckFly(){
            @Override
            public void fly() {
                System.out.println("Fly by roooooooooooocket!!!");
            }
        });

        listOfDucks.forEach((duck -> {
            duck.getVoice();
            duck.getFly();
            System.out.println("------------");
        }));
    }
}