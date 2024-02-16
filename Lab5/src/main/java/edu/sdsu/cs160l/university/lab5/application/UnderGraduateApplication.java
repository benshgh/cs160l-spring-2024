package edu.sdsu.cs160l.university.lab5.application;

public class UnderGraduateApplication implements UniversityApplication {

    @Override
    public void submitScore(Applicant applicant, float score) {
        applicant.setApplicantScore(score);
    }

    @Override
    public void submitDocuments(Applicant applicant, String documents) {
        applicant.setApplicantDocuments(documents);
    }

    @Override
    public boolean checkStatus(Applicant applicant) {
        return applicant.isAdmitted();
    }
}
