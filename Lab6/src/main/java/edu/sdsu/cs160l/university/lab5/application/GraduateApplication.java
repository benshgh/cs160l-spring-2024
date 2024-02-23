package edu.sdsu.cs160l.university.lab5.application;

public class GraduateApplication implements UniversityApplication {

    @Override
    public void submitScore(Applicant applicant, float score) {
        if(score < 2.85){
            applicant.setAdmitted(false);
            throw new UnsupportedOperationException("Cannot admit student to graduate program if his score is below 2.85");
        }
        applicant.setApplicantScore(score);
    }

    @Override
    public void submitDocuments(Applicant applicant, String documents) {
        if(applicant.isAdmitted()) {
            applicant.setApplicantDocuments(documents);
        }else{
            throw new UnsupportedOperationException("Cannot submit documents until you are admitted");
        }
    }

    @Override
    public boolean checkStatus(Applicant applicant) {
        return applicant.isAdmitted();
    }
}
