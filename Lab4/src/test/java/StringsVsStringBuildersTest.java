import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsVsStringBuildersTest {

    private StringBuilder testStringBuilder;

    @BeforeEach
    public void init() {
        //this is how you would create a string builder
        testStringBuilder = new StringBuilder();
    }

    @Test
    public void creatingAStringBuilder() {

        //or you can also create one with default value

        StringBuilder a = new StringBuilder("Some prefilled value");
        System.out.println(a);
    }

    @Test
    public void concatenateInStringBuilder() {
        testStringBuilder.append("Hello");
        testStringBuilder.append(" ");
        testStringBuilder.append("World");

        assertEquals("Hello World", testStringBuilder.toString());
    }

    @Test
    public void replaceInStringBuilders() {
        StringBuilder s = new StringBuilder("Hello World");
        s.replace(0, 1, "M");
        assertEquals("Mello World", s.toString());

        s.replace(6, 11, "Time");
        assertEquals("Mello Time", s.toString());
    }

}
