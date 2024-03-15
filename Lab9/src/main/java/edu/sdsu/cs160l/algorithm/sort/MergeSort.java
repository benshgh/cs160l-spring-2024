package edu.sdsu.cs160l.algorithm.sort;

import java.util.Comparator;

/**
 * TODO assignment (4 points)
 *  implement mergesort in a similar way as quick sort and bubble sort structurally
 *
 *  hint to create a generic array use T[] t = (T[])(new Object[])
 */
public class MergeSort implements Sorter {
    @Override
    @SuppressWarnings("unchecked")
    public <T> void sort(T[] c) {
        Comparable[] comparable = (Comparable[]) c;
        sort(comparable, Comparator.naturalOrder());
    }

    @Override
    public <T> void sort(T[] c, Comparator<? super T> comparisonStrategy) {

    }

}
