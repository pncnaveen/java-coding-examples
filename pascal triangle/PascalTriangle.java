
import java.util.Arrays;

/**
 * PascalTriangle
 */
public class PascalTriangle {
    // find factorial of a number
    public double fact(int n) {
        if (n == 1 || n == 0)
            return 1.0;

        return n * fact(n - 1);
    }

    // find nth pascal value
    public double[] nPascalVal(int n) {
        double[] pasVal = new double[n];
        // loop till n
        for (int i = 0; i < n; i++) {
            pasVal[i] = fact(n - 1) / (fact(i) * fact(n - 1 - i));
        }
        return pasVal;
    }

    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        int n = 40;
        System.out.println(Arrays.toString(pt.nPascalVal(n)));
    }
}