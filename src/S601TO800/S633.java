package S601TO800;

public class S633 {
    public int findDuplicate(int[] nums) {
        // write your code here
        int left = 1;
        int right = nums.length -1;
        while (left <= right)
        {
            int mid = (left + right) >> 1;
            int cnt = 0;
            for (int num: nums
                 ) {
                if (num <= mid)
                    cnt++;
            }
            if (cnt > mid)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }
}
