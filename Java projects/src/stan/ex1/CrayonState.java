package stan.ex1;

public class CrayonState extends State {
    public CrayonState(Board board) {
        super(board);
    }

    @Override
    public String onPenDraw() {
        board.changeState(new PenState(board));
        board.setCurrentTool("Pen");
        return "Drawing by pen";
    }

    @Override
    public String onPencilDraw() {
        board.changeState(new PencilState(board));
        board.setCurrentTool("Pencil");
        return "Drawing by pencil";
    }

    @Override
    public String onCrayonDraw() {
        return "Drawing by crayon";
    }
}
