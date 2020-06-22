package S601TO800;

public class S722 {
    public int maxXorSubarray(int[] nums) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int curr = 0;
            for (int j = i; j < nums.length; j++) {
                curr = curr ^ nums[j];
                res = Math.max(res, curr);
            }
        }
        return res;
    }
}
