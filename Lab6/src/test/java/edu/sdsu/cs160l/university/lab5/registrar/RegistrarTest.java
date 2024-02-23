package edu.sdsu.cs160l.university.lab5.registrar;

import edu.sdsu.cs160l.university.lab5.course.Course;
import edu.sdsu.cs160l.university.lab5.course.CourseFactory;
import edu.sdsu.cs160l.university.lab5.criteria.SimpleCompStudent;
import edu.sdsu.cs160l.university.lab5.criteria.SimpleCompScienceStudent;
import edu.sdsu.cs160l.university.lab5.student.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistrarTest {

    private Registrar testRegistrar;
    private Student john;
    private Student jane;
    private Student jack;
    private Student janice;

    @BeforeEach
    public void init(){
        testRegistrar = Registrar.getInstance();
        john = new SDSUStudent(1L, "John", 4.0, StudentLevel.FRESHMAN, StudentMajor.computersci);
        jane = new SDSUStudent(2L, "Jane", 4.0, StudentLevel.JUNIOR, StudentMajor.computereng);
        jack = new TransferStudent(3L, "Jack", 4.0, StudentLevel.FRESHMAN, StudentMajor.computersci);
        janice = new TransferStudent(4L, "Janice", 4.0, StudentLevel.FRESHMAN, StudentMajor.computereng);

        Course cs160 = CourseFactory.getCourse("CS160");
        Course cs210 = CourseFactory.getCourse("CS210");
        Course cs340 = CourseFactory.getCourse("CS340");

        testRegistrar.enrollStudentToClass(john, cs210);

        testRegistrar.enrollStudentToClass(jane, cs210);
        testRegistrar.enrollStudentToClass(jane, cs160);
        testRegistrar.enrollStudentToClass(jane, cs340);

        testRegistrar.enrollStudentToClass(jack, cs160);
        testRegistrar.enrollStudentToClass(jack, cs340);
        testRegistrar.enrollStudentToClass(jack, cs210);

        testRegistrar.enrollStudentToClass(janice, cs160);
        testRegistrar.enrollStudentToClass(janice, cs210);

    }

    @Test
    public void johnAndJaneStudent(){
        assertFalse(testRegistrar.isStudentValid(john, new SimpleCompScienceStudent()));
        assertFalse(testRegistrar.isStudentValid(john, new SimpleCompStudent()));
        assertFalse(testRegistrar.isStudentValid(jane, new SimpleCompScienceStudent()));
        assertTrue(testRegistrar.isStudentValid(jane, new SimpleCompStudent()));
    }

    @Test
    public void enrolJohnToCS150(){
        assertFalse(testRegistrar.isStudentValid(john, new SimpleCompScienceStudent()));
        Course cs150 = CourseFactory.getCourse("CS150");
        testRegistrar.enrollStudentToClass(john, cs150);
        assertTrue(testRegistrar.isStudentValid(john, new SimpleCompScienceStudent()));
    }

}
