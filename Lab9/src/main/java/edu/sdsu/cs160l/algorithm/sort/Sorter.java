package edu.sdsu.cs160l.algorithm.sort;

import java.util.Comparator;

/**
 * An interface to create common abstraction for sorting
 * Note how the method signature is very similar to {@link java.util.Arrays}.sort()
 */
public interface Sorter {

    <T> void sort(T[] collection);

    <T> void sort(T[] collection, Comparator<? super T> comparisonStrategy);
}