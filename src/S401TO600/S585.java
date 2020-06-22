package S401TO600;

public class S585 {
    public int mountainSequence(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int l = 0;
        int r = nums.length - 1;
        while (l < r - 1)
        {
            int mid = l + (r - l) >> 1;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid;
        }
        return Math.max(nums[l], nums[r]);
    }
}
