package S1801TO2000;

import java.util.HashSet;
import java.util.Set;

public class S1856 {
    public int countSubstrings(String s) {
        int N = s.length();
        Set<String> res = new HashSet<>();
        for (int mid = 0; mid <= 2*N-1; mid++) {
            int left = mid / 2;
            int right = left + mid % 2;
            while (left >= 0 && right < N && s.charAt(left) == s.charAt(right)) {
                res.add(s.substring(left,right+1));
                left--;
                right++;
            }
        }
        return res.size();
    }
}
