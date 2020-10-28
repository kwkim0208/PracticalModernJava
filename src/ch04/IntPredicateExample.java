package ch04;

import java.util.function.IntPredicate;

public class IntPredicateExample {
    public static boolean isPostive(int i, IntPredicate intPredicate) {
        return intPredicate.test(i);
    }

    public static void main(String[] args) {
        for(int i=0;i<1_000_00;i++){
            IntPredicateExample.isPostive(i,(int integerValue)->integerValue>0);
        }
    }
}
