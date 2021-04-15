package lab2.ex4;

public class EnglishLanguage implements ITranslator{
    @Override
    public String translate(String content) {
        return "[En] "+content;
    }
}
