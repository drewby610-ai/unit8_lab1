import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task2Test  {
    @Test
    void testEvenNumbers() {
        assertEquals(12, BuggyProgram.sumEvenNumbers(new int[]{2, 3, 4, 6}));
    }

    @Test
    void testNoEvenNumbers() {
        assertEquals(0, BuggyProgram.sumEvenNumbers(new int[]{1, 3, 5}));
    }

    @Test
    void testEmptyArray() {
        assertEquals(0, BuggyProgram.sumEvenNumbers(new int[]{}));
    }
}