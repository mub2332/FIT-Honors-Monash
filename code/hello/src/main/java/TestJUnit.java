import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
    @Test
    public void testStringEquals() {
        String testString = "JUnit works";
        assertEquals("JUnit works", testString);
    }

}
