package edu.sdsu.cs160l;

import edu.sdsu.cs160l.advancedhandling.StreamOperation;

/**
 * Locate 2 todos in
 * Registrar
 * RegistrarTest
 * <p>
 *
 */
public class AdvancedFPMain {
    public static void main(String[] args) {
        StreamOperation streamOperations = new StreamOperation();

        streamOperations.flatten2DArrayTo1DArray()
                .forEach(e -> System.out.print("\t" + e));
        System.out.println();
        System.out.println("Sum of all elements is :: " + streamOperations.sumOfAllElements());
        System.out.println("Average of all elements is :: " + streamOperations.averageOfAllElements());
        System.out.println("Max of all elements is :: " + streamOperations.maxOfAllElements());
        System.out.println("Does any row have a number that is multiple of 5 :: " + streamOperations.rowWithMultipleOf5());
        // nested operations
        streamOperations
                .sumOfEachRow()
                .forEach(e -> System.out.println("Sum in each row :: " + e));
        streamOperations
                .averageOfEachRow()
                .forEach(e -> System.out.println("Average in each row :: " + e));
        streamOperations
                .maxInEachRow()
                .forEach(e -> System.out.println("Max in each row :: " + e));
        streamOperations
                .firstSingleDigitInRow()
                .forEach(e -> System.out.println("First single digit in each row :: " + e));

        System.out.println("Max 2 elements in reach row.");
        streamOperations
                .max2ElementsInEachRow()
                .forEach(list -> {
                    list.forEach(e -> System.out.print("\t" + e));
                    System.out.println();
                });
    }
}
