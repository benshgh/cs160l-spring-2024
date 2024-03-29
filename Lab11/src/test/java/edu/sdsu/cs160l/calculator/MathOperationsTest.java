package edu.sdsu.cs160l.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.suite.api.Suite;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

//TODO add Extension for Mockito and Test Suite
@ExtendWith(MockitoExtension.class)
@Suite()
class MathOperationsTest {

    //TODO add annotation for injecting mocks
    @InjectMocks
    private MathOperations mathOperations;

    //TODO add annotation for Mock
    @Mock
    private SimpleCalculator calculator;

    /**
     * Any test function is always "public void <testScenarioName>()"
     * and annotated with @Test
     * the general syntax for stubbing a mock is
     * doAnswer(invocation -> {
     * // mock logic goes here
     * }).when(<mockobject>).functionCall()
     */
    @Test
    public void testFactorial() {
        doAnswer(invocation -> {
            int a = invocation.getArgument(0);
            int b = invocation.getArgument(1);
            return a * b;
        })
                .when(calculator)
                .mul(anyInt(), anyInt());
        assertEquals(6, mathOperations.factorial(3));
    }

    @Test
    public void testAverage() {

        //TODO add stub for making the average method work in mathOperations class
        assertEquals(2, mathOperations.average(new int[]{1, 2, 3}));
    }

    @Test
    public void testPower() {

        //TODO add stub for making the average method work in mathOperations class
        assertEquals(8, mathOperations.power(2, 3));
    }

    @Test
    public void testMidValue() {

        //TODO add stub for making the average method work in mathOperations class
        assertEquals(10, mathOperations.midValue(5, 15));
    }

    @Test
    public void testFToC() {

        //TODO add stub for making the average method work in mathOperations class
        assertEquals(0, mathOperations.fahrenheitToCelsius(32));
    }


}