package S201TO400;

import java.util.Arrays;

public class S292 {
    public String[] SortAnagramsArray(String[] str) {
        // write your code here
        Arrays.sort(str, (String a, String b) -> {
            char[] ac = a.toCharArray();
            char[] bc = b.toCharArray();
            Arrays.sort(ac);
            Arrays.sort(bc);
            return new String(ac).compareTo(new String(bc));
        });
        return str;
    }
}
