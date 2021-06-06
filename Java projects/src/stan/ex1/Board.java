package stan.ex1;

public class Board {
    public Board() {
        this.state = new PenState(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setCurrentTool(String tool) {
        this.currentTool = tool;
    }

    public String getCurrentTool() {
        return currentTool;
    }

    private String currentTool = "Pen";
    private State state;
}
