package S1201TO1400;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S1282 {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>(Arrays.asList(new Character[] {'a','e','i','o','u','A','E','I','O','U'}));
        int l = 0;
        int r = arr.length - 1;
        while (l < r)
        {
            while (!set.contains(arr[l]) && l < r)
                l++;
            while (!set.contains(arr[r]) && l < r)
                r--;
            char tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
        }
        return new String(arr);
    }
}
