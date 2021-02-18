/**
 * GenrateSubSet
 */
public class GenrateSubSet {

    // subset recursive func
    public int findNumPartition(String s, int pos) {

        if (s.length() - 1 <= pos) {
            return 1;
        }
        return findNumPartition(s, pos + 1) + findNumPartition(s, pos + 1);
    }

    // find subset method
    public int subsetGen(String s) {
        if (s.length() == 0)
            return 1;
        return findNumPartition(s, 0) + findNumPartition(s, 0);
    }

    // generate subsets
    // public String findSubSets(String s, int pos) {
    // if (pos >= s.length()-1) {
    // return ;
    // }
    // }
    // // find the subsets
    // public String findSubSet(String s) {
    // if (s.length() == 0) {
    // return " ";
    // }

    // return ;
    // }

    public static void main(String[] args) {
        GenrateSubSet gsb = new GenrateSubSet();
        String s = "";
        System.out.println(gsb.subsetGen(s));
        // System.out.println(gsb.findSubSet(s));
    }
}