package edu.sdsu.cs160l.assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static edu.sdsu.cs160l.assignment.LambdaInitialization.Operation;
import static org.junit.jupiter.api.Assertions.*;

class LambdaInitializationTest {

    private LambdaInitialization lambdaInitialization;

    @BeforeEach
    public void init() {
        lambdaInitialization = new LambdaInitialization();
    }

    @Test
    void division() {
        Operation<Float, Double> operation = lambdaInitialization.division();
        assertNotNull(operation);
        assertTrue(operation.getClass().getSimpleName().contains("$$Lambda"));
        assertEquals("0.60", String.format("%.2f", operation.operate(1.2f, 2f)));
    }

    @Test
    void numberConcatenate() {
        LambdaInitialization.Concatenate<Double, Integer, String> concatenate = lambdaInitialization.numberConcatenate();
        assertNotNull(concatenate);
        assertTrue(concatenate.getClass().getSimpleName().contains("$$Lambda"));
        assertEquals("2.3-10", concatenate.concatenate(2.3, 10));
    }
}