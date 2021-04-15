package lab2.ex4;

public class Email implements IMessage{
    @Override
    public String message(String content) {
        return content+" [by email]";
    }
}
