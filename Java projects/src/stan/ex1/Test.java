package stan.ex1;

public class Test {
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.getState().onPenDraw());
        System.out.println(board.getState().onPencilDraw());
        System.out.println(board.getState().onCrayonDraw());
    }
}
