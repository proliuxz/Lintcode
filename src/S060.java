import java.util.Arrays;

public class S060 {
    public int searchInsert(int[] A, int target) {
        // write your code here
        if (A == null || A.length==0)
            return 0;
        int len = A.length;
        int left = 0;
        int right = len-1;

        while (left <= right)
        {
            if (target < A[left])
                return left;
            if (target > A[right])
                return (right+1);
            int mid = (left + right)>>1;
            if (target < A[mid])
                right = mid-1;
            else if (target > A[mid])
                left = mid+1;
            else
                return mid;
        }
        return 0;
    }
}
