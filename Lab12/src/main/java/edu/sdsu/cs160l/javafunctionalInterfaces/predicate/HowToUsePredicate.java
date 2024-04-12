package edu.sdsu.cs160l.javafunctionalInterfaces.predicate;

import java.util.function.Predicate;

/**
 * TO_READ: Uses the {@link java.util.function.Predicate} interface at its base
 * A Predicate is a function that always returns a {@link Boolean} or boolean
 * So a predicate is a use case wherein you pass something and get a boolean back
 * So a predicate just "test"s a value.
 * so your lambda looks like (t)->{return boolean} or t->boolean
 */
public class HowToUsePredicate {
  //Note Predicate is a generic interface.
  //the first type you pass in the <> is the type of argument you get in your lambda function, return is always boolean
  private static final Predicate<String> evenLengthStrings = s -> s.length() % 2 == 0;

  public static void main(String[] args) {
    System.out.println(evenLengthStrings.test("Class"));
    System.out.println(evenLengthStrings.test("Hmac"));
    System.out.println(evenLengthStrings.test("Java Functional Programming"));
  }
}
