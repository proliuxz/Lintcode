package S1401TO1600;

public class S1476 {
    public int peakIndexInMountainArray(int[] A) {
        // Write your code here
        int start = 0, end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] > A[mid - 1]) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        if (A[start] > A[start - 1] && A[start] > A[start + 1]) {
            return start;
        }
        else {
            return end;
        }
    }
}
