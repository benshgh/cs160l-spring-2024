package edu.sdsu.cs160l.university.criteria;

import edu.sdsu.cs160l.university.student.Student;

public interface StudentStrategy {
    boolean isValid(Student student);
}
