package SS;

import java.util.Arrays;

public class SS1670 {
    public long getAns(int[] atk) {
        // Write your code here
        long res = 0;
        if (atk == null || atk.length == 0)
            return res;
        Arrays.sort(atk);
        long len = atk.length;
        for (int i = 0; i < len ; i++) {
            res += (atk[i] * (len - i -1));
        }
        return res;
    }

    public static void main(String[] args)
    {
        SS1670 s = new SS1670();
        int[] atk = new int[] {2,3,6,4,23};
        System.out.println(s.getAns(atk));
    }
}
