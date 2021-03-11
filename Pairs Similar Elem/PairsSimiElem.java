import java.util.Arrays;

/**
 * PairsSimiElem
 */
public class PairsSimiElem {

    // find pairs algo
    public int findPairs(int[] arr, int n) {
        Arrays.sort(arr);
        int sCount = 1; // to know the count of total elements
        int dCount = 1; // to know if any pair is found
        int ans = 0;

        for (int i = 1; i < n; i++) {
            System.out.print(arr[i - 1] + "->" + arr[i] + "->");
            if (arr[i] == arr[i - 1] + 1) {

                sCount++;
                dCount++;
                System.out.println(sCount + " " + dCount);
            } else if (arr[i] == arr[i - 1]) {
                sCount++;
                System.out.println(sCount + " " + dCount);
            } else {
                if (sCount >= 2 && dCount >= 2) {
                    ans += ((sCount) * (sCount - 1)) / 2;
                }
                sCount = 1;
                dCount = 1;
                System.out.println(sCount + " " + dCount + " " + ans);
            }
        }
        if (sCount >= 2 && dCount >= 2) {
            ans += ((sCount) * (sCount - 1)) / 2;
        }
        return ans;
        // int[] pair = new int[arr.length];
        // Arrays.fill(pair, -1);
        // int pairs = 0;
        // int front = 0;
        // int end = arr.length - 1;
        // // parse through the array if pair found update in pair array
        // while (front <= end) {
        // for (int i = 0; i < arr.length; i++) {
        // if (front != i && arr[front] + 1 == arr[i]) {
        // pair[front] = i;
        // }
        // }
        // for (int i = arr.length - 1; i >= 0; i--) {
        // if (end != i && arr[end] + 1 == arr[i]) {
        // pair[end] = i;
        // }
        // }
        // front++;
        // end--;
        // }
        // // find number of pairs
        // for (int i = 0; i < pair.length; i++) {
        // // pair exsist in the index
        // if (pair[i] > -1 && (pair[i] == pair[pair[i]] || pair[pair[i]] > -1)) {
        // pairs += 3;
        // pair[pair[i]] = -1;
        // pair[i] = -1;

        // }
        // if (pair[i] > -1) {
        // pairs++;
        // }
        // }
        // System.out.println(Arrays.toString(pair));
        // return pairs;
    }

    public static void main(String[] args) {
        PairsSimiElem sm = new PairsSimiElem();
        int[] arr = { 1, 3, 5, 7, 8, 2, 5, 7 };
        System.out.println(sm.findPairs(arr, arr.length));
    }
}