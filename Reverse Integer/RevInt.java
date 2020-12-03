/**
 * RevInt
 */
public class RevInt {
    public double lsnum = Math.pow(2.0, 31.0) - 1;
    public double msnum = Math.pow(-2.0, 31.0);

    // get length of the number
    public int lengthofNumber(long num) {
        int len = 0;
        // get the length of the num
        while (num > 0) {
            num = num / 10;
            len++;
        }
        return len;
    }

    // reverse the integer and return the number
    public long revrseinteger(long num) {
        if (num > lsnum || num < msnum) {
            return 0;
        } else {
            long revnum = 0;
            if (num < 0) {
                num *= -1;
                while (num > 9) {
                    revnum = (revnum + (num % 10)) * 10;
                    num /= 10;
                }
                revnum = (revnum + (num % 10)) * (-1);
            } else {
                while (num > 9) {
                    revnum = (revnum + (num % 10)) * 10;
                    num /= 10;
                }
                revnum = (revnum + (num % 10));
            }
            return revnum;
        }

    }

    public static void main(String[] args) {
        RevInt ri = new RevInt();
        long num = -13454925L;
        System.out.println(ri.revrseinteger(num));
    }
}