import java.util.ArrayList;
import java.util.Arrays;

/**
 * intersectionArray
 */

public class intersectionArray {
    // function to find the element is present in second array
    public boolean findIfElementPresent(int element, int[] arr2) {
        // check if element is present or not
        for (int i = 0; i < arr2.length; i++) {
            if (element < arr2[i]) {
                return false;
            } else if (element == arr2[i]) {
                return true;
            }
        }
        return false;
    }

    // function to find the num of duplicate elements in the first array
    public int findNumOfElems(int[] arr, int pos) {
        // check for number of elements from the given pos
        int i = pos;
        int num = 1;
        while (i < arr.length) {
            if (i + 1 >= arr.length || arr[i] != arr[i + 1]) {
                return num;
            } else if (arr[i] == arr[i + 1]) {
                num++;
            }
            i++;
        }
        return 0;
    }

    // function to find the intersection elements
    public ArrayList<Integer> elements(int[] arr1, int[] arr2) {
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        int i = 0;
        int num;
        // count the number of elements in arr1
        while (i < arr1.length) {
            num = findNumOfElems(arr1, i);
            if (findIfElementPresent(arr1[i], arr2)) {
                intersection.add(arr1[i]);
            }
            i = i + num;
        }
        return intersection;
    }

    public static void main(String[] args) {
        intersectionArray ia = new intersectionArray();
        int arr1[] = { 1, 2, 1, 5, 3, 4, 6 };
        int arr2[] = { 1, 3, 4, 5 };
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (arr1.length >= arr2.length) {
            System.out.println(ia.elements(arr1, arr2));

        } else {
            System.out.println(ia.elements(arr2, arr1));
        }
    }
}