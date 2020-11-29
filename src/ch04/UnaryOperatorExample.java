package ch04;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> operatorA= (Integer t)->t*2;
        System.out.println(operatorA.apply(1));
        System.out.println(operatorA.apply(2));
        System.out.println(operatorA.apply(3));
        UnaryOperator<String>operatorB=(String s)->s+" training";
        System.out.println(operatorB.apply("lambda"));
    }
}
