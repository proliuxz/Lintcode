package S001TO200;

import Util.Interval;

public class S181 {
    public int bitSwapRequired(int a, int b) {
        // write your code here
        int s = a ^ b;
        String str = Integer.toBinaryString(s);
        int res = 0;
        for(char c : str.toCharArray())
        {
            if (c == '1')
                res++;
        }
        return res;
    }


    public static void main(String[] args)
    {
        S181 s = new S181();
        int result = s.bitSwapRequired(31,14);
        System.out.println(result);
    }
}
