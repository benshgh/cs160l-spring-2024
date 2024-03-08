package edu.sdsu.cs160l.convertingtogenerics;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Compare similarities between {@link IntegerCollectionPrinter} and {@link StringCollectionPrinter}
 * See if we can generalize them a bit more?
 *
 * What is each function doing ?
 * How does the improvised for loop work ?
 * Is there a class or an interface that can be used as a common ground for list and set ?
 * Can we merge {@link IntegerCollectionPrinter} and {@link StringCollectionPrinter} ?
 */
public class IntegerCollectionPrinter implements CollectionPrinter<Integer> {
    @Override
    public void print(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    @Override
    public void print(Set<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    @Override
    public void print(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " | " + e.getValue());
        }
    }
}
