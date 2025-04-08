package se.lexicon;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        ex2();
    }

    public static void ex1(){
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Cherry");

        System.out.println("fruits = " + fruits);


    }

    public static void ex2(){
        HashSet<Person> people = new HashSet<>();
        people.add(new Person(3, "John", "john@test.se"));
        people.add(new Person(1, "Alice", "alice@test.se"));
        people.add(new Person(2, "Alice", "alice@xyz.se"));
        // ** Override equal and hashCode** to allow proper handling of duplicates in HashSet.
        people.add(new Person(2, "Alice", "alice@xyz.se"));

        for (Person person : people){
            System.out.println(person);
        }

    }


}
