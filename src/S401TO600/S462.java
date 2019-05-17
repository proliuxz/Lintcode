package S401TO600;

public class S462 {
    public int totalOccurrence(int[] A, int target) {
        // write your code here
        if (A == null || A.length == 0)
            return 0;
        int len = A.length;
        if (A[len - 1] < target || A[0] > target) {
            return 0;
        }

        int l = 0, r = len - 1;
        int start = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (A[mid] >= target) {
                start = mid;
                r = mid - 1;
            } else
                l = mid + 1;
        }
        if (A[start] != target)
            return 0;

        int end = len - 1;
        l = 0; r = len - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (A[mid] <= target) {
                end = mid;
                l = mid + 1;
            } else
                r = mid - 1;
        }
        return end - start + 1;
    }
}
