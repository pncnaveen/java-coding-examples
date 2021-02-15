import java.util.Arrays;

/**
 * ShortestDistancetoChar
 */
public class ShortestDistancetoChar {

    // distance calculation
    public Integer distCalc(String word, char ltr, int movePoint, int staticPoint) {
        // check if matched
        if (word.charAt(movePoint) == ltr) {
            return 0;
        }
        // movePoint = staticPoint
        else if (movePoint == staticPoint) {
            return null;
        }
        // if staticPoint > movePoint
        else if (staticPoint > movePoint) {
            Integer rgtVal = distCalc(word, ltr, movePoint + 1, staticPoint);
            if (rgtVal == null)
                return rgtVal;
            else
                return 1 + rgtVal;
        }
        // if staticPoint < movePoint
        else {
            Integer lftVal = distCalc(word, ltr, movePoint - 1, staticPoint);
            if (lftVal == null)
                return lftVal;
            else
                return 1 + lftVal;
        }
    }

    // find shortest distance
    public int[] findCharDist(String word, char ltr) {
        int[] distArr = new int[word.length()];
        for (int i = 0; i < word.length(); i++) {

            Integer lftVal = distCalc(word, ltr, i, 0);
            Integer rgtVal = distCalc(word, ltr, i, word.length() - 1);
            // both lftval and rgtval is not null
            // choose the least
            if (lftVal != null && rgtVal != null) {
                if (lftVal <= rgtVal)
                    distArr[i] = lftVal;
                else
                    distArr[i] = rgtVal;
            }
            // if lftval is not null
            else if (lftVal != null && rgtVal == null) {
                distArr[i] = lftVal;
            }
            // if rgtval is not null
            else {
                distArr[i] = rgtVal;
            }
        }

        return distArr;
    }

    public static void main(String[] args) {
        ShortestDistancetoChar sdc = new ShortestDistancetoChar();
        String word = "helloworld";
        char ltr = 'o';
        System.out.println(Arrays.toString(sdc.findCharDist(word, ltr)));
    }
}