package lab4.ex3;

public class PizzaWithHam extends Pizza{
    public PizzaWithHam(Pizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public Integer getPrice() {
        return basePizza.getPrice() + price;
    }

    private Pizza basePizza;
    private Integer price = 2;
}
