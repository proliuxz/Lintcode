package S1601TO1800;

public class S1700 {
    public int[] diStringMatch(String S) {
        int len = S.length();
        int l = 0;
        int r = len;
        int[] res = new int[len + 1];
        for (int i = 0; i < len; ++i) {
            if (S.charAt(i) == 'I')
                res[i] = l++;
            else
                res[i] = r--;
        }
        res[len] = l;
        return res;
    }
}
