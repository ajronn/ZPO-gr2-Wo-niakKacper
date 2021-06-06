package lab2.ex2;

public class Controller {
    public Controller(ISound sound) {
        this.sound = sound;
    }

    void switchDecoder(ISound sound) {
        this.sound = sound;
    }

    void play() {
        sound.play();
    }

    private ISound sound;
}
