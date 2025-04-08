package se.lexicon;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(); // [0]
        ArrayList<Integer> numbers = new ArrayList<>(); // [0]
        // int -> Integer
        // long -> Long
        // boolean -> Boolean

        ex6();
    }


    public static void ex1() {
        ArrayList<String> bookNames = new ArrayList<>();
        bookNames.add("Java"); //
        bookNames.add("Java"); // ["Java", "Java"]
        bookNames.add("Spring");
        bookNames.add("React");
        bookNames.add("Clean Code");
        bookNames.add("OCP");
        bookNames.add("OCP");

        System.out.println(bookNames);
        System.out.println(bookNames.size());

        System.out.println(bookNames.get(0)); //Java
        System.out.println(bookNames.get(1)); //Java
        System.out.println(bookNames.get(2)); //Spring
        // System.out.println(bookNames.get(10));


        System.out.println("---------------");
        Iterator<String> iterator = bookNames.iterator();
        while (iterator.hasNext()) {
            String bookName = iterator.next(); // "Java"
            if (bookName.equals("OCP")) {
                iterator.remove(); // it safely removes all the elements that their value is equal to OCP
            }
        }

        System.out.println("---------------");

        for (String bookName : bookNames) {
            System.out.println(bookName);
        }
        System.out.println("----------------");
        for (int i = 0; i < bookNames.size(); i++) {
            System.out.println(bookNames.get(i));
        }


    }

    public static void ex2() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(100);
        numbers.add(400);
        numbers.add(300);
        numbers.add(200);

        System.out.println(numbers.size()); // 5
        boolean isRemoved = numbers.remove(Integer.valueOf(100));
        System.out.println("isRemoved = " + isRemoved);
        System.out.println(numbers.size()); // 4
        Integer removedNumber = numbers.remove(2);
        System.out.println("removedNumber = " + removedNumber);
        System.out.println(numbers.size()); // 3

    }

    public static void ex3() {
        ArrayList<String> euCars = new ArrayList<>();
        euCars.add("Volvo");
        euCars.add("BMW");
        euCars.add("Volvo");
        //  "Tesla";

        ArrayList<String> usaCars = new ArrayList<>();
        usaCars.add("Tesla");

        euCars.addAll( 1, usaCars);

        System.out.println("euCars = " + euCars);
        // euCars = [Volvo, Tesla, BMW, Volvo]

        System.out.println(euCars.lastIndexOf("Volvo")); // 3
        System.out.println(euCars.indexOf("Volvo")); // 0


    }

    public static void ex4(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);
        System.out.println("Original List : " + numbers);

        //Collections.sort(numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted List : " + numbers);
        //numbers.sort(Comparator.naturalOrder());
        numbers.sort(Comparator.reverseOrder());
        //Collections.shuffle(numbers);
        //System.out.println(numbers);
    }

    public static void ex5(){
        Person person1 = new Person(1, "Mehrdad", "mehrdad.javan@lexicon.se");
        Person person2 = new Person(1, "Mehrdad", "mehrdad.javan@lexicon.se");
        System.out.println(person1.toString()); // ?
        boolean isEqualTwoPersons = person1.equals(person2); // true
        System.out.println("isEqualTwoPersons = " + isEqualTwoPersons);

        String test1 = "TEST";
        String test2 = "TEST";
        System.out.println(test1.equals(test2)); // true
        int num1 = 100;
        int num2 = 100;
        boolean isEqualNumbers = num1 == num2;
        System.out.println("isEqualNumbers = " + isEqualNumbers);

    }

    public static void ex6(){

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(3, "John", "john@test.se"));
        people.add(new Person(1, "Alice", "alice@test.se"));
        people.add(new Person(2, "Alice", "alice@xyz.se"));
        people.add(new Person(4, "Bob", "bob@test.se"));

        System.out.println("-----------------");
        System.out.println("Original List: ");
        for (Person person : people){
            System.out.println(person);
        }


        // Comparator
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getId(), o2.getId()); // Ascending Order
            }
        });

        // if o1.getId < o2.getId -> return a negative number =  o1 should come before o2
        // if o1.getId == o2.getId - return a zero =  both are considered equal
        // if o1.getId > o2.getId -> return a positive number =  o1 should come after o2

        //Collections.sort(people, (o1, o2) -> Integer.compare(o1.getId(), o2.getId()));
        //Collections.sort(people, Comparator.comparingInt(Person::getId));

        System.out.println("-----------------");
        System.out.println("Sorted List By Id: ");
        for (Person person : people){
            System.out.println(person);
        }

    }

}
