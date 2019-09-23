package S1601TO1800;

import java.util.Arrays;

public class S1659 {
    public int[] getAns(int[] a, int[][] q) {
        // write your code here
        int[] res = new int[q.length];
        Arrays.sort(a);
        for (int i = 0; i < q.length; i++) {
            res[i] = helper(a, q[i]);
        }
        return res;
    }

    private int helper(int[] a, int[] range)
    {
        int res = 0;
        for (int num: a
             ) {
            if ( num >= range[0])
            {
                if (num <= range[1])
                    res++;
                else
                    break;
            }
        }
        return res;
    }
}
