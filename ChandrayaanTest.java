import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ChandrayaanTest {

    @Test
    public void testArray() {
        Chandrayaan c = new Chandrayaan();
        char[] input = { 'f', 'r', 'u', 'b', 'l' };
        String result = c.processCharArray(input);

        assertEquals("0,1,-1", result);
    }
}
