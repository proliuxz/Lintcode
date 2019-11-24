package S601TO800;

public class S763 {
    public String hexConversion(int n, int k) {
        // write your code here
        if (n == 0)
            return "0";

        char[] chars = new char[] {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        StringBuilder sb = new StringBuilder();
        while (n > 0)
        {
            sb.insert(0,chars[n % k]);
            n /= k;
        }
        return sb.toString();
    }
}
