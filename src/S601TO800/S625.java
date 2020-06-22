package S601TO800;

public class S625 {
    public void partition2(int[] nums, int low, int high) {
        if (nums == null || nums.length <= 1)
            return;

        int l = 0;
        int r = nums.length - 1;
        int i = 0;
        while (i <= r) {
            if (nums[i] < low) {
                swap(nums, l, i);
                l++;
                i++;
            } else if (nums[i] > high) {
                swap(nums, r, i);
                r--;
            } else {
                i ++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
