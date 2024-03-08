package edu.sdsu.cs160l.generics.wildcard;

import edu.sdsu.cs160l.model.Student;

import java.util.*;

public class WildCardPrinter {

    public <T> void printSingle(T t) {
        System.out.println(t);
    }

    public <T> void printType(List<T> t) {
        t.forEach(System.out::println);
    }

    public void printWildCard(List<?> t) {
        t.forEach(System.out::println);
    }

    private void printCollection(Collection<?> t) {
        t.forEach(System.out::println);
    }

    public static void main(String[] args) {
        WildCardPrinter printer = new WildCardPrinter();
        printer.printSingle(new Student(123L, "Hmac", 3.7));
        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 3, 4, 3, 4, 5, 6, 7, 8));

        Set<Integer> distinctInts = new HashSet<>(Arrays.asList(1, 2, 1, 2, 3, 4, 3, 4, 5, 6, 7, 8));
        // prints only list but of all types - called type generics
        printer.printType(ints);
        System.out.println("--------------------------");
        printer.printWildCard(ints);
        System.out.println("--------------------------");
        // prints any collection of any type - called inheritance generics
        printer.printCollection(distinctInts);
        System.out.println("--------------------------");
        printer.printCollection(ints);
    }
}
