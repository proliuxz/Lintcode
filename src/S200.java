import java.util.Arrays;

public class S200 {
    public String longestPalindrome(String s) {
        // write your code here
        char[] arr = ToSharpCharArray(s);
        int[] rad = new int[arr.length];
        int len = arr.length;
        int resIdx = -1;
        int resLen = 1;
        for (int i = 0, right =0, mid = 0; i < len; i++) {
            rad[i] = right > i ? Math.min(rad[2 * mid - i], right - i) : 1;
            while (i + rad[i] < arr.length && i-rad[i] >= 0 && arr[i + rad[i]] == arr[i - rad[i]])
                rad[i]++;
            if (i + rad[i] > right)
                mid = i;

            if (rad[i] > resLen)
            {
                resLen = rad[i];
                resIdx = i;
            }
        }
        return s.substring((resIdx-(rad[resIdx] - 1))/2, (resIdx+(rad[resIdx] - 1))/2);
    }

    private char[] ToSharpCharArray(String s)
    {
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append('#');
        }
        return sb.toString().toCharArray();
    }

    public static void main(String[] args)
    {
        S200 s = new S200();
        String str = "abb";
        System.out.println(s.longestPalindrome(str));
    }
}
