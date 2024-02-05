import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

/**
 * ArrayLists are dynamic sized.
 * To increase the size of a ArrayList array you don't need to write any manual code
 * Note this is also a test class and has the same structure as {@link TestClassStructure} class
 */
public class ArrayListTest {
    //an array of type Integer
    //Note List<T> means List is of type T
    // i.e. List<Integer> means a List of Integer values, lists cannot have primitive types int, float etc.
    ArrayList<Integer> intList;
    //an array of Custom class Student
    //note typically lists are given plural variable name
    // so a list of Fruit would be fruits and a list of Student would be named students
    ArrayList<Student> students;

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
        //Note carefully how lists are initialized, no need to define size
        intList = new ArrayList<>();
        intList.add(3);
        intList.add(4);
        intList.add(7);
        intList.add(8);
        intList.add(2);

        //list with predefined values
        Student[] studentArray = new Student[]{
                new Student(825000001L, "Student 1", 3.1), // goes at index 0
                new Student(825000002L, "Student 2", 3.2), // goes at index 1
                new Student(825000003L, "Student 3", 3.3), // goes at index 2
                new Student(825000004L, "Student 4", 3.4), // goes at index 3
                new Student(825000005L, "Student 5", 3.5)  // goes at index 4
        };
        students = new ArrayList<>(Arrays.asList(studentArray));
        //you can still add values to students
        students.add(new Student(825000006L, "Student 6", 3.6));

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
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student at index +" + i + " is ::" + students.get(i));
        }
    }

    @Test
    public void simplifiedForLoop() {
        //when you don't need the index an array for loop can be simplified as
        for (Student student : students) {
            System.out.println(student);
        }
    }
    
    //Assignment below
    @Test
    public void shallowDeepCloneArrays() {
        // Shallow copy of an ArrayList
        ArrayList<Student> clonedStudents = (ArrayList<Student>) students.clone();

        // Change Student information in the cloned list
        // Use JGrasp to display the content of existing Student list eLst and the 
        // cloned Student list clonedELst
        // TODO:grab screenshots of debugging views of the two array lists as part of the lab submission
        clonedStudents.get(1).setName("Michael Jordan");
        System.out.println("Student List");
        students.forEach(e -> System.out.println(e.toString()));
        System.out.println("Cloned Student List");
        clonedStudents.forEach(e -> System.out.println(e.toString()));

        // TODO: perform a deep copy of the eLst ArrayList by using the overridden Student clone method.
        // After the deep copy implementation
        // in the cloned Student list, then use the same printout statements above to 
        // print out the original list and the cloned list

        clonedStudents = new ArrayList<>();

        // TODO: write your code here to clone individual elements in students and add it to cloned students

        // After cloning, Update cloned list
        clonedStudents.get(1).setName("Jennifer Hanks");
        System.out.println("Student List");
        // Second Student of the eLst Arraylist should still be test student 2
        students.forEach(e -> System.out.println(e.toString()));
        System.out.println("Cloned Student List");
        clonedStudents.forEach(e -> System.out.println(e.toString()));
    }

    @Test
    public void traverseArrayListUsingIterator() {

        Iterator<Student> it = students.iterator();

        while (it.hasNext()) {
            Student e = it.next();
            System.out.println(e.toString());
        }
    }

    @Test
    public void removeByValueFromArrayList() {

        // This test demonstrates removing by value could
        // result in ConcurrentModificationException where traversing 
        // the array list.

        // The right way would be to use the Iterator to remove elements while
        // traversing.

        // Removing by value results in ConcurrentModificationException
        try {
            for (Student e : students) {
                if(e.getRedId() % 2 == 1) {
                    students.remove(e); //remove by value
                }
            }
        } catch (ConcurrentModificationException ex) {
            System.out.println("A ConcurrentModificationException exception has occurred.");
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void removeByIteratorFromArrayList() {

        // The right way to remove elements from ArrayList while traversing 
        // is to use an Iterator 

        // TODO: Use an Iterator to remove objects from an ArrayList while traversing.
        // Refer to the previous test for using an iterator.
        // a helpful method is .remove on the iterator interface :)
        Iterator<Student> it = students.iterator();

        // TODO: write your code here to remove students with even redIds
    }

    @Test
    public void arrayListToArray() {

        Student[] studentArray = new Student[students.size()];
        students.toArray(studentArray);
        for (Student e : studentArray)
            System.out.println(e.toString());

    }

    @Test
    public void checkIfArrayContainsAString() {
        String[] sArray = {"Java", "is", "a", "great", "programming", "language."};

        boolean b = Arrays.asList(sArray).contains("programming");
        System.out.println(b);
    }

    @Test
    public void sortArray() {
        System.out.println("Before sort");
        for (int i : intList) {
            System.out.print(i + " ");
        }
        List<Integer> clone = (List<Integer>) intList.clone();
        Collections.sort(intList);
        System.out.println("After sort");
        for (int i : intList) {
            System.out.print(i + " ");
        }
        assertNotEquals(intList, clone);
    }
}
