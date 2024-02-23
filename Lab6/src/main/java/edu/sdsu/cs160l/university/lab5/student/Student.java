package edu.sdsu.cs160l.university.lab5.student;

import edu.sdsu.cs160l.university.lab5.course.Course;
import edu.sdsu.cs160l.university.lab5.exam.ExamObserver;
import edu.sdsu.cs160l.university.lab5.student.StudentLevel;
import edu.sdsu.cs160l.university.lab5.student.StudentMajor;
import edu.sdsu.cs160l.university.lab5.student.StudentType;

import java.util.HashSet;
import java.util.Set;

public abstract class Student implements ExamObserver {
    private Long redId;
    private String name;
    private Double gpa;
    private StudentLevel studentLevel;
    private StudentMajor studentMajor;
    private final Set<Course> coursesEnrolled;

    public Student(Long redId, String name, Double gpa, StudentLevel studentLevel, StudentMajor studentMajor) {
        this.redId = redId;
        this.name = name;
        this.gpa = gpa;
        this.studentLevel = studentLevel;
        this.studentMajor = studentMajor;
        this.coursesEnrolled = new HashSet<>();
    }

    @Override
    public void onResultPublished(String message){
        System.out.println("Incoming message for "+this.name+" :: "+ message);
    }

    public Long getRedId() {
        return redId;
    }

    public String getName() {
        return name;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setRedId(Long redId) {
        this.redId = redId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "redId=" + redId +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public StudentLevel getStudentLevel() {
        return studentLevel;
    }

    public void setStudentLevel(StudentLevel studentLevel) {
        this.studentLevel = studentLevel;
    }

    public StudentMajor getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(StudentMajor studentMajor) {
        this.studentMajor = studentMajor;
    }

    public void addCourse(Course course) {
        this.coursesEnrolled.add(course);
    }

    public Set<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public abstract StudentType studentType();
}
