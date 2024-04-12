package edu.sdsu.cs160l.assignment;

import edu.sdsu.cs160l.assignment.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentMetricProcessorTest {
  private StudentMetricProcessor studentProcessor;

  @BeforeEach
  public void setUp() {
    List<Student> students = new ArrayList<>();
    students.add(new Student(1L, "A", 4.0));
    students.add(new Student(2L, "B", 4.0));
    students.add(new Student(3L, "C", 4.0));
    students.add(new Student(4L, "D", 4.0));
    students.add(new Student(5L, "E", 3.5));
    students.add(new Student(6L, "F", 3.4));
    students.add(new Student(7L, "G", 3.3));
    students.add(new Student(8L, "H", 3.2));
    students.add(new Student(9L, "I", 3.1));
    students.add(new Student(10L, "J", 3.0));
    students.add(new Student(11L, "K", 2.99));
    students.add(new Student(12L, "L", 2.97));
    students.add(new Student(13L, "M", 2.95));
    students.add(new Student(14L, "N", 2.92));
    students.add(new Student(15L, "O", 2.9));
    students.add(new Student(16L, "P", 2.89));
    students.add(new Student(17L, "Q", 2.87));
    students.add(new Student(18L, "R", 2.86));
    students.add(new Student(19L, "S", 2.85));
    students.add(new Student(20L, "T", 2.85));
    students.add(new Student(21L, "U", 2.5));
    students.add(new Student(22L, "V", 2.45));
    students.add(new Student(23L, "W", 2.56));
    students.add(new Student(24L, "X", 2.51));
    students.add(new Student(25L, "Y", 2.74));
    students.add(new Student(26L, "Z", 2.73));

    studentProcessor = new StudentMetricProcessor(students);
  }


  @Test
  void studentsWithPerfectGpa() {
    assertEquals(4, studentProcessor.studentsWithPerfectGpa().size());
  }

  @Test
  void studentWithGpaBelow2point85() {
    assertEquals(6, studentProcessor.studentWithGpaBelow2point85().size());
  }

  @Test
  void studentNames() {
    assertEquals(26, studentProcessor.studentNames().size());
  }

  @Test
  void studentRedIdsWithScoreBetweenAndInclusiveOf3point0and3point5() {
    assertEquals(6, studentProcessor.studentRedIdsWithScoreBetweenAndInclusiveOf3point0and3point5().size());
  }

  @Test
  void countOfStudentsWithGpaBetweenAndInclusiveOf2point85and3point0() {
    assertEquals(11, studentProcessor.countOfStudentsWithGpaBetweenAndInclusiveOf2point85and3point0());
  }
}
