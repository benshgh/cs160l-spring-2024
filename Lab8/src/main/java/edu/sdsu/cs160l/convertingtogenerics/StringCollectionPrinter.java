package edu.sdsu.cs160l.convertingtogenerics;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringCollectionPrinter implements CollectionPrinter<String>{
    @Override
    public void print(List<String> list) {
        for (String i : list) {
            System.out.println(i);
        }
    }

    @Override
    public void print(Set<String> list) {
        for (String i : list) {
            System.out.println(i);
        }
    }

    @Override
    public void print(Map<String, String> map) {
        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " | " + e.getValue());
        }
    }
}
