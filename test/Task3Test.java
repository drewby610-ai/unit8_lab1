import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {

    @Test
    void testNormalRange() {
        assertEquals(15, BuggyProgram.sumRange(1, 5));
}

    @Test
    void testSingleNumber() {
        assertEquals(5, BuggyProgram.sumRange(5, 5));
    }

    @Test
    void testNegativeRange() {
        assertEquals(0, BuggyProgram.sumRange(-2, 2));
    }

    @Test
    void testReverseRange() {
        assertEquals(15, BuggyProgram.sumRange(5, 1));
    }
}