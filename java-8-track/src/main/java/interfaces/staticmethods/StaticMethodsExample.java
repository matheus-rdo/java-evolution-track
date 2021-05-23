package interfaces.staticmethods;

public class StaticMethodsExample {

    public static void main(String[] args) {
        Printer.print("from interface!");

        // Static method may be invoked on containing interface class only
        // PrinterImpl.print("oops, it not compiles!");
    }
}
