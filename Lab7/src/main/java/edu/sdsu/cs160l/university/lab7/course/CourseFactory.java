package edu.sdsu.cs160l.university.lab7.course;

import edu.sdsu.cs160l.university.lab7.student.StudentLevel;

public class CourseFactory {
    /**
     * A factory method is typically static and hides creation complexity form end user
     */
    public static Course getCourse(String courseName){
        switch (courseName){
            case "CS150":
                return CS150.getInstance();
            case "CS160":
                return CS160.getInstance();
            case "CS210":
                return CS210.getInstance();
            case "CS340":
                return CS340.getInstance();
            default:
                throw new UnsupportedOperationException("No course of the name "+ courseName +" found.");
        }
    }

    public static Course getRecommendedCourseByLevel(StudentLevel level){
        switch (level){
            case FRESHMAN:
                return CS150.getInstance();
            case SOPHOMORE:
                return CS160.getInstance();
            case JUNIOR:
                return CS210.getInstance();
            case SENIOR:
                return CS340.getInstance();
            default:
                throw new UnsupportedOperationException("No course recommendation for level "+ level +" found.");
        }
    }
}
