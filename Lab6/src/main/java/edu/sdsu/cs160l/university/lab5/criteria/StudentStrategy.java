package edu.sdsu.cs160l.university.lab5.criteria;

import edu.sdsu.cs160l.university.lab5.student.Student;

public interface StudentStrategy {
    boolean isValid(Student student);
}
