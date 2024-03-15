package edu.sdsu.cs160l;

import java.util.function.Supplier;

public class TestUtils {

    public static <T> T printExecutionTime(Supplier<T> fn) {
        long startTime = System.nanoTime();
        T o = fn.get();
        long timeEnd = System.nanoTime();
        System.out.println("Time to execute :: " + (timeEnd - startTime) / 1000 + " milliseconds");
        return o;
    }

    public static void printExecutionTime(Runnable fn) {
        long startTime = System.nanoTime();
        fn.run();
        long timeEnd = System.nanoTime();
        System.out.println("Time to execute :: " + (timeEnd - startTime) / 1000 + " milliseconds");
    }
}
