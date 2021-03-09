package com.company.Lab1_4;

public class NormalDuck extends Duck {
    public NormalDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("Just a duck");
    }

    class FlyWithWings implements FlyBehavior {
        public void fly() {
            System.out.println("<< Getting ready to fly >>");
        }
    }

    class Quack implements QuackBehavior {
        public void quack() {
            System.out.println("Quack!");
        }
    }
}
