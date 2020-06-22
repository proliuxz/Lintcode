package S1001TO1200;

public class S1053 {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            if (nums[max] < nums[i])
                max = i;
        }
        for (int j = 0; j < length; j++)
            if (nums[j] > nums[max] / 2 && j != max)
                return -1;
        return max;
    }
}
