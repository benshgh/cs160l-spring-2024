package edu.sdsu.cs160l.assignment.institute;

import edu.sdsu.cs160l.assignment.institute.student.Student;
import edu.sdsu.cs160l.exceptions.ClassFullException;
import edu.sdsu.cs160l.exceptions.StudentAlreadyEnrolledException;

import java.util.ArrayList;
import java.util.List;

public class Course {
  private static final int MAX_COURSE_SIZE = 30;
  private final String courseName;
  private final int courseUnits;
  private final List<Student> studentsEnrolled;

  public Course(String courseName, int courseUnits) {
    this.courseName = courseName;
    this.courseUnits = courseUnits;
    this.studentsEnrolled = new ArrayList<>();
  }

  public void addStudent(Student studentToBeEnrolled) throws StudentAlreadyEnrolledException, ClassFullException {
    if (studentToBeEnrolled == null) {
      throw new NullPointerException("Cannot add a non existing null student to a course.");
    }
    if (studentAlreadyPresent(studentToBeEnrolled)) {
      throw new StudentAlreadyEnrolledException(studentToBeEnrolled + " is already enrolled to the course "+courseName);
    }
    if (isClassFull()) {
      throw new ClassFullException("All the seats for " + courseName + " have been occupied.");
    }
    studentToBeEnrolled.addUnits(this.courseUnits);
    studentsEnrolled.add(studentToBeEnrolled);

  }

  public List<Student> getStudentsEnrolled() {
    return studentsEnrolled;
  }


  private boolean studentAlreadyPresent(Student s) {
    return studentsEnrolled
       .stream()
       .anyMatch(student -> student.getRedId().equals(s.getRedId())); // if any student already exist
  }

  private boolean isClassFull() {
    return studentsEnrolled.size() >= MAX_COURSE_SIZE;
  }

  @Override
  public String toString() {
    return "Course{" +
       "courseName='" + courseName + '\'' +
       ", studentsEnrolled=" + studentsEnrolled +
       '}';
  }
}
