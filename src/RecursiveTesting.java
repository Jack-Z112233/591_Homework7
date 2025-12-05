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
    @Test
    public void testCountSubstringsBaseCase(){
        assertEquals(0, RecursivePractice.countSubstrings("a", "anana"));
    }
    @Test
    public void testCountSubstringsRecursiveFound(){
        assertEquals(2, RecursivePractice.countSubstrings("banana", "ana"));
    }
    @Test
    public void testCountSubstringsNoFind(){
        assertEquals(0, RecursivePractice.countSubstrings("banana", "xyz"));
    }
    @Test
    public void testDigitMatchBaseCase(){
        assertEquals(0,RecursivePractice.digitMatch(0,5783412));
    }
    @Test
    public void testDigitMatchRecursive(){
        assertEquals(3,RecursivePractice.digitMatch(120011225,21100125));
    }
    @Test
    public void testDigitMatchNoMatches(){
        assertEquals(0,RecursivePractice.digitMatch(999,222));
    }
    @Test
    public void testPermutationBaseCase(){
        assertEquals(1.0,RecursivePractice.permutation(10,0));
    }
    @Test
    public void testPermutationRecursive(){
        assertEquals(840.0,RecursivePractice.permutation(7,4));
    }
    @Test
    public void testPermutationException(){
        assertThrows(IllegalArgumentException.class, () -> RecursivePractice.permutation(2,4));
        assertThrows(IllegalArgumentException.class, () -> RecursivePractice.permutation(-2,-1));
    }

}
