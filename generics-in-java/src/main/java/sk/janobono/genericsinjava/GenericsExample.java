package sk.janobono.genericsinjava;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {
        // Example without Generics
        List names = new ArrayList();
        names.add("Kelly");
        names.add(7);
        String name = (String) names.get(0);
        System.out.println("First name: " + name);


        // Example with Generics
        List<String> names2 = new ArrayList<>();
        names2.add("Kelly");
        //this will not work
        //names2.add(7);
        String name2 = names2.get(0);
        System.out.println("First name: " + name2);
    }
}
