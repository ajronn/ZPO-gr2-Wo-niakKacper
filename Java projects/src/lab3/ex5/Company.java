package lab3.ex5;

public class Company implements Observer {
    public Company(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public void update(int value) {
        float v = value*this.value/100 + this.value;
        System.out.println(name);
        System.out.println("Value of my actions: "+v);
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    private String[] actions;
    private Integer value;
    private String name;
}
