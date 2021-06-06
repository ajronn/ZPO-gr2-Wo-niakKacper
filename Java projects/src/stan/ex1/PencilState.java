package stan.ex1;

public class PencilState extends State{
    public PencilState(Board board) {
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
        return "Drawing by pencil";
    }

    @Override
    public String onCrayonDraw() {
        board.changeState(new CrayonState(board));
        board.setCurrentTool("Crayon");
        return "Drawing by crayon";
    }
}
