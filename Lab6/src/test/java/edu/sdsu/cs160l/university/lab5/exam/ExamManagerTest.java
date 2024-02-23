package edu.sdsu.cs160l.university.lab5.exam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.sdsu.cs160l.university.lab5.student.SDSUStudent;
import edu.sdsu.cs160l.university.lab5.student.Student;
import edu.sdsu.cs160l.university.lab5.student.StudentLevel;
import edu.sdsu.cs160l.university.lab5.student.StudentMajor;
import edu.sdsu.cs160l.university.lab5.student.TransferStudent;

public class ExamManagerTest {
    private ExamManager examManager;

    private Student john;
    private Student jane;
    private Student jack;
    private Student janice;

    @BeforeEach
    public void init(){
        examManager = new ExamManager();
        //creating students
        john = new SDSUStudent(1L, "John", 4.0, StudentLevel.FRESHMAN, StudentMajor.computersci);
        jane = new SDSUStudent(2L, "Jane", 4.0, StudentLevel.JUNIOR, StudentMajor.computereng);
        jack = new TransferStudent(3L, "Jack", 4.0, StudentLevel.FRESHMAN, StudentMajor.computersci);
        janice = new TransferStudent(4L, "Janice", 4.0, StudentLevel.FRESHMAN, StudentMajor.computereng);

        //subscribe students to exam

        examManager.subscribeToResults(john);
        examManager.subscribeToResults(jane);
        examManager.subscribeToResults(jack);
    }

    @Test
    public void informStudent(){
        System.out.println("For Lab 5");
        examManager.publishResults("Lab 5");
        System.out.println();

        examManager.unsubscribeFromResults(jack);
        examManager.subscribeToResults(janice);

        System.out.println("For Lab 6");
        examManager.publishResults("Lab 6 ");
        System.out.println();

        examManager.unsubscribeFromResults(john);
        examManager.unsubscribeFromResults(jane);

        System.out.println("For Lab 7");
        examManager.publishResults("Lab 7");
        System.out.println();
    }
}
