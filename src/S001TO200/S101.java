package S001TO200;

public class S101 {
    public int removeDuplicates(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int idx = 0;
        int cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[idx]) {
                if (cnt < 2) {
                    nums[++idx] = nums[i];
                    cnt ++;
                }
            } else {
                nums[++idx] = nums[i];
                cnt = 1;
            }
        }
        return idx + 1;
    }
}
