package edu.sdsu.cs160l.university.lab5.application;

public class Applicant {
    private Long applicantId;
    private String applicantName;
    private Float applicantScore;
    private String applicantDocuments;
    private boolean admitted;

    public Applicant(Long applicantId, String applicantName) {
        this.applicantId = applicantId;
        this.applicantName = applicantName;
        this.applicantScore = 0.0f;
    }

    public Long getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public Float getApplicantScore() {
        return applicantScore;
    }

    public void setApplicantScore(Float applicantScore) {
        this.applicantScore = applicantScore;
    }

    public String getApplicantDocuments() {
        return applicantDocuments;
    }

    public void setApplicantDocuments(String applicantDocuments) {
        this.applicantDocuments = applicantDocuments;
    }

    public boolean isAdmitted() {
        return admitted;
    }

    public void setAdmitted(boolean admitted) {
        this.admitted = admitted;
    }
}
