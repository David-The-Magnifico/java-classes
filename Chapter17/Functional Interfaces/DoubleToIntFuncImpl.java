package chapter17.functionalInterface;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFuncImpl {
    public static void main(String[] args) {
        DoubleToIntFunction doubleToIntFunction = (number)-> (int) number;
        System.out.println(doubleToIntFunction.applyAsInt(35.590));
    }
}