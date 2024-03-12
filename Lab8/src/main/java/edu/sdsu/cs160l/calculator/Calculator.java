package edu.sdsu.cs160l.calculator;

/**
 * Basic calculator operations
 * TODO Make the calculator interface generic, so it accepts any type T instead of just integers
 *  Remember it should accept a generic type and be bounded only to numbers ({@link Number} class).
 *  Create concrete classes
 *  1) IntegerCalculator such that it implements Calculator<Integer>
 *  2) DoubleCalculator such that it implements Calculator<Double>
 *         in case of Double calculator you may remove exception and return Double.POSITIVE_INFINITY when divisor is 0
 *
 */
public interface Calculator<T extends Number> {
    T add(T a, T b);
    T sub(T a, T b);
    T div(T a, T b) throws ArithmeticException;
    T mul(T a, T b);
}
