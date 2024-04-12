package edu.sdsu.cs160l.javafunctionalInterfaces.supplier;

import java.util.function.Supplier;

/**
 * TO_READ: Uses the {@link java.util.function.Supplier} interface at its base
 * It's exactly opposite to what a {@link java.util.function.Consumer} does.
 * A supplier is a use case wherein you pass nothing and get something back
 * So a supplier just "get"s you a value.
 * so your lambda looks like ()->{return s} or ()->s
 */
public class HowToUseSupplier {
  //Note Supplier is a generic interface.
  //Whatever type you pass in the <> is the return type of your lambda function
  private static final Supplier<String> classNameSupplier = () -> "Welcome to CS160L functional programming lab";

  public static void main(String[] args) {
    String className = classNameSupplier.get();
    System.out.println(className);
  }


}
