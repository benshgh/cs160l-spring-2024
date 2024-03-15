package edu.sdsu.cs160l.datastructure.set;

import java.util.HashSet;
import java.util.Set;

/**
 * In class explanation + demonstration
 * A HashSet is a HashMap with no values
 */
public class SetExample {
    public static void main(String[] args) {
        //creating a list
        Set<Integer> set = new HashSet<>();

        // add() – takes O(1) time
        set.add(1);
        set.add(2);
        set.add(3);

        // add(index, element)
        // Not Supported

        // get() – is always a constant time O(1) operation
        // Not Supported

        // remove() – runs in linear O(1) time.
        set.remove(1);

        // indexOf() – also runs in linear time. It iterates through the internal array and checks each element one by one, so the time complexity for this operation always requires O(n) time.
        // Not Supported

        // contains() – runs in O(1) time.
        boolean contains = set.contains(3);
    }
}
