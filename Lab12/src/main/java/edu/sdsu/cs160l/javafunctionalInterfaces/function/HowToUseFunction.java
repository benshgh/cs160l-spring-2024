package edu.sdsu.cs160l.javafunctionalInterfaces.function;

import java.util.function.Function;

/**
 * TO_READ: Uses the {@link java.util.function.Function} interface at its base
 * A function is a use case wherein you pass something and get something back
 * So a function just "apply"s a value.
 * so your lambda looks like (t)->{return r} or t->r
 */
public class HowToUseFunction {

  //Note Function is a generic interface.
  //the first type you pass in the <> is the type of argument you get in your lambda function
  //the second type you pass in the <> is the return type of your lambda function
  private static final Function<String, Integer> stringLength = s -> s.length();

  public static void main(String[] args) {
    System.out.println(stringLength.apply("Class"));
    System.out.println(stringLength.apply("Hmac"));
    System.out.println(stringLength.apply("Java Functional Programming"));
  }
}
