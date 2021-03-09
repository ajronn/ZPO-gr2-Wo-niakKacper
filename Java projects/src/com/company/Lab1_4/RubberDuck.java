package com.company.Lab1_4;

public class RubberDuck extends Duck{
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    void display() {
        System.out.println("Am I yellow?");
    }

    class FlyNoWay implements FlyBehavior {
        public void fly() {
            System.out.println("I can't fly...");
        }
    }

    class Squeak implements QuackBehavior {
        public void quack() {
            System.out.println("Squeak!");
        }
    }
}
