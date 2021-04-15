package lab2.ex4;

public class Ad {
    public Ad(Integer charge, String content) {
        this.charge = charge;
        this.content = content;
        if(charge <= 100) {
            this.messageType = new Email();
        } else if(charge <= 200) {
            this.messageType = new Sms();
        } else if(charge <= 300) {
            this.messageType = new Voice();
        }
    }

    public String getContent() {
        return messageType.message(content);
    }



    private Integer charge;
    private String content;
    private IMessage messageType;
}
