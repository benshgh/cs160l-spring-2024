package edu.sdsu.cs160l.javafunctionalInterfaces.consumer;

import java.util.function.Consumer;

/**
 * TO_READ: Uses the {@link java.util.function.Consumer} interface at its base
 * A consumer is a use case wherein you pass something and get nothing back
 * So a consumer just "accept"s a value.
 * so your lambda looks like (s)->{}
 */
public class HowToUseConsumer {
  //Note Consumer is a generic interface.
  //Whatever type you pass in the <> is the type of argument you get in your lambda function
  private static final Consumer<String> printer = (s) -> System.out.println("This is printer :: " + s);

  public static void main(String[] args) {
    printer.accept("Hello class");
  }
}
