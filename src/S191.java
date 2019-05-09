public class S191 {
    public int maxProduct(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0)
            return 0;

        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length ; i++) {
            int newMax = Math.max(Math.max(nums[i] * max, nums[i]), nums[i] * min);
            int newMin = Math.min(Math.min(nums[i] * max, nums[i]), nums[i] * min);
            max = newMax;
            min = newMin;
            result = Math.max(result, max);
        }
        return result;
    }
}
