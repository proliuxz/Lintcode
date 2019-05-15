package S201TO400;

public class S373 {
    public void partitionArray(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0)
            return;
        int l = 0;
        int r = nums.length - 1;
        while (l < r)
        {
            while (l < r && nums[l] % 2 == 1)
                l++;
            while (l < r && nums[r] % 2 == 0)
                r--;
            if (l < r)
            {
                int tmp = nums[r];
                nums[r] = nums[l];
                nums[l] = tmp;
                l++;
                r--;
            }
        }
    }
}
