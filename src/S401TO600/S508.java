package S401TO600;

public class S508 {
    public void wiggleSort(int[] nums) {
        // write your code here
        if(nums == null || nums.length < 2)
            return;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((i % 2 == 0 ) ^ (nums[i+1] > nums[i])) {
                int tmp = nums[i+1];
                nums[i+1] = nums[i];
                nums[i] = tmp;
            }
        }
    }
}
