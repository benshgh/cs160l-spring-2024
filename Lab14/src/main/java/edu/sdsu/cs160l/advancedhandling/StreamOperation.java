package edu.sdsu.cs160l.advancedhandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class  StreamOperation {
  private final List<List<Integer>> numbers;

  public StreamOperation() {
    this.numbers = new ArrayList<>();
    List<Integer> row1 = new ArrayList<>(Arrays.asList(1, 6, 8, 5));
    List<Integer> row2 = new ArrayList<>(Arrays.asList(19, 2, 7, 11));
    List<Integer> row3 = new ArrayList<>(Arrays.asList(15, 4, 3, 13));
    List<Integer> row4 = new ArrayList<>(Arrays.asList(14, 12, 9, 16));
    numbers.add(row1);
    numbers.add(row2);
    numbers.add(row3);
    numbers.add(row4);
  }

  public List<Integer> flatten2DArrayTo1DArray() {
    return numbers
       .stream()
       .flatMap(list -> list.stream())
       .collect(Collectors.toList());
  }

  public Integer sumOfAllElements() {
    return numbers
       .stream()
       .flatMap(list -> list.stream())
       .mapToInt(integer -> integer.intValue())
       .sum();
  }

  public Double averageOfAllElements() {
    return numbers
       .stream()
       .flatMap(list -> list.stream())
       .mapToInt(integer -> integer.intValue())
       .average()
       .orElse(0);
  }

  public Integer maxOfAllElements() {
    return numbers
       .stream()
       .flatMap(list -> list.stream())
       .mapToInt(integer -> integer.intValue())
       .max()
       .orElse(0);
  }


  public List<Integer> sumOfEachRow() {
    return numbers
       .stream()
       .map(list -> list // since each row is a list or a collection you can invoke stream api on each row
          .stream()
          .mapToInt(value -> value.intValue()) // mapToInt changes Stream<Integer> to IntStream which has built in methods like sum
          .sum())
       .collect(Collectors.toList());
  }

  public List<Integer> maxInEachRow() {
    return numbers
       .stream()
       .map(list -> list // since each row is a list or a collection you can invoke stream api on each row
          .stream()
          .mapToInt(value -> value.intValue()) // mapToInt changes Stream<Integer> to IntStream which has built in methods like max
          .max()
          .orElse(0))
       .collect(Collectors.toList());
  }

  public List<Double> averageOfEachRow() {
    return numbers
       .stream()
       .map(list -> list // since each row is a list or a collection you can invoke stream api on each row
          .stream()
          .mapToInt(value -> value.intValue()) // mapToInt changes Stream<Integer> to IntStream which has built in methods like max
          .average()
          .orElse(0))
       .collect(Collectors.toList());
  }

  public List<Integer> firstSingleDigitInRow() {
    return numbers
       .stream()
       .map(list -> list // since each row is a list or a collection you can invoke stream api on each row
          .stream()
          .filter(e -> e < 10)
          .findFirst() // return the first element that stream encounters
          .orElse(0)) // if no element is found return 0
       .collect(Collectors.toList());
  }

  public List<List<Integer>> max2ElementsInEachRow(){
    return numbers
       .stream()
       .map(list-> list
          .stream()
          .sorted(Comparator.reverseOrder()) //sort in reverse order to support
          .limit(2) //limits the stream to first 2 elements
          .collect(Collectors.toList()))
       .collect(Collectors.toList());
  }

  public boolean rowWithMultipleOf5() {
    return numbers
       .stream()
       .anyMatch(integers -> integers // returns true if any one element passing the condition is found;
          .stream()
          .anyMatch(integer -> integer % 5 == 0));
  }

}
