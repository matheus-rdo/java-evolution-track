package interfaces.staticmethods;

public interface Printer {

    /**
     * This cannot be overriden
     * This cannot be accessed directly through implementations (e.g: Subclass.print())
     */
    static void print(String str) {
        System.out.println("Printing " + str);
    }

}
