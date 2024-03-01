package edu.sdsu.cs160l.university.lab7.registrar;

import edu.sdsu.cs160l.university.lab7.course.Course;
import edu.sdsu.cs160l.university.lab7.course.CourseFactory;
import edu.sdsu.cs160l.university.lab7.exceptions.ClassFullException;
import edu.sdsu.cs160l.university.lab7.exceptions.NoSuchCourseException;
import edu.sdsu.cs160l.university.lab7.exceptions.StudentAlreadyEnrolledException;
import edu.sdsu.cs160l.university.lab7.student.Student;
import edu.sdsu.cs160l.university.lab7.registrar.Registrar;

import java.util.HashMap;
import java.util.Map;

/**
 * Registrar now has to implement checks to avoid adding any student to any course.
 */
public class Registrar {
    private static Registrar REGISTRAR;
    private final Map<String, Course> courseList;

    private Registrar() {
        courseList = new HashMap<>();
        courseList.put("CS150", CourseFactory.getCourse("CS150"));
        courseList.put("CS160", CourseFactory.getCourse("CS160"));
        courseList.put("CS210", CourseFactory.getCourse("CS210"));
        courseList.put("CS340", CourseFactory.getCourse("CS340"));
    }

    public static Registrar getInstance() {
        if (REGISTRAR == null) {
            REGISTRAR = new Registrar();
        }
        return REGISTRAR;
    }

    public void enrollStudentToClass(Student student, String courseName) throws NoSuchCourseException, ClassFullException, StudentAlreadyEnrolledException {
        //TODO check if courseName is a valid courseName if not throw a new NoSuchCourseException
        // you may use the isValidCourse function


        Course course = courseList.get(courseName);
        course.addStudent(student);
    }

    /**
     * Note this is a private function and can only be accessed in registrar class.
     */
    private boolean isNotValidCourse(String courseName) {
        return !courseList.containsKey(courseName);
    }
}
