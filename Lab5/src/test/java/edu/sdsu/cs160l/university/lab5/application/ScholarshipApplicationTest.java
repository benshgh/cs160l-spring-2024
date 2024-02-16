package edu.sdsu.cs160l.university.lab5.application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScholarshipApplicationTest {
    private UniversityApplication testApplication;

    @BeforeEach
    public void init(){
        //TODO uncomment the below line and import the class ScholarShipApplication;
       // testApplication = new ScholarshipApplication();
    }

    @Test
    public void testNotEligibleApplicant(){
        Applicant applicant = new Applicant(201L, "john");
        assertThrows(Exception.class,()->testApplication.submitScore(applicant, 2.8f));
        assertFalse(testApplication.checkStatus(applicant));
    }

    @Test
    public void testEligibleApplicant(){
        Applicant applicant = new Applicant(201L, "john");
        assertDoesNotThrow(()->testApplication.submitScore(applicant, 3.2f));
        testApplication.submitDocuments(applicant, "essay");
        assertTrue(testApplication.checkStatus(applicant));
    }
}