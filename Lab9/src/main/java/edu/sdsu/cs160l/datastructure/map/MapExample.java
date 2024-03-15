package edu.sdsu.cs160l.datastructure.map;

import java.util.HashMap;
import java.util.Map;

/**
 * In class explanation + demonstration
 * Maps are perfect to use for key-value association mapping such as dictionaries.
 * Maps are an array of linked list where each list is treated as a bucket of similar hash values.
 */
public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // put adds an element takes O(1) time
        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // remove takes O(1) time
        map.remove(0);

        //get take O(1) time

        String value = map.get(1); //value is "One"
        String value1 = map.getOrDefault(4, "Not Present"); //value is "Not Present"

        //containsKey - O(1) time

        map.containsKey(2);

        //containsValue - O(n) time
        map.containsValue("Three");
    }
}
