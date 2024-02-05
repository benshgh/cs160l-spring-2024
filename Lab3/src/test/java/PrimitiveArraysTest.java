import org.junit.jupiter.api.*;

import java.util.Arrays;

/**
 * Primitive arrays are static fixed size and cannot be resized in the same memory space.
 * To increase the size of a primitive array you need to create a new array with desired size
 * Then copy all elements to the new array
 * <p>
 * Note this is also a test class and has the same structure as {@link TestClassStructure} class
 */
public class PrimitiveArraysTest {
    //an array of type int
    int[] intArray = {1,8,7,11,6,8};
    //an array of Custom class Student
    //note typically arrays are given plural variable name
    // so an array of Fruit would be fruits and an array of Student would be named students
    Student[] students;

    /**
     * BeforeAll runs once before a test class is run
     */
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Starting test execution");
    }

    /**
     * BeforeEach run's once before every test method in a class
     */
    @BeforeEach
    public void beforeEach() {
        //can be used to reset test instance
        //Note carefully how arrays are initialized

        //blank array with size 10
//        intArray = new int[10]; 

        //array with predefined values
        //creates a student array of size 5
        students = new Student[]{
                new Student(825000001L, "Student 1", 3.1), // goes at index 0
                new Student(825000002L, "Student 2", 3.2), // goes at index 1
                new Student(825000003L, "Student 3", 3.3), // goes at index 2
                new Student(825000004L, "Student 4", 3.4), // goes at index 3
                new Student(825000005L, "Student 5", 3.5)  // goes at index 4
        };

        //or shortly as

        String[] stringArray = {"Java", "is", "a", "great", "programming", "language."};

    }

    /**
     * AfterEach run's once after every test method in a class
     */
    @AfterEach
    public void afterEach() {
        //can be used to clean up data
    }

    /**
     * AfterAll runs once after a test class is run, or after test execution is complete
     */
    @AfterAll
    public static void afterAll() {
        System.out.println("Completing test execution");
    }


    @Test
    public void loopingOverArray() {
        for(int i=0;i<students.length;i++){
            System.out.println("Student at index +"+i+" is ::"+students[i]);
        }
    }

    @Test
    public void simplifiedForLoop() {
        //when you don't need the index an array for loop can be simplified as
        for(Student student : students){
            System.out.println(student);
        }
    }

    @Test
    public void checkIfArrayContainsAString() {
        String[] sArray = {"Java", "is", "a", "great", "programming", "language."};

        boolean b = Arrays.asList(sArray).contains("programmingg");
        System.out.println("Checking contains functionality: " + b);
    }

    @Test
    public void sortArray() {
        System.out.println("Before Sort");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        Arrays.sort(intArray);
        System.out.println("After Sort");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }

}
