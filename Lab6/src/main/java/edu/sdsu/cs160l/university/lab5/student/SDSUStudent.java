package edu.sdsu.cs160l.university.lab5.student;

import edu.sdsu.cs160l.university.lab5.student.Student;
import edu.sdsu.cs160l.university.lab5.student.StudentLevel;
import edu.sdsu.cs160l.university.lab5.student.StudentMajor;
import edu.sdsu.cs160l.university.lab5.student.StudentType;

public class SDSUStudent extends Student {
    public SDSUStudent(Long redId, String name, Double gpa, StudentLevel studentLevel, StudentMajor studentMajor) {
        super(redId, name, gpa, studentLevel, studentMajor);
    }

    @Override
    public StudentType studentType() {
        return StudentType.SDSU;
    }
}
