package S1001TO1200;

public class S1068 {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i];

        for (int i = 0; i < nums.length; i++) {
            if (i != 0)
                left += nums[i - 1];
            if (sum - left - nums[i] == left)
                return i;
        }
        return -1;
    }
}
