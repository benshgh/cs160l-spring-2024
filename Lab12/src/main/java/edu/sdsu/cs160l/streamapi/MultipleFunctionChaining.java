package edu.sdsu.cs160l.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleFunctionChaining {
  private final List<Integer> smallNumbers;

  public MultipleFunctionChaining() {
    smallNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
  }

  public int addAllNumbersWhoseDoubleIsGreaterThan9() {
    return smallNumbers
       .stream()
       .map(e -> e * 2)
       .filter(e -> e > 9)
       .reduce(0, (a, b) -> a + b);
  }

  public int doItWithoutStream() {
    int sum = 0;
    for (Integer e : smallNumbers) {
      int doubledValue = e * 2;
      if (doubledValue > 9) {
        sum += doubledValue;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    MultipleFunctionChaining multipleFunctionChaining = new MultipleFunctionChaining();
    System.out.println(multipleFunctionChaining.addAllNumbersWhoseDoubleIsGreaterThan9());
    System.out.println(multipleFunctionChaining.doItWithoutStream());
  }

}
