import java.util.ArrayList;

/**
 * RmvDuplifrmSrtdList
 */
public class RmvDuplifrmSrtdList {

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

    // remove duplicate from sorted list, O(1) space complexity
    public ArrayList<Integer> rmvDupli(ArrayList<Integer> list) {
        int back = 0;
        int front = 1;
        // parse through the list
        while (front < list.size()) {
            // check if back equal to front
            if (list.get(back) == list.get(front)) {
                list.remove(back);
            } else {
                back++;
                front++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        RmvDuplifrmSrtdList rsl = new RmvDuplifrmSrtdList();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(9);
        if (rsl.isSorted(list))
            System.out.println(rsl.rmvDupli(list));
        else
            System.out.println("List is not sorted");

    }
}