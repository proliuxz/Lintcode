package S1801TO2000;

public class S1886 {
    public void MoveTarget(int[] nums, int target) {
        int l = nums.length - 1;
        int r = l;
        while (l >= 0) {
            if (nums[l] != target) {
                nums[r] = nums[l];
                r--;
            }
            l--;
        }
        while (r >= 0)
            nums[r--] = target;
    }
}
