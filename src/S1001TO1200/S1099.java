package S1001TO1200;

public class S1099 {
    public boolean checkPossibility(int[] nums) {
        boolean hasReversed = false;
        for (int i = 1; i < nums.length; i++)
            if (nums[i] < nums[i - 1]) {
                if (hasReversed)
                    return false;
                hasReversed = true;
                if (i >= 2 && nums[i] < nums[i - 2])
                    nums[i] = nums[i - 1];
                else
                    nums[i - 1] = nums[i];
            }
        return true;
    }
}
