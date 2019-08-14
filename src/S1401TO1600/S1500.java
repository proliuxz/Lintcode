package S1401TO1600;

public class S1500 {
    public int binaryGap(int N) {
        // Write your code here.
        String s = Integer.toBinaryString(N);
        int res = 0;
        int pos = -1;
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) == '1')
            {
                if (pos != -1)
                    res = Math.max(res, i - pos);
                pos = i;
            }
        }
        return res;
    }
}
