package edu.sdsu.cs160l.university.lab5.course;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.sdsu.cs160l.university.lab5.course.Course;

//TODO make this singleton
public class CS340 implements Course {
    @Override
    public String courseName() {
        return "CS340";
    }

    @Override
    public List<String> courseDescription() {
        return Arrays.asList("Data Structure and algorithms", "0 cost course");
    }

    @Override
    public Set<String> prerequisites() {
        return new HashSet<>(Arrays.asList("CS210", "CS330"));
    }
}
