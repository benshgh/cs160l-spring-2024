package edu.sdsu.cs160l.university.lab7.course;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CS150 extends Course {
    private static CS150 CS_150;

    private CS150() {
    }

    public static CS150 getInstance() {
        if (CS_150 == null) {
            CS_150 = new CS150();
        }
        return CS_150;
    }

    @Override
    public String courseName() {
        return "CS150";
    }

    @Override
    public List<String> courseDescription() {
        return Arrays.asList("Java Programming", "ZyBooks");
    }

    @Override
    public Set<String> prerequisites() {
        return new HashSet<>();
    }
}
