package edu.sdsu.cs160l.university.lab5.criteria;

import edu.sdsu.cs160l.university.lab5.course.Course;
import edu.sdsu.cs160l.university.lab5.criteria.StudentStrategy;
import edu.sdsu.cs160l.university.lab5.student.Student;
import edu.sdsu.cs160l.university.lab5.student.StudentMajor;

/**
 * Advanced student strategy is a student strategy
 * A student has
 * at least 3 course and
 * at least 1 course with 2xx level and
 * at least 1 course with 3xx level and
 * student is from compsci or compengineering major
 */
public class SimpleCompStudent implements StudentStrategy {
    @Override
    public boolean isValid(Student student) {
    	return false;
    }
}
