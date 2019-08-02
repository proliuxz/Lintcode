package S1001TO1200;

import java.util.ArrayList;
import java.util.List;

public class S1045 {
    public List<Integer> partitionLabels(String S) {
        // Write your code here
        int[] last = new int[26];
        for (int i = 0; i < S.length(); ++i)
            last[S.charAt(i) - 'a'] = i;

        int right = 0, left = 0;
        List<Integer> ans = new ArrayList();
        for (int i = 0; i < S.length(); i++) {
            right = Math.max(right, last[S.charAt(i) - 'a']);
            if (i == right) {
                ans.add(i - left + 1);
                left = i + 1;
            }
        }
        return ans;
    }
}
