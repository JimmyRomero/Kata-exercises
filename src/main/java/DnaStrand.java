import java.util.HashMap;

/**
 * Class to manage DnaStrand.
 */
public final class DnaStrand {

    /**
     * Private constructor.
     */
    private DnaStrand() {

    }

    /**
     * Method to make the complement.
     *
     * @param dna Parameter to complement.
     * @return The complement.
     */
    public static String makeComplement(final String dna) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();

        map.put('A', 'T');
        map.put('T', 'A');
        map.put('G', 'C');
        map.put('C', 'G');

        char[] reval = new char[dna.length()];

        for (int i = 0; i < dna.length(); i++) {
            reval[i] = map.get(dna.charAt(i));
        }
        return String.valueOf(reval);
    }

}
