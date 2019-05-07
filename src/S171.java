import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S171 {
    public List<String> anagrams(String[] strs) {
        // write your code here
        List<String> result = new ArrayList<String>();
        if (strs == null || strs.length == 0)
            return result;
        boolean[] selected = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                String s1 = strs[i];
                String s2 = strs[j];
                if (isAnagrams(s1, s2))
                {
                    if (!selected[i]) {
                        result.add(s1);
                        selected[i] = true;
                    }

                    if (!selected[j]) {
                        result.add(s2);
                        selected[j] = true;
                    }
                }
            }
        }
        return result;
    }

    private boolean isAnagrams(String a, String b)
    {
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        String as = new String(arrA);
        String bs = new String(arrB);
        return as.equals(bs);
    }
}
