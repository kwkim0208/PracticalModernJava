package ch04;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceExample {
    public static MethodReferenceExample of(){
        return new MethodReferenceExample();
    }
    public static void executeMethod(String entity){
        if(entity!=null&&!"".equals(entity)){
            System.out.println("Contents:"+entity);
            System.out.println("Length:"+entity.length());
        }
    }
    public void toUpperCase(String entity){
        System.out.println(entity.toUpperCase());
    }

    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.stream().forEach(MethodReferenceExample::executeMethod);
        list.stream().forEach(MethodReferenceExample.of()::toUpperCase);
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
