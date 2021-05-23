package interfaces.defaultmethods;

public interface Pizzeria {

    String producer();

    default String getOverview() {
        return "Pizzas made by " + producer();
    }

}
