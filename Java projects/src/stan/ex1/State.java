package stan.ex1;

public abstract class State {
    public State(Board board) {
        this.board = board;
    }

    public abstract String onPenDraw();
    public abstract String onPencilDraw();
    public abstract String onCrayonDraw();
    Board board;
}
