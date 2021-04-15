package lab4.ex3;

public class Test {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        System.out.println("Basic pizza price "+pizza.getPrice());
        Integer price = new PizzaWithHam(new PizzaExtraCheesee(pizza)).getPrice();
        System.out.println("Pizza with ham and extra cheesee price "+price);
        price = new PizzaExtraCheesee(pizza).getPrice();
        System.out.println("Pizza with only extra cheesee price "+price);
    }
}
