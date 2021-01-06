import java.util.LinkedList;

/**
 * RmvDupliInLL
 */

public class RmvDupliInLL {

    // get unique list
    public LinkedList<Integer> rmvDupli(LinkedList<Integer> ll) {
        int i = 0;
        while (i < ll.size() - 1) {
            // find if index i and index i+1 are same
            if (ll.get(i) == ll.get(i + 1)) {
                ll.remove(i);
                i--;
            }
            i++;
        }
        return ll;
    }

    public static void main(String[] args) {
        RmvDupliInLL rmdpli = new RmvDupliInLL();
        // create a list int list
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(10);
        ll.add(11);
        ll.add(20);
        ll.add(20);
        ll.add(20);
        ll.add(22);
        ll.add(22);
        System.out.println(rmdpli.rmvDupli(ll));
    }

}
