package S601TO800;

public class S604 {
    public int[] winSum(int[] nums, int k) {
        // write your code here
        if (nums == null || nums.length == 0)
            return new int[0];
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < k ; i++) {
            result[0] += nums[i];
        }
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] - nums[i - 1] + nums[i - 1 + k];
        }
        return result;
    }

    public static void main(String[] args)
    {
        S604 s = new S604();
        int[] nums = {1,2,7,7,2};
        int[] res = s.winSum(nums, 3);
        for (int r : res)
            System.out.print(r+",");
    }
}
