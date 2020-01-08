package S1201TO1400;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S1394 {
    public String toGoatLatin(String S) {
        String[] arr = S.split(" ");
        for (int i = 0; i <  arr.length; i++) {
            arr[i] = Goatilizer(arr[i], i + 1);
        }
        String res = String.join(" ", arr);
        return res;
    }

    private String Goatilizer(String w, int p)
    {
        Set<Character> vowel = new HashSet<Character>();
        for (char c : "aeiouAEIOU".toCharArray()) vowel.add(c);
        w = (vowel.contains(w.charAt(0)) ? w : w.substring(1) + w.charAt(0)) + "ma";
        for (int i = 0; i < p; i++) {
            w += 'a';
        }
        return w;
    }
}
