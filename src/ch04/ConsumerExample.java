package ch04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void executeConsumer(List<String> nameList, Consumer<String>consumer){
        for(String name:nameList)
            consumer.accept(name);
    }

    public static void main(String[] args) {
        List<String>nameList=new ArrayList<>();
        nameList.add("정수빈");
        nameList.add("김재호");
        nameList.add("오채원");
        nameList.add("이영하");
        ConsumerExample.executeConsumer(nameList, System.out::println);
    }
}
