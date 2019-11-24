package S401TO600;

public class S539 {
    public void moveZeroes(int[] nums) {
        // write your code here
        int zeroCnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zeroCnt++;
            else{
                nums[i-zeroCnt] = nums[i];
            }
        }
        for (int i = 0; i < zeroCnt; i++) {
            nums[nums.length - 1 - i] = 0;
        }
    }
}
