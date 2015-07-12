import org.junit.Test;

import java.lang.Exception;

import static org.junit.Assert.*;

import Reel.*;

public class ReelTest {

    @Test
    public void testGenerateRandomReel() throws Exception {
        assertNotNull(Reel.generateRandomReel());
    }

    @Test
    public void testGetCherries() throws Exception {
        ReelType cherry = new ReelType("Cherries", 0);
        assertEqals(0, cherry.getId());
        assertEquals("Cherries", cherry.toString());
    }

    @Test
    public void testGetNonexistent throws Exception {
        ReelType banana = new ReelType("Banana", 20);
        assertEquals(20, banana.getId());
        assertEquals("Banana", banana.toString());
    }

    @Test
    public void testCalculateProfitPercentage() throws Exception {

    }
}