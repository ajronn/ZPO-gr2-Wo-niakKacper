package lab2.ex4;

public class Sms implements IMessage{
    @Override
    public String message(String content) {
        return content+" [by sms]";
    }
}
