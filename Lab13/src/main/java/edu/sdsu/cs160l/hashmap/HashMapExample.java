package edu.sdsu.cs160l.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("1", "1"); // put example
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", null); // null value
        map.put(null, "100"); // null key

        String value = map.get("3"); // get example
        System.out.println("Key = 3, Value = " + value);

        value = map.getOrDefault("5", "Default Value");
        System.out.println("Key = 5, Value=" + value);

        boolean keyExists = map.containsKey(null);
        boolean valueExists = map.containsValue("100");

        System.out.println("keyExists=" + keyExists + ", valueExists=" + valueExists);

        Set<Entry<String, String>> entrySet = map.entrySet();
        System.out.println(entrySet);

        System.out.println("map size=" + map.size());

        Map<String, String> map1 = new HashMap<>();
        map1.putAll(map);
        System.out.println("map1 mappings= " + map1);

        String nullKeyValue = map1.remove(null);
        System.out.println("map1 null key value = " + nullKeyValue);
        System.out.println("map1 after removing null key = " + map1);

        Set<String> keySet = map.keySet();
        System.out.println("map keys = " + keySet);

        Collection<String> values = map.values();
        System.out.println("map values = " + values);

        map.clear();
        System.out.println("map is empty=" + map.isEmpty());

    }

}