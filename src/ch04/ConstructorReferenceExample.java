package ch04;

import java.util.ArrayList;
import java.util.List;

public class ConstructorReferenceExample {
    private String name;
    public ConstructorReferenceExample(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Laptop brand name:"+name;
    }

    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Applet");
        list.add("Samsung");
        list.add("LG");
        list.add("Apple");
        list.add("Lenovo");
        System.out.println("Lambda Expression!!");
        list.stream().map((String name)->new ConstructorReferenceExample(name)).forEach((ConstructorReferenceExample data)-> System.out.println(data));
        System.out.println("Constructor Expression!!!");
        list.stream().map(ConstructorReferenceExample::new).forEach((ConstructorReferenceExample data)-> System.out.println(data));
        System.out.println("Method Reference!!");
        list.stream().map(ConstructorReferenceExample::new).forEach(System.out::println);

    }
}
