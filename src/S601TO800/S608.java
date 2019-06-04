package S601TO800;

public class S608 {
    public int[] twoSum(int[] nums, int target) {
        // write your code here
        int l = 0;
        int r = nums.length - 1;
        while (l < r)
        {
            int sum = nums[l] + nums[r];
            if (sum == target)
            {
                return new int[] {l + 1, r + 1};
            }
            else if (sum > target)
                r--;
            else
                l++;
        }
        return nums;
    }

    public static void main(String[] args)
    {
        S608 s = new S608();
        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        int[] res = s.twoSum(nums, target);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
