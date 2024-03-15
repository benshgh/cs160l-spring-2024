package edu.sdsu.cs160l.algorithm.search;

import java.util.List;

public class LinearSearch implements Search {
    /**
     * In class explanation + demonstration
     * Linear search has you iterate over the input set of size n at least once
     * Its runtime complexity in O(n) n being the input size.
     * Its space complexity is O(1)
     */
    @Override
    public <T extends Comparable<? super T>> int search(List<T> list, T t) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(t)) {
                return i;
            }
        }
        return -1;
    }
}
