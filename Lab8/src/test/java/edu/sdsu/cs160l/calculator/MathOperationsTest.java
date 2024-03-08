package edu.sdsu.cs160l.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.suite.api.Suite;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doAnswer;

class MathOperationsTest {

    private MathOperations mathOperations;

    @BeforeEach
    public void init(){
        mathOperations = new MathOperations();
    }

    @Test
    public void testFactorial() {
        assertEquals(6, mathOperations.factorial(3));
    }

    @Test
    public void testAverage() {
        assertEquals(2.0, mathOperations.average(new double[]{1.0, 2.0, 3.0}));
    }

    @Test
    public void testPower() {
        assertEquals(8.0, mathOperations.power(2.0, 3));
    }

    @Test
    public void testMidValue() {
        assertEquals(10.2, mathOperations.midValue(5.2, 15.2));
    }

    @Test
    public void testFToC() {
        assertEquals(0.0, mathOperations.fahrenheitToCelsius(32.0));
    }


}