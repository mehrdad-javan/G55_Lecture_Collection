package se.lexicon;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(); // [0]
        ArrayList<Integer> numbers = new ArrayList<>(); // [0]
        // int -> Integer
        // long -> Long
        // boolean -> Boolean

        ex2();
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
            if (bookName.equals("OCP")){
                iterator.remove(); // it safely removes all the elements that their value is equal to OCP
            }
        }

        System.out.println("---------------");

        for (String bookName : bookNames) {
            System.out.println(bookName);
        }
        System.out.println("----------------");
        for (int i = 0 ; i< bookNames.size(); i++){
            System.out.println(bookNames.get(i));
        }


    }

    public static void ex2(){
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




}
