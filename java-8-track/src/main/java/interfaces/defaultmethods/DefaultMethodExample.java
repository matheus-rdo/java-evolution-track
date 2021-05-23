package interfaces.defaultmethods;

public class DefaultMethodExample {

    public static void main(String[] args) {
        Pizzeria dominos = new Dominos();
        Pizzeria pizzaHut = new PizzaHut();

        System.out.println(dominos.getOverview());
        System.out.println(pizzaHut.getOverview());
    }
}
