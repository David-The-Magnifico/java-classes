package chapter17.functionalInterface;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorImpl {
    public static void main(String[] args) {
        DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a * b;
        System.out.println(doubleBinaryOperator.applyAsDouble(8.0, 4.0));
    }
}