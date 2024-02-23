package edu.sdsu.cs160l.university.lab5.application;

//Template for application
public interface UniversityApplication {
    void submitScore(Applicant s, float score);

    void submitDocuments(Applicant s, String documents);

    boolean checkStatus(Applicant applicant);
}
