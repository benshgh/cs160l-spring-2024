package edu.sdsu.cs160l.exceptions;

public class StudentAlreadyEnrolledException extends Exception {
  public StudentAlreadyEnrolledException(String message) {
    super(message);
  }
}
