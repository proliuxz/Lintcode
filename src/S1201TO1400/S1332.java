package S1201TO1400;

import java.util.Arrays;

public class S1332 {
    public int hammingWeight(int n) {
        // write your code here
        String s = Integer.toBinaryString(n);
        int res = 0;
        for (char c: s.toCharArray()
             ) {
            if (c == '1')
                res++;
        }
        return res;
    }
}
