package interfaces.defaultmethods;

public class PizzaHut implements Pizzeria {
    @Override
    public String producer() {
        return "Pizza Hut";
    }

    @Override
    public String getOverview() {
        return producer() + ", come and enjoy!";
    }
}
