package lab2.ex4;

public class Voice implements IMessage{
    @Override
    public String message(String content) {
        return content+" [by voice]";
    }
}
