import org.junit.Test;

import java.lang.Exception;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ReelTest {

    @Test
    public void testGenerateRandomReel() throws Exception {
        assertNotNull(Reel.generateRandomReel());
    }

    @Test
    public void testGetCherries() throws Exception {
        Reel.ReelType cherry = Reel.ReelType.CHERRIES;
        assertEquals(0, cherry.getId());
        assertEquals("Cherries", cherry.toString());
    }

    @Test
    public void testCalculateProfitPercentageOne() throws Exception {
        List<Reel.ReelType> strings = new ArrayList<Reel.ReelType>();
        strings.add(Reel.ReelType.BARS);
        strings.add(Reel.ReelType.BARS);
        strings.add(Reel.ReelType.CHERRIES);
        assertEquals(2, Reel.calculateProfitPercentage(strings));
    }

    @Test
    public void testCalculateProfitPercentageZero() throws Exception {
        List<Reel.ReelType> strings = new ArrayList<Reel.ReelType>();
        assertEquals(0, Reel.calculateProfitPercentage(strings));
    }

    @Test
    public void testCalculateProfitPercentageTwo() throws Exception {
        List<Reel.ReelType> strings = new ArrayList<Reel.ReelType>();
        strings.add(Reel.ReelType.BARS);
        strings.add(Reel.ReelType.BARS);
        strings.add(Reel.ReelType.BARS);
        assertEquals(3, Reel.calculateProfitPercentage(strings));
    }
}