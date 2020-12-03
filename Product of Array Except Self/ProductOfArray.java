import java.util.Arrays;

/**
 * ProductOfArray
 */
public class ProductOfArray {
    // muiltply the numbers
    public long multiply(int[] arr, int pos) {
        int first = 0, last = arr.length - 1;
        long num = 1;
        while (first <= last && !(first == pos && first == last)) {
            if (first == pos || first == last) {
                num = num * arr[last];
            } else if (last == pos) {
                num = num * arr[first];
            } else {
                num = num * arr[first] * arr[last];
            }
            first++;
            last--;
        }
        return num;
    }

    // do product for each of the elements
    public long[] productofarray(int[] arr, int len) {
        long[] newArr = new long[len];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = multiply(arr, i);
        }
        return newArr;
    }

    public static void main(String[] args) {
        ProductOfArray pa = new ProductOfArray();
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(Arrays.toString(pa.productofarray(arr, arr.length)));
    }
}