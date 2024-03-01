package edu.sdsu.cs160l.university.lab7.course;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class CS160 extends Course{
    private static CS160 CS_160;

    private CS160() {
    }

    public static CS160 getInstance() {
        if (CS_160 == null) {
            CS_160 = new CS160();
        }
        return CS_160;
    }
    @Override
    public String courseName() {
        return "CS160";
    }

    @Override
    public List<String> courseDescription() {
        return Arrays.asList("Intermediary Java Programming");
    }

    @Override
    public Set<String> prerequisites() {
        return new HashSet<>(Collections.singletonList("CS150"));
    }
}
