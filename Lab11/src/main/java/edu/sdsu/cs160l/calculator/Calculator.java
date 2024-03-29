package edu.sdsu.cs160l.calculator;

/**
 * Basic calculator operations
 */
public interface Calculator {
    int add(int a, int b);
    int sub(int a, int b);
    int div(int a, int b) throws ArithmeticException;
    int mul(int a, int b);
}
