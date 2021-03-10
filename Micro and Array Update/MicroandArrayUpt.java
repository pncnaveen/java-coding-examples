
/**
 * MicroandArrayUpt
 */
public class MicroandArrayUpt {

    // find the minimum time required
    public int findMinTime(int[] arr, int k) {
        int min = 0;
        // parse the array
        for (int i = 0; i < arr.length; i++) {
            if (min < k - arr[i]) {
                min = k - arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        MicroandArrayUpt mc = new MicroandArrayUpt();
        int k = 2;
        int[] arr = { 2, 5, 5 };
        System.out.println(mc.findMinTime(arr, k));
    }
}