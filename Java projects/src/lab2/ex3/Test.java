package lab2.ex3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Character archer = new Character(new Bow());
        Character sagittarius = new Character(new Rifle());
        Character knight = new Character(new Sword());
        Character gunner = new Character(new Cannon());

        ArrayList<Character> attack = new ArrayList<Character>();
        attack.add(archer);
        attack.add(sagittarius);
        attack.add(knight);
        attack.add(gunner);

        attack.forEach((character -> {
            character.attack();
        }));

    }
}
