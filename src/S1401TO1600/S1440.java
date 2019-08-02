package S1401TO1600;

import java.util.Arrays;
import java.util.HashMap;

public class S1440 {
    public int uniqueLetterString(String S) {
        // Write your code here
        int res = 0;
        int len = S.length();
        int mod = (int) Math.pow(10, 9) + 7;
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();


        return 0;
    }

    public static void main(String[] args)
    {
        S1440 s = new S1440();
        int res = s.uniqueLetterString("ABC");
        System.out.println(res);
    }
}
