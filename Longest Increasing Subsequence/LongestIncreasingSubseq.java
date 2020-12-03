import java.util.Arrays;

/**
 * LongestIncreasingSubseq
 */
public class LongestIncreasingSubseq {

    // util function to find max from array
    public int findMaxFromArray(int[] lis) {
        int max = lis[0];
        for (int i = 0; i < lis.length; i++) {
            if (lis[i] > max) {
                max = lis[i];
            }
        }
        return max;
    }

    // find the longest increasing subsequnece
    public int findSubSeq(int[] arr, int len) {
        int[] lis = new int[len];
        Arrays.fill(lis, 1);
        for (int j = 1; j < arr.length; j++) {
            for (int i = 0; i < j; i++) {
                if (arr[j] > arr[i] && lis[i] >= lis[j]) {
                    lis[j] = lis[i] + 1;
                }
            }
        }
        return findMaxFromArray(lis);
    }

    public static void main(String[] args) {
        LongestIncreasingSubseq ls = new LongestIncreasingSubseq();
        int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
        System.out.println(ls.findSubSeq(arr, arr.length));
    }
}