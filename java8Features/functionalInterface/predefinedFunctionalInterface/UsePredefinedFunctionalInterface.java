package java8Features.functionalInterface.predefinedFunctionalInterface;

import java.util.function.IntBinaryOperator;

public class UsePredefinedFunctionalInterface {

    public static void main(String[] args) {

        IntBinaryOperator sum = (a, b) -> a + b;
        System.out.println("Result: " + sum.applyAsInt(11, 22));
    }
}
