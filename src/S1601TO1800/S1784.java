package S1601TO1800;

public class S1784 {
    public int numberOfOperations(String s) {
        // Write your code here
        if (s == null || s.length() == 0)
            return 0;
        int l = 0;
        int r = s.length() - 1;
        int res = 0;
        while (l<r)
        {
            res += Math.abs(s.charAt(r)-s.charAt(l));
            l++;
            r--;
        }
        return res;
    }
}
