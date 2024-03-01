package edu.sdsu.cs160l.university.lab7.course;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CS340 extends Course {
    private static CS340 CS_340;

    private CS340() {
    }

    public static CS340 getInstance() {
        if (CS_340 == null) {
            CS_340 = new CS340();
        }
        return CS_340;
    }
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
