package interfaces.functional;

import java.math.BigDecimal;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        // Legacy
        Calculation division = new Calculation() {
            @Override
            public BigDecimal calculate(Number a, Number b) {
                return BigDecimal.valueOf(a.doubleValue() / b.doubleValue());
            }
        };

        // New - Functional Interface and Lambda Expression
        Calculation sum = (a, b) -> BigDecimal.valueOf(a.doubleValue() + b.doubleValue());


    }
}
