package S801TO1000;

public class S835 {
    public int hammingDistance(int x, int y) {
        // write your code here
        String s = Integer.toBinaryString(x ^ y);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                res++;
        }
        return res;
    }
}
