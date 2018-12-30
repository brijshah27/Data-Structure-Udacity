package Dynamic_Programming;

public class LCS {

    public int LCS(String s1, String s2) {
        if (s1 == null || s2 == null)
            return 0;
        else {
            return getLCS(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());
        }

    }

    private int getLCS(char[] s1, char[] s2, int l1, int l2) {
        if(l1==0 || l2==0){
            return 0;
        }
        else if (s1[l1 - 1] == s2[l2 - 1]) {
            return 1 + getLCS(s1, s2, l1 - 1, l2 - 1);
        }
        return Math.max(getLCS(s1, s2, l1 - 1, l2), getLCS(s1, s2, l1, l2 - 1));
    }
}
