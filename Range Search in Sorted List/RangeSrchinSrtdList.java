import java.util.ArrayList;
import java.util.Arrays;

/**
 * RangeSrchinSrtdList
 */
public class RangeSrchinSrtdList {

    // Check if the list is sorted or not
    public boolean isSorted(ArrayList<Integer> list) {
        int back = 0;
        int front = 1;
        // parse through the list
        while (front < list.size()) {
            // check if back is greater than front, return false
            if (list.get(back) > list.get(front)) {
                return false;
            } else {
                back++;
                front++;
            }
        }
        return true;
    }

    // find the range of the given number
    public int[] findNum(ArrayList<Integer> list, int num) {
        int start, end, mid;
        mid = list.size() / 2;
        int[] res = { -1, -1 };
        // initialize start and end
        // check if number is less than mid
        if (num < list.get(mid)) {
            start = 0;
            end = mid;
        }
        // check if number is equal to mid
        else if (num == list.get(mid)) {
            start = mid;
            end = mid;
        }
        // check if number is greater than mid
        else {
            start = mid;
            end = list.size() - 1;
        }

        // finding range
        // if number is equal to mid
        if (num == list.get(mid)) {
            while (start >= 0 && end < list.size()) {
                // if start and end are not euqal to num
                if ((list.get(start) != num && list.get(end) != num)) {
                    res[0] = start + 1;
                    res[1] = end - 1;
                    return res;
                }
                // if start=0 and end=list length
                else if ((start == 0 && end == list.size() - 1)) {
                    res[0] = start;
                    res[1] = end;
                    return res;
                } else {
                    if (list.get(start) == num)
                        start--;
                    if (list.get(end) == num)
                        end++;
                }
            }
        }
        // if number is not equal to mid
        else {
            while (start <= end) {
                // if start and end is equal to num
                if (list.get(start) == num && list.get(end) == num) {
                    res[0] = start;
                    res[1] = end;
                    return res;
                } else {
                    if (list.get(start) != num)
                        start++;
                    if (list.get(end) != num)
                        end--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        RangeSrchinSrtdList rssl = new RangeSrchinSrtdList();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(9);
        if (rssl.isSorted(list)) {
            System.out.println(Arrays.toString(rssl.findNum(list, 3)));
        } else {
            System.out.println("Array is not sorted");
        }

    }
}