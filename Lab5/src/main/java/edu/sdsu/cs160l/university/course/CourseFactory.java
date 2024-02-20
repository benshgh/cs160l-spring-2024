package edu.sdsu.cs160l.university.course;

import edu.sdsu.cs160l.university.student.StudentLevel;

public class CourseFactory {
    /**
     * A factory method is typically static and hides creation complexity form end user
     */
    public static Course getCourse(String courseName){
        switch (courseName){
            //TODO: add a case for cs150 course
            case "CS160":
                return new CS160();
            case "CS210":
                return new CS210();
            case "CS340":
                return new CS340();
            default:
                throw new UnsupportedOperationException("No course of the name "+ courseName +" found.");
        }
    }

    public static Course getRecommendedCourseByLevel(StudentLevel level){
        switch (level){
            case FRESHMAN:
                return new CS150();
            case SOPHOMORE:
                return new CS160();
            case JUNIOR:
                return new CS210();
            case SENIOR:
                return new CS340();
            default:
                throw new UnsupportedOperationException("No course recommendation for level "+ level +" found.");
        }
    }
}
