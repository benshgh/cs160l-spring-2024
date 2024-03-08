package edu.sdsu.cs160l.generics.convariance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhatIsCovarianceAndContravariance {
    public void covariance() {
        //TRY adding 1.01f to generic
        List<? extends Number> generic = new ArrayList<Float>(Arrays.asList(1.1f, 2.3f));
        Number n = generic.get(0);
        //TRY reading above line as Float;
    }

    public void contravariance() {
        List<? super Number> generic = new ArrayList<>(Arrays.asList(1.1f, 2.3f));
        generic.add(1.1f);

        //TRY reading first element of list as Number or float;
    }

    public static List<? super Number> copyList(List<? extends Number> source){
        // use super when you want to put into and extend when you want to get from
        List<? super Number> destination= new ArrayList<>();
        for(Number n : source){
            destination.add(n);
        }
        return destination;
    }

    public static void main(String[] args) {
        List<? super Number> ints = copyList(new ArrayList<>(Arrays.asList(1,2,3,4,5)));
        List<? super Number> doubles = copyList(new ArrayList<>(Arrays.asList(1.00,2.54,3.1,4.13,5.45)));
        ints.forEach(System.out::println);
        doubles.forEach(System.out::println);
    }
}
