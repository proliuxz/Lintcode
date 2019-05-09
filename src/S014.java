import java.util.Arrays;

public class S014 {
    public int binarySearch(int[] nums, int target) {
        // write your code here
        Arrays.binarySearch(nums, target);
        int l = nums[0];
        int r = nums[nums.length - 1];
        while (l <= r) {
            int mid = (l + r) >> 1;
            int midVal = nums[mid];

            if (midVal < target)
                l = mid + 1;
            else if (midVal > target)
                r = mid - 1;
            else
                r = mid;
        }
        if (nums[l] == target) {
            return l;
        }
        if (nums[r] == target) {
            return r;
        }
        return -1;
    }
}
