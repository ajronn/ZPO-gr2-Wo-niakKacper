package lab2.ex3;

public class Character {
    Character(IAttack attack){
        this.attack = attack;
    }

    public void attack(){
        this.attack.attack();
    }

    private IAttack attack;
}
