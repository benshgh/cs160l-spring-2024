package edu.sdsu.cs160l.algorithm.sort;

import edu.sdsu.cs160l.student.Student;
import edu.sdsu.cs160l.student.StudentLevel;
import edu.sdsu.cs160l.student.StudentMajor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BubbleSortTest {
    private Sorter sorter;
    private Student[] students;

    @BeforeEach
    void setUp() {
        sorter = new BubbleSort();
        students = new Student[10];
        students[0] = new Student(825000001L, "hmac", 3.8, StudentLevel.SENIOR, StudentMajor.COMPUTER_SCIENCE);
        students[1] = new Student(825000002L, "john", 3.7, StudentLevel.FRESHMAN, StudentMajor.BIOLOGY);
        students[2] = new Student(825000003L, "jane", 3.6, StudentLevel.SOPHOMORE, StudentMajor.COMPUTER_ENGINEERING);
        students[3] = new Student(825000001L, "will", 3.8, StudentLevel.SENIOR, StudentMajor.COMPUTER_SCIENCE);
        students[4] = new Student(825000002L, "bill", 3.7, StudentLevel.FRESHMAN, StudentMajor.BIOLOGY);
        students[5] = new Student(825000003L, "tamara", 3.6, StudentLevel.SOPHOMORE, StudentMajor.COMPUTER_ENGINEERING);
        students[6] = new Student(825000001L, "michael", 3.8, StudentLevel.SENIOR, StudentMajor.COMPUTER_SCIENCE);
        students[7] = new Student(825000002L, "dwight", 3.7, StudentLevel.FRESHMAN, StudentMajor.BIOLOGY);
        students[8] = new Student(825000003L, "jim", 3.6, StudentLevel.SOPHOMORE, StudentMajor.COMPUTER_ENGINEERING);
        students[9] = new Student(825000002L, "ryan", 3.5, StudentLevel.FRESHMAN, StudentMajor.BIOLOGY);
    }

    @Test
    void sortWithException() {
        assertThrows(Exception.class, () -> sorter.sort(students));
    }

    @Test
    void sort() {
        sorter.sort(students, Comparator.comparing(Student::getGpa));
        assertEquals(3.5, students[0].getGpa());
        assertEquals(3.7, students[4].getGpa());
        assertEquals(3.8, students[9].getGpa());
    }

    @Test
    void sortReverse() {
        sorter.sort(students, Comparator.comparing(Student::getGpa).reversed());
        assertEquals(3.5, students[9].getGpa());
        assertEquals(3.7, students[4].getGpa());
        assertEquals(3.8, students[0].getGpa());
    }
}