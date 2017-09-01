
import static org.junit.Assert.*;

import org.junit.Test;


public class CountindDuplicatesTest {
    @Test
    public void abcdeReturnsZero() {
        assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
    }
    
    @Test
    public void abcdeaReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
    }
    
    @Test
    public void aabbcdeBReturnsTwo() {
        assertEquals(2, CountingDuplicates.duplicateCount("aabbcdeB"));
    }
    
    @Test
    public void indivisibilityReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
    }
    
    @Test
    public void indivisibilitiesReturnsTwo() {
        assertEquals(2, CountingDuplicates.duplicateCount("indivisibilities"));
    }
    
    @Test
    public void aa11ReturnsTwo() {
        assertEquals(2, CountingDuplicates.duplicateCount("aa11"));
    }
}
