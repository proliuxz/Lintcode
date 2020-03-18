package S601TO800;

public class S735 {
    public void arrayReplaceWithGreatestFromRight(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int len = nums.length;
        int r = nums[len - 1];
        nums[len - 1] = -1;
        for (int i = len - 2; i >= 0; i--) {
            int tmp = nums[i];
            nums[i] = r;
            r = Math.max(tmp, r);
        }
    }
}
