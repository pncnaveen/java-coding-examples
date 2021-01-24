/**
 * FiboRecur
 */
public class FiboRecur {

    // recursive fibonacci genrator
    public long fib(int n) {
        if (n == 1)
            return 1;
        else if (n == 0)
            return 0;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        FiboRecur fr = new FiboRecur();
        int n = 48;
        Long startTime = System.nanoTime();
        System.out.println(fr.fib(n - 1) + fr.fib(n - 2));
        Long endTime = System.nanoTime();
        System.out.println("time:-" + (((endTime - startTime) * 1.0) / 1000000000));
    }
}