package edu.sdsu.cs160l.university.lab5.criteria;

import edu.sdsu.cs160l.university.lab5.course.Course;
import edu.sdsu.cs160l.university.lab5.criteria.StudentStrategy;
import edu.sdsu.cs160l.university.lab5.student.Student;
import edu.sdsu.cs160l.university.lab5.student.StudentMajor;

/**
 * Simple graduation criteria is a graduation strategy
 * A student has
 * at least 2 course and
 * at least 1 course with 2xx level and
 * is from compsci major
 */
public class SimpleCompScienceStudent implements StudentStrategy {
    @Override
    public boolean isValid(Student student) {
        boolean satisfiesCourseCount = student.getCoursesEnrolled().size() >= 2;
        boolean satisfiesCourseLevel = false;
        boolean satisfiesMajor = student.getStudentMajor() == StudentMajor.computersci;
        for (Course course : student.getCoursesEnrolled()) {
            if (course.courseName().contains("2")) {
                satisfiesCourseLevel = true;
                break;
            }
        }

        return satisfiesCourseCount && satisfiesCourseLevel && satisfiesMajor;
    }
}
