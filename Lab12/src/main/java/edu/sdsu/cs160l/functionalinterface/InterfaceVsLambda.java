package edu.sdsu.cs160l.functionalinterface;

public class InterfaceVsLambda {

  /**
   * Create an implementation of Operation interface
   */
  static class AddOperation implements Operation {
    @Override
    public int operate(int a, int b) {
      return a + b;
    }
  }

  /**
   * Creating an instance of Operation class using lambda syntax
   */
  private static final Operation subtractOperation = (a, b) -> a - b;

  public static void main(String[] args) {
    Operation addOperation = new AddOperation();

    System.out.println(addOperation.operate(10, 3));
    System.out.println(subtractOperation.operate(10, 3));
  }

}
