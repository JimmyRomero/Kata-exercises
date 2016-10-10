import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link DnaStrand}.
 */
public class DnaStrandTest {

    /**
     * Tests to make the validation of the complement.
     */
    @Test
    public void makeTheComplementTest() {
        assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
        assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }
}
