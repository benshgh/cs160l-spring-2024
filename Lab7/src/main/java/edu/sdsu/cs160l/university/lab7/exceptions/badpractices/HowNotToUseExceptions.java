package edu.sdsu.cs160l.university.lab7.exceptions.badpractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowNotToUseExceptions {
  public static void main(String[] args) {
    doNotDoThis();
  }

  public static void doNotDoThis() {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    int i = 0;
    try {
      while (true) {
        System.out.println(list.get(i++));
      }
    } catch (IndexOutOfBoundsException e) {
      System.err.println("Loop terminated :: " + e.getMessage());
    }
  }
}
