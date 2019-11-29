package S601TO800;

public class S767 {
    public void reverseArray(int[] nums) {
        // write your code here
        for (int i = 0; i < nums.length >> 1; i++) {
            int tmp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = tmp;
        }
    }
}
