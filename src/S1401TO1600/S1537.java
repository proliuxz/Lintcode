package S1401TO1600;

public class S1537 {
    public int SwapZeroOne(int[] nums) {
        int res = 0;
        int numOfZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
            {
                res += (i - numOfZero);
                numOfZero++;
            }
        }
        return res;
    }
}
