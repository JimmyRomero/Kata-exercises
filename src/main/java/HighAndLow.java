import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * Class to know the Highest and the lowest number in a String.
 */
public final class HighAndLow {

    /**
     * Private constructor.
     */
    private HighAndLow() {

    }

    /**
     * Method to know the highest and the lowest number.
     *
     * @param numbers The string number to be compared
     * @return The highest and the lowest number.
     */
    public static String highAndLow(final String numbers) {
        String[] array = numbers.split(" ");
        List<Integer> nums = new ArrayList<>();

        for (String i : array) {
            nums.add(Integer.parseInt(i));
        }

        return Collections.max(nums) + " " + Collections.min(nums);
    }
}
