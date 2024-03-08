package edu.sdsu.cs160l.generics.classlevel;

import edu.sdsu.cs160l.model.Student;

public class ClassLevelImpl implements ClassLevel<Student, Long,Double> {
    @Override
    public Long process(Student student) {
        return student.getRedId();
    }

    @Override
    public Double processAgain(Student student) {
        return student.getGpa();
    }
}
