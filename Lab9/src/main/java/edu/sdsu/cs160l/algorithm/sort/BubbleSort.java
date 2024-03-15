package edu.sdsu.cs160l.algorithm.sort;

import java.util.Comparator;

/**
 * In class explanation + demonstration
 * encompasses use of generics and bubble-sort algorithm
 */
public class BubbleSort implements Sorter {
    @Override
    @SuppressWarnings("unchecked")
    public <T> void sort(T[] c) {
        Comparable[] comparable = (Comparable[]) c;
        sort(comparable, Comparator.naturalOrder());
    }

    @Override
    public <T> void sort(T[] c, Comparator<? super T> comparisonStrategy) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                // A key point is to understand how this comparison works using comparators
                // You can accept custom comparators using this
                // comparing c[i], c[j] < 0 means c[i] > c[j] and the values must be swapped
                if (comparisonStrategy.compare(c[i], c[j]) < 0) {
                    swap(c, i, j);
                }
            }
        }
    }

    private <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
