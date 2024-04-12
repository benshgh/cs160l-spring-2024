package edu.sdsu.cs160l.assignment.model;

public class Student {
  private Long redId;
  private String name;
  private Double gpa;

  public Student(Long redId, String name, Double gpa) {
    this.redId = redId;
    this.name = name;
    this.gpa = gpa;
  }

  public Long getRedId() {
    return redId;
  }

  public void setRedId(Long redId) {
    this.redId = redId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getGpa() {
    return gpa;
  }

  public void setGpa(Double gpa) {
    this.gpa = gpa;
  }
}
