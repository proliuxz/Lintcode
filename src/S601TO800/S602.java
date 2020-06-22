package S601TO800;

import java.util.Arrays;

public class S602 {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int[] map = new int[envelopes.length];
        int res = 0;
        for (int i = 0; i < envelopes.length; i++) {
            int height = envelopes[i][1];
            int left = 0;
            int right = res;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (map[mid] < height)
                    left = mid + 1;
                else
                    right = mid;
            }
            map[left] = height;
            if (left == res)
                res++;
        }
        return res;
    }
}
