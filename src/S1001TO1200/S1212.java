package S1001TO1200;

public class S1212 {
    public int findMaxConsecutiveOnes(int[] nums) {
        // Write your code here
        int result = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                count++;
            else
            {
                result = Math.max(count, result);
                count = 0;
            }
        }
        return Math.max(result, count);
    }
}
