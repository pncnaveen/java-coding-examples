
/**
 * FirstMaxOcrChar
 */
public class FirstMaxOcrChar {

    // Find the maximum first occured character
    public String findMaxFstOcrdChar(String chars) {
        // create a 26 size int array and init to 0
        int[] alpha = new int[128];
        // init max;
        int max = 0;
        // iterate through the charaters
        for (char chr : chars.toCharArray()) {
            // inc the chr count in the alpha array
            alpha[chr]++;
            if (alpha[max] < alpha[chr])
                max = chr;
        }

        return (char) (max) + "," + alpha[max];
    }

    public static void main(String[] args) {
        FirstMaxOcrChar foc = new FirstMaxOcrChar();
        String chars = "aaABBcAccBBAbAAAccc";
        System.out.println(foc.findMaxFstOcrdChar(chars));
    }
}