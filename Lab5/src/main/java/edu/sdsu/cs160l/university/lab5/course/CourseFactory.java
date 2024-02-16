package edu.sdsu.cs160l.university.lab5.course;

import edu.sdsu.cs160l.university.lab5.course.CS150;
import edu.sdsu.cs160l.university.lab5.course.CS160;
import edu.sdsu.cs160l.university.lab5.course.CS210;
import edu.sdsu.cs160l.university.lab5.course.CS340;
import edu.sdsu.cs160l.university.lab5.course.Course;
import edu.sdsu.cs160l.university.lab5.student.StudentLevel;

public class CourseFactory {
    /**
     * A factory method is typically static and hides creation complexity form end user
     */
    public static Course getCourse(String courseName){
        switch (courseName){
            case "CS150":
                return CS150.getInstance();
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
                return CS150.getInstance();
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
