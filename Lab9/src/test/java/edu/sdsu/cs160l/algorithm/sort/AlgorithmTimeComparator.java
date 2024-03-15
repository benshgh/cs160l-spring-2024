package edu.sdsu.cs160l.algorithm.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.stream.IntStream;

import static edu.sdsu.cs160l.TestUtils.printExecutionTime;

public class AlgorithmTimeComparator {
    Integer[] small;
    Integer[] medium;
    Integer[] large;
    private BubbleSort bubbleSort;
    private QuickSort quickSort;
    private MergeSort mergeSort;

    @BeforeEach
    public void init() {
        bubbleSort = new BubbleSort();
        quickSort = new QuickSort();
        mergeSort = new MergeSort();
        small = IntStream.range(0, 10).boxed().toArray(Integer[]::new);
        medium = IntStream.range(0, 100).boxed().toArray(Integer[]::new);
        large = IntStream.range(0, 1000).boxed().toArray(Integer[]::new);
    }

    @Test
    public void compareTimeOfSortingAlgorithms() {
        //Bubble Sort
        System.out.println("Bubble Sort :: small, medium, large");
        printExecutionTime(() -> bubbleSort.sort(small, Comparator.reverseOrder()));
        printExecutionTime(() -> bubbleSort.sort(medium, Comparator.reverseOrder()));
        printExecutionTime(() -> bubbleSort.sort(large, Comparator.reverseOrder()));

        //Quick Sort
        System.out.println("Quick Sort :: small, medium, large");
        printExecutionTime(() -> quickSort.sort(small, Comparator.reverseOrder()));
        printExecutionTime(() -> quickSort.sort(medium, Comparator.reverseOrder()));
        printExecutionTime(() -> quickSort.sort(large, Comparator.reverseOrder()));

        //Merge Sort
        System.out.println("Merge Sort :: small, medium, large");
        printExecutionTime(() -> mergeSort.sort(small, Comparator.reverseOrder()));
        printExecutionTime(() -> mergeSort.sort(medium, Comparator.reverseOrder()));
        printExecutionTime(() -> mergeSort.sort(large, Comparator.reverseOrder()));
    }
}
