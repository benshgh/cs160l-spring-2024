package edu.sdsu.cs160l.university.lab7.registrar;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.sdsu.cs160l.university.lab7.exceptions.ClassFullException;
import edu.sdsu.cs160l.university.lab7.exceptions.NoSuchCourseException;
import edu.sdsu.cs160l.university.lab7.exceptions.StudentAlreadyEnrolledException;
import edu.sdsu.cs160l.university.lab7.student.SDSUStudent;
import edu.sdsu.cs160l.university.lab7.student.Student;
import edu.sdsu.cs160l.university.lab7.student.StudentLevel;
import edu.sdsu.cs160l.university.lab7.student.StudentMajor;
import edu.sdsu.cs160l.university.lab7.student.TransferStudent;

public class RegistrarTest {

    private Registrar testRegistrar;
    private Student john;
    private Student jane;
    private Student jack;
    private Student janice;

    @BeforeEach
    public void init() {
        testRegistrar = Registrar.getInstance();
        john = new SDSUStudent(1L, "John", 4.0, StudentLevel.FRESHMAN, StudentMajor.computersci);
        jane = new SDSUStudent(2L, "Jane", 4.0, StudentLevel.JUNIOR, StudentMajor.computereng);
        jack = new TransferStudent(3L, "Jack", 4.0, StudentLevel.FRESHMAN, StudentMajor.computersci);
        janice = new TransferStudent(4L, "Janice", 4.0, StudentLevel.FRESHMAN, StudentMajor.computereng);

        try {
            testRegistrar.enrollStudentToClass(john, "CS210");
        } catch (ClassFullException e) {
            System.err.println("Class Full Exception occurred :: " + e.getClass().getSimpleName());
        } catch (StudentAlreadyEnrolledException e) {
            System.err.println("Student Already Enrolled Exception occurred :: " + e.getClass().getSimpleName());
        }

    }

    @Test
    public void enrollAnAlreadyEnrolledStudent() {
        assertThrows(StudentAlreadyEnrolledException.class, () -> testRegistrar.enrollStudentToClass(john, "CS210"));
    }

    @Test
    public void enrollStudentToAnInvalidCourse() {
        assertThrows(NoSuchCourseException.class, () -> testRegistrar.enrollStudentToClass(john, "CS100"));
    }

    @Test
    public void enrollStudentToAFullCourse() {
        assertDoesNotThrow(() -> testRegistrar.enrollStudentToClass(john, "CS160"));
        assertDoesNotThrow(() -> testRegistrar.enrollStudentToClass(jack, "CS160"));
        assertDoesNotThrow(() -> testRegistrar.enrollStudentToClass(jane, "CS160"));
        assertThrows(ClassFullException.class, () -> testRegistrar.enrollStudentToClass(janice, "CS160"));
    }

}
