package S801TO1000;

public class S911 {
    public int maxSubArrayLen(int[] nums, int k) {
        // Write your code here
        int res = 0;
        if (nums == null || nums.length == 0)
            return res;
        if (nums.length == 1)
            return nums[0] == k ? 1 : 0;
        int len = nums.length;
        int[] sum = new int[len + 1];
        sum[0] = 0;
        sum[1] = nums[0];
        for (int i = 0; i < len; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }

        for (int i = 0; i < len - 2 ; i++) {
            for (int j = len; j > i + res ; j--) {
                if (sum[j] - sum[i] == k)
                {
                    if (j - i > res)
                        res = j - i;
                }
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        S911 s = new S911();
        int[] nums = new int[] { 1, 0 , -1};
        int k = 0;
        int res = s.maxSubArrayLen(nums, k);
        System.out.println(res);
    }
}
