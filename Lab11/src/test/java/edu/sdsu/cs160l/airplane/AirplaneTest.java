package edu.sdsu.cs160l.airplane;

import edu.sdsu.cs160l.airplane.engine.Engine;
import edu.sdsu.cs160l.airplane.wheel.Wheel;
import edu.sdsu.cs160l.airplane.wheel.WheelStatus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.suite.api.Suite;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

/**
 * Annotate your test class with @RunWith(MockitoJUnitRunner.class)
 */
@ExtendWith(MockitoExtension.class)
@Suite()
public class AirplaneTest {

    /**
     * The class under test in this case, Airplane, is always annotated with @InjectMocks
     */
    @InjectMocks
    private Airplane airplane;

    /**
     * All dependencies(Classes which you class under test(Airplane) uses) will be annotated with @Mock
     * In this case Airplane depends on Wheel and Engine.
     */
    @Mock
    private Wheel wheel;
    @Mock
    private Engine engine;

    /**
     * Any test function is always "public void <testScenarioName>()"
     * and annotated with @Test
     * the general syntax for mocking is
     * do<action>().when(<mockobject>).functionCall()
     * eg: doReturn(true).when(engine).isRunning();
     * notice below you can chain multiple doReturn() to return different values if a function is called multiple times in same function
     */
    @Test
    public void startPlaneSuccessfully() throws Exception {
        doReturn(false) // first return false
                .doReturn(true) // then return true
                .when(engine).isRunning();
        doReturn(true).when(engine).ignition();
        assertTrue(airplane.start());
    }

    @Test
    public void startPlaneWhenEngineIsRunning() {
        doReturn(true).when(engine).isRunning();
        assertThrows(RuntimeException.class, () -> airplane.start());
    }

    @Test
    public void takeOffTheAirplane() {
        // TODO: Implement a test case to verify the take-off functionality of the airplane.
        // 1. Define the expected wheelStatus for take-off.
        // 2. Use 'doReturn' to set the desired return value for the 'getWheelStatus' method.
        // 3. Call the 'takeOff' method on the airplane object and use an Assert method to validate that the 'WheelStatus' matches your expected value.

    }

    @Test
    public void landAirplane() {
        //TODO: Implement test case to verify the land functionality of the airplane.
        // follow similar steps as above but now for the 'land' method
    }


}
