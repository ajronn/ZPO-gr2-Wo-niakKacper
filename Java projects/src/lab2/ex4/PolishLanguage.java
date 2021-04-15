package lab2.ex4;

public class PolishLanguage implements ITranslator{
    @Override
    public String translate(String content) {
        return "[Pl] "+content;
    }
}
