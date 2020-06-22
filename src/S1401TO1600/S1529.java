package S1401TO1600;

public class S1529 {
    public int tripletSubarray(int[] nums, int limit) {
        int l = 0;
        int res = 0;
        for (int r = 2; r < nums.length; r++) {
            while (nums[r] - nums[l] > limit)
                l++;
            if (r - l >= 2)
                res += (r - l) * (r - l - 1) / 2;
        }
        return res;
    }
}
