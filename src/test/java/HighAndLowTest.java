import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link HighAndLow}.
 */
public class HighAndLowTest {

    /**
     * Test to validate the get of the Highest and the Lowest number.
     */
    @Test
    public void higestAndLowestNumberTest() {
        Assert.assertEquals("5 1", HighAndLow.highAndLow("1 2 3 4 5"));
        Assert.assertEquals("5 -3", HighAndLow.highAndLow("1 2 -3 4 5"));
        Assert.assertEquals("9 -5", HighAndLow.highAndLow("1 9 3 4 -5"));
    }
}
