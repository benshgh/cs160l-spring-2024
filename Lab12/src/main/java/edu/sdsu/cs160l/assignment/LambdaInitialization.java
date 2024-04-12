package edu.sdsu.cs160l.assignment;

public class LambdaInitialization {
    interface Operation<T, R> {
        R operate(T t1, T t2);
    }

    interface Concatenate<T, V, R> {
        R concatenate(T t, V v);
    }

    /**
     * TODO (carries 1 point)
     */
    public Operation<Float, Double> division() {
        // TODO return a lambda initialization of Operation interface that divides the 2 parameters
        //  a valid return statement has to be lambda syntax "()->"
        return null;
    }

    /**
     * TODO (carries 1 point)
     */
    public Concatenate<Double, Integer, String> numberConcatenate() {
        // TODO return a lambda initialization of Concatenate interface
        //  that takes a double and int and returns them "-" concatenated
        //  eg input 3.4, 8 return "3.4-8"
        //  a valid return statement has to be lambda syntax "()->"
        return null;
    }
}
