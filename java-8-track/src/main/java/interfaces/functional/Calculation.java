package interfaces.functional;

import java.math.BigDecimal;

/**
 * Functional Interface is a Interface with exactly one single abstract method.
 * This allows the benefit of instantiating the interface via lambda expression.
 */
@FunctionalInterface // Helps to avoid accidental addition of new methods on functional interfaces
public interface Calculation {

    BigDecimal calculate(Number a, Number b);

}
