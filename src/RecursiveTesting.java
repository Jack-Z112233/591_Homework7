import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class RecursiveTesting {
    @Test
    public void testMultiplyOddsBaseCase(){
        assertEquals(1, RecursivePractice.multiplyOdds(1));
    }
    @Test
    public void testMultiplyOddsRecursive(){
        assertEquals(105, RecursivePractice.multiplyOdds(4));
        assertEquals(945, RecursivePractice.multiplyOdds(5));
    }
    @Test
    public void testMultiplyOddsException(){
        assertThrows(IllegalArgumentException.class, () -> RecursivePractice.multiplyOdds(0));
        assertThrows(IllegalArgumentException.class, () -> RecursivePractice.multiplyOdds(-1));
    }

}
