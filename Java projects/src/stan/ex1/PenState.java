package stan.ex1;

public class PenState extends State{
    public PenState(Board board) {
        super(board);
    }

    @Override
    public String onPenDraw() {
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
        board.changeState(new CrayonState(board));
        board.setCurrentTool("Crayon");
        return "Drawing by crayon";
    }
}
