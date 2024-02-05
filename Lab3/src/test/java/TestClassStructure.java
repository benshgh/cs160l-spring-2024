
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class depicts how an ideal test class looks
 * Usually a test class ends with Test suffix
 */
public class TestClassStructure {
    //create your test instance here
    Student testStudent;

    //each test class has a life cycle

    /**
     * BeforeAll runs once before a test class is run
     */
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Starting test execution");
    }

    /**
     * BeforeEach run's once before every test method in a class
     */
    @BeforeEach
    public void beforeEach(){
        //can be used to reset test instance
        testStudent = new Student(825000000L, "Test Student", 4.0);
    }

    /**
     * AfterEach run's once after every test method in a class
     */
    @AfterEach
    public void afterEach(){
        //can be used to clean up data
        testStudent = null;
    }

    /**
     * AfterAll runs once after a test class is run, or after test execution is complete
     */
    @AfterAll
    public static void afterAll(){
        System.out.println("Completing test execution");
    }


    @Test
    public void testIfStudentIsInitializedCorrectly(){
        assertEquals("Test Student", testStudent.getName());
    }

    @Test
    public void modifyStudentDetails(){
        testStudent = new Student(825000000L, "New Student", 3.0);
        assertEquals("New Student", testStudent.getName());
    }

    @Test
    public void checkIfBeforeEachWorksCorrectly(){
        assertEquals("Test Student", testStudent.getName());
    }
}
