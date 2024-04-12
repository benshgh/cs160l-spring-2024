package edu.sdsu.cs160l.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TO_READ : Java 8 + has an excellent support to convert your loops and data processing into pipelines of workload
 * the most common use cases are map reduce and filter.
 * The stream api is available to use on Java Collections
 */
public class DataProcessing {
  private final List<Integer> smallNumbers;

  public DataProcessing() {
    smallNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
  }

  /**
   * A map operation converts the existing collection to a collection with
   * 1) same type
   * 2) different type
   * using the mapping function you pass to map()
   * it does not alter the size of the list.
   */
  public List<Integer> howToMapToSameType() {
    return smallNumbers
       .stream()
       .map(e -> e * 2)
       .collect(Collectors.toList());
  }

  public List<String> howToMapToDifferentType() {
    return smallNumbers
       .stream()
       .map(e -> "number :: " + e)
       .collect(Collectors.toList());
  }

  /**
   * A filter operation shrinks the list to only the elements in the list that return true for the predicate passed in the filter().
   * It may or may not alter the size of the list.
   * It does not alter the data type
   */
  public List<Integer> howToFilter() {
    return smallNumbers
       .stream()
       .filter(e -> e > 5)
       .collect(Collectors.toList());
  }

  /**
   * A reduce operation reduces the collection to a single element of the same type.
   * You have a Binary operation that defines the reducing strategy.
   */
  public Integer howToReduce() {
    return smallNumbers
       .stream()
       .reduce(0, (a, b) -> a + b);
  }

  public void listPrinter(List<?> listOfAnyElements) {
    listOfAnyElements
       .stream()
       .forEach(e -> System.out.print("\t" + e));
    System.out.println();

    /*
    Another way to go around this is
    note forEach does not require .stream() to be invoked
    and how method reference is used

    listOfAnyElements
       .forEach(System.out::println);
    */
  }

  public static void main(String[] args) {
    DataProcessing dataProcessing = new DataProcessing();
    dataProcessing.listPrinter(dataProcessing.howToMapToSameType());
    dataProcessing.listPrinter(dataProcessing.howToMapToDifferentType());
    dataProcessing.listPrinter(dataProcessing.howToFilter());
    System.out.println(dataProcessing.howToReduce());
  }

}
