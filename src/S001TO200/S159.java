package S001TO200;

public class S159 {
    public int findMin(int[] nums) {
        // write your code here
        return helper(0, nums.length - 1, nums);
    }

    public int helper(int left, int right, int[] nums)
    {
        if (left == right)
            return nums[left];

        int mid = (left + right) >> 1;
        if (nums[mid] > nums[right])
            return helper(mid + 1, right, nums);
        else
            return helper(left, mid, nums);
    }
}
