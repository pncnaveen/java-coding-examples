/**
 * StringToInt
 */
public class StringToInt {

    // generate a number from a string algo
    public int stringToInt(String numString) {
        int number = 0;
        int i = 0;
        // check if the first sybbol is "-" or not
        // if true multiply with -1
        if (numString.charAt(0) == 45) {
            i++;
        }

        // get each char ascii from the string and convert to number
        for (; i < numString.length(); i++) {
            // if ascii is out of 48 and 57 return none
            if (numString.charAt(i) < 48 || numString.charAt(i) > 57) {
                return 0;
            }
            number += (numString.charAt(i) - 48);
            number *= 10;
        }
        // check if the first sybbol is "-" or not
        // if true multiply with -1
        if (numString.charAt(0) == 45) {
            number *= -1;
        }

        return number / 10;
    }

    public static void main(String[] args) {
        StringToInt sti = new StringToInt();
        String numString = "1";
        System.out.println(sti.stringToInt(numString));

    }
}