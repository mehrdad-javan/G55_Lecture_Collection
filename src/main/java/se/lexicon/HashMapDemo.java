package se.lexicon;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> concatcHashMap = new HashMap<>();
        concatcHashMap.put("Simon", "simon@lexicon.se");
        concatcHashMap.put("Ulf", "ulf@lexicon.se");
        concatcHashMap.put("Mehrdad", "mehrdad@lexicon.se");

        System.out.println(concatcHashMap.get("Mehrdad"));

        HashMap<Integer, Person> contactHashMap2 = new HashMap<>();
        contactHashMap2.put(1, new Person(1, "test", "test@test.se"));

    }
}
