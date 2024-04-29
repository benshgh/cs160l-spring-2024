package edu.sdsu.cs160l.assignment.institute.student;

public class Student {
  private final Long redId;
  private final String name;
  private final Double gpa;
  private final StudentLevel level;
  private final StudentMajor major;
  private int unitsEnrolled = 0;

  public Student(Long redId, String name, Double gpa, StudentLevel level, StudentMajor major) {
    this.redId = redId;
    this.name = name;
    this.gpa = gpa;
    this.level = level;
    this.major = major;
  }

  public void addUnits(int units) {
    this.unitsEnrolled += units;
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

  public StudentLevel getLevel() {
    return level;
  }

  public StudentMajor getMajor() {
    return major;
  }

  public int getUnitsEnrolled() {
    return unitsEnrolled;
  }

  @Override
  public String toString() {
    return "Student{" +
       "redId=" + redId +
       ", name='" + name + '\'' +
       ", gpa=" + gpa +
       ", level=" + level +
       ", major=" + major +
       ", unitsEnrolled=" + unitsEnrolled +
       '}';
  }
}
