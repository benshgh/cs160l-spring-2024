package edu.sdsu.cs160l.university.lab7.student;

public class TransferStudent extends Student {
    public TransferStudent(Long redId, String name, Double gpa, StudentLevel studentLevel, StudentMajor studentMajor) {
        super(redId, name, gpa, studentLevel, studentMajor);
    }

    @Override
    public StudentType studentType() {
        return StudentType.TRANSFER;
    }
}
