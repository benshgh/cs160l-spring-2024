package edu.sdsu.cs160l.university.lab7.course;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class CS210 extends Course{
    private static CS210 CS_210;

    private CS210() {
    }

    public static CS210 getInstance() {
        if (CS_210 == null) {
            CS_210 = new CS210();
        }
        return CS_210;
    }
    @Override
    public String courseName() {
        return "CS210";
    }

    @Override
    public List<String> courseDescription() {
        return Arrays.asList("Software Programming","0 cost course");
    }

    @Override
    public Set<String> prerequisites() {
        return new HashSet<>(Arrays.asList("CS160","CS205"));
    }
}
