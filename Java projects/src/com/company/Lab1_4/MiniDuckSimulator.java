package com.company.Lab1_4;

import java.util.ArrayList;

public class MiniDuckSimulator {
    public MiniDuckSimulator() {
        ArrayList<Duck> duckList = new ArrayList<Duck>();
        duckList.add(new NormalDuck());
        duckList.add(new RubberDuck());

        duckList.get(1).setFlyBehavior(new FlyPoweredByRocket());
        for(Duck duck: duckList){
            duck.display();
            duck.performFly();
            System.out.println();
        }
    }

    class FlyPoweredByRocket implements FlyBehavior {
        public void fly() {
            System.out.println("Rocket propulsion ready!");
        }
    }
}


