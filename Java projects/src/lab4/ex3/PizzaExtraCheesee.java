package lab4.ex3;

public class PizzaExtraCheesee extends Pizza{
    public PizzaExtraCheesee(Pizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public Integer getPrice() {
        return basePizza.getPrice() + price;
    }

    private Pizza basePizza;
    private Integer price = 3;
}
