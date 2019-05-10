public class S041 {
    public int maxSubArray(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0)
            return 0;
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            sum[i] = Math.max(nums[i], nums[i] + sum[i - 1]);
        }
        int result = Integer.MIN_VALUE;
        for (int s: sum
             ) {
            if (s > result)
                result = s;
        }
        return result;
    }
}
