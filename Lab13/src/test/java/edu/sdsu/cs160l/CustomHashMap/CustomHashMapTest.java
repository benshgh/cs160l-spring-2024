package edu.sdsu.cs160l.CustomHashMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CustomHashMapTest {

    @Test
    public void testPutAndGet() {
        CustomHashMap<Integer, String> map = new CustomHashMap<>();
        map.put(1, "Value1");
        map.put(2, "Value2");

        Assertions.assertEquals("Value1", map.get(1));
        Assertions.assertEquals("Value2", map.get(2));
    }

    @Test
    public void testUpdateExistingKey() {
        CustomHashMap<Integer, String> map = new CustomHashMap<>();
        map.put(1, "Value1");
        map.put(1, "UpdatedValue");

        Assertions.assertEquals("UpdatedValue", map.get(1));
    }

    @Test
    public void testRemove() {
        CustomHashMap<Integer, String> map = new CustomHashMap<>();
        map.put(1, "Value1");
        map.put(2, "Value2");

        map.remove(1);

        assertNull(map.get(1));
        Assertions.assertEquals("Value2", map.get(2));
    }

    @Test
    public void testCollisionHandling() {
        CustomHashMap<String, String> map = new CustomHashMap<>();
        // These keys have the same hash code (should go to the same bucket)
        map.put("abc", "Value1");
        map.put("cba", "Value2");

        Assertions.assertEquals("Value1", map.get("abc"));
        Assertions.assertEquals("Value2", map.get("cba"));
    }

    @Test
    public void testCapacityIncrease() {
        CustomHashMap<Integer, String> map = new CustomHashMap<>(2);
        map.put(1, "Value1");
        map.put(2, "Value2");
        map.put(3, "Value3");

        Assertions.assertEquals("Value1", map.get(1));
        Assertions.assertEquals("Value2", map.get(2));
        Assertions.assertEquals("Value3", map.get(3));
    }

    @Test
    public void testRemoveNonExistentKey() {
        CustomHashMap<Integer, String> map = new CustomHashMap<>();
        map.put(1, "Value1");
        map.remove(2);

        Assertions.assertEquals("Value1", map.get(1));
        assertNull(map.get(2));
    }



}
