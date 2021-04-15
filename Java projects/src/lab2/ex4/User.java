package lab2.ex4;

public class User {
    public User(String language, ITranslator translator) {
        this.language = language;
        this.translator = translator;
    }

    public String getLanguage() {
        return language;
    }

    public void translate(String text) {
        System.out.println(translator.translate(text));
    }


    private String language;
    private ITranslator translator;
}
