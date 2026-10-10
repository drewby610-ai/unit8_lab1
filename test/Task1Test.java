import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Task1Test {
    @Test
    void testExceeds() {
        assertEquals("Exceeds", BuggyProgram.getGrade(95));
    }

    @Test
    void testDoesNotMeet() {
        assertEquals("Does Not Meet", BuggyProgram.getGrade(70));
    }

    @Test
    void testBoundary90() {
        assertEquals("Exceeds", BuggyProgram.getGrade(90));
    }

    @Test
    void testBoundary80() {
        assertEquals("Meets", BuggyProgram.getGrade(80));
    }
}