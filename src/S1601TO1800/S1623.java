package S1601TO1800;

import java.util.Arrays;

public class S1623 {
    public int[] minimalDistance(int[] a, int[] b) {
        // Write your code here
        Arrays.sort(a);
        int[] res = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            int idx = binarySearch(a, b[i]);
            if (idx == 0)
                res[i] = a[0];
            else if (idx == a.length)
                res[i] = a[a.length - 1];
            else
                res[i] = (b[i] - a[idx - 1] <= a[idx] - b[i]) ? a[idx - 1] : a[idx];
        }
        return res;
    }

    private int binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length;
        while (r - l > 1) {
            int mid = (l + r) >> 1;
            if (arr[mid] >= target)
                r = mid;
            else
                l = mid;
        }
        if (arr[l] >= target)
            return l;
        else
            return r;
    }
}
