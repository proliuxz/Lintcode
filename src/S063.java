public class S063 {
    public boolean search(int[] A, int target) {
        // write your code here
        int left = 0;
        int right = A.length - 1;
        int mid = (left + right) / 2;
        while (left <= right)
        {

            mid = (left + right) / 2;
            if (target == A[mid])
                return true;
            if (A[left] < A[mid])
            {
                if ((target >= A[left] && target < A[mid]))
                    right = mid - 1;
                else
                    left = mid + 1;
            } else if (A[left] > A[mid])
            {
                if ((target > A[mid] && target <= A[right]))
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            else
            {
                left++;
            }
        }
        return false;
    }
}
