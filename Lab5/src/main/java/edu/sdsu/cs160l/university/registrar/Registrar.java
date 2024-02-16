package edu.sdsu.cs160l.university.registrar;

import edu.sdsu.cs160l.university.course.Course;
import edu.sdsu.cs160l.university.criteria.StudentStrategy;
import edu.sdsu.cs160l.university.student.Student;

public class Registrar {
    public void enrollStudentToClass(Student student, Course course){
        student.addCourse(course);
    }

    public boolean isStudentValid(Student student, StudentStrategy studentStrategy){
       return studentStrategy.isValid(student);
    }
}
