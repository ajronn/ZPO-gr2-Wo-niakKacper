package lab2.ex5;

public class Add implements IAction{
    @Override
    public int action(int x, int y) {
        return x+y;
    }
}
