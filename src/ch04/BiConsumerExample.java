package ch04;

import java.util.function.BiConsumer;

public class    BiConsumerExample {
    public static void executeBiConsumer(String param1,String param2,BiConsumer<String,String> biConsumer){
        biConsumer.accept(param1,param2);
    }

    public static void main(String[] args) {
        BiConsumer<String,String>biConsumer=(param1,param2)->{
            System.out.println(param1);
            System.out.println(param2);
        }
        ;
        BiConsumerExample.executeBiConsumer("Hello","world!",biConsumer);
    }
}
