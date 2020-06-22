package S001TO200;

public class S052 {
    public int[] nextPermutation(int[] nums) {
        int len = nums.length;
        if ( len <= 1)
            return nums;
        int i = len - 1;
        while (i > 0 && nums[i] <= nums[i - 1])
            i --;

        if (i != 0) {
            int j = len - 1;
            while (nums[j] <= nums[i - 1])
                j--;
            swapItem(nums, j, i-1);
        }
        swapList(nums, i, len - 1);
        return nums;
    }

    public void swapItem(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void swapList(int[] nums, int i, int j) {
        while (i < j) {
            swapItem(nums, i, j);
            i++;
            j--;
        }
    }
}
