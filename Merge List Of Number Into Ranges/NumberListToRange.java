import java.util.ArrayList;

/**
 * NumberListToRange
 */
public class NumberListToRange {

    // Convert the numbers list to range and return a string list
    public ArrayList<String> listtorange(int[] arr, int len) {
        ArrayList<String> ranges = new ArrayList<String>();
        int start = arr[0], end = arr[0];
        for (int i = 1; i < len; i++) {
            if (i == len - 1) {
                if (arr[i - 1] == arr[i] - 1 || arr[i - 1] == arr[i]) {
                    end = arr[i];
                    ranges.add(start + "->" + end);
                } else {
                    ranges.add(start + "->" + end);
                    start = arr[i];
                    end = arr[i];
                    ranges.add(start + "->" + end);
                }
            } else if (arr[i - 1] == arr[i] - 1 || arr[i - 1] == arr[i]) {
                end = arr[i];
            } else {
                ranges.add(start + "->" + end);
                start = arr[i];
                end = arr[i];
            }
        }
        return ranges;

    }

    public static void main(String[] args) {
        NumberListToRange nl = new NumberListToRange();
        int arr[] = { 0, 1, 2, 5, 7, 8, 9, 9, 10, 11, 12, 30, 31, 33, 34 };
        System.out.println(nl.listtorange(arr, arr.length).toString());
    }
}