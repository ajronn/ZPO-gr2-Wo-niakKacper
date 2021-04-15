package lab2.ex5;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class Calculator {
    public Calculator() {
        this.math = new Add();
    }

    void changeAction(IAction action) {
        this.math = action;
    }

    void go(int x, int y, char sign) {
        switch(sign) {
            case '-':
                this.math = new Sub();
                System.out.println(math.action(x,y));
                break;
            case '/':
                this.math = new Div();
                System.out.println(math.action(x,y));
                break;
            case '*':
                this.math = new Multi();
                System.out.println(math.action(x,y));
                break;
            default:
                this.math = new Add();
                System.out.println(math.action(x,y));
        }

    }
    private IAction math;
}
