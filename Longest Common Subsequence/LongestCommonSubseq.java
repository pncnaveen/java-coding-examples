/**
 * LongestCommonSubseq
 */
public class LongestCommonSubseq {

    // generate common subsequence
    public int genCommonSubseq(String s1, String s2, int point1, int point2, int[][] resStr) {
        if (point1 < 0 || point2 < 0)
            return 0;
        else if (resStr[point1][point2] != 0) {
            return resStr[point1][point2];
        } else if (s1.charAt(point1) == s2.charAt(point2)) {
            resStr[point1][point2] = 1 + genCommonSubseq(s1, s2, point1 - 1, point2 - 1, resStr);
            return resStr[point1][point2];
        } else {
            int s2Rmv = genCommonSubseq(s1, s2, point1, point2 - 1, resStr);
            int s1Rmv = genCommonSubseq(s1, s2, point1 - 1, point2, resStr);
            return (resStr[point1][point2] = s1Rmv > s2Rmv ? s1Rmv : s2Rmv);
        }

    }

    // longest common subsequence
    public int findLongestCommonSubseq(String s1, String s2) {
        int[][] resStr = new int[s1.length()][s1.length()];
        return genCommonSubseq(s1, s2, s1.length() - 1, s2.length() - 1, resStr);
    }

    public static void main(String[] args) {
        LongestCommonSubseq lcs = new LongestCommonSubseq();
        String s1 = "ACX";
        String s2 = "CBX";
        System.out.println(lcs.findLongestCommonSubseq(s1, s2));

    }
}