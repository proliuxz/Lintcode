import java.util.Arrays;

public class S544 {
    public int[] topk(int[] nums, int k) {
        // write your code here
        Arrays.sort(nums);
        int[] result = new int[k];
        int len = nums.length;
        for (int i = 0; i < result.length ; i++) {
            result[i] = nums[len-1-i];
        }
        return result;
    }
}
