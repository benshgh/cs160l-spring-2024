import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class StringInitializationTest {

    String testString;

    @BeforeEach
    public void before() {
        testString = "mz";
    }

    @Test
    public void createSimpleInstance() {
        String name = "String";
        System.out.println(name);
    }

    @Test
    public void createStringUsingConstructor() {
        String name = new String("String");
        System.out.println(name);
    }


    @Test
    public void create2StringWithSameValue() {
        String a = "hey";
        String b = "hey";

        //TODO write a suitable test to check equality of these strings
    }

    @Test
    public void create2StringArrays() {
        String[] a = {"java", "c++", "javascript"};
        String[] b = {"java", "c++", "javascript"};

        //TODO write a suitable test to check equality of these string arrays

    }

    @Test
    public void equalityOfStrings() {
        String[] data1 = {"mz", "my", "my", "mx", "mz", "mx", "my", "mz"};
        String[] data2 = {"mz", "mz", "mz", "mx", "mx", "my", "my", "my"};

        System.out.println(data1[0] == "mz");
        System.out.println(data1[0] == data2[2]);
        System.out.println(data1[0] == new String(data2[0]));

        //TODO convert below prints to asserts
        System.out.println(data1[0].equals(testString));
        System.out.println(data1[0].equals(new String(testString)));
    }
}
