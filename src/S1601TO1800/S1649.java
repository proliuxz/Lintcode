package S1601TO1800;

public class S1649 {
    public int getAns(int v1, int v2, int[] s, int[] w) {
        if (v1 > v2)
            return 0;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < s.length; i++)
            if (s[i] + v1 > v2)
                res = Math.min(res, w[i]);
        return res;
    }
}
