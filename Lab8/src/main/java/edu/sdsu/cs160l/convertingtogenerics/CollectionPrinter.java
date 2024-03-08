package edu.sdsu.cs160l.convertingtogenerics;

import java.util.List;
import java.util.Map;
import java.util.Set;
/*
public interface CollectionPrinter {
    void print(List<Integer> list);
    void print(Set<Integer> list);
    void print(Map<Integer,Integer> list);
}
*/

/**
 *
 * @param <T> is a generic type that can be used by people to decide type they want to use during implementation
 */
public interface CollectionPrinter<T> {
    void print(List<T> list);
    void print(Set<T> list);
    void print(Map<T,T> map);
}
