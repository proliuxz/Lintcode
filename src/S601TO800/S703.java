package S601TO800;

public class S703 {
    public int[] folding(int[] nums, int[] req) {
        int n = nums.length;
        int k = req.length;
        int l = 1;
        for (int i = 0; i < k; i++) {
            int m = n / (2 * l);
            fold(nums, m, l, req[i]);
            l *= 2;
        }
        return nums;
    }

    private void fold(int[] nums, int m, int l, int dir) {
        for (int i = 0; i < l; i++)
            insert(nums, m, 2 * m * i + m * dir, i + dir);
        reverse(nums);
    }

    private void insert(int[] nums, int m, int i, int t) {
        for (int j = 0; j < t; j++)
            interval_swap(nums, m, i - j * m);
    }

    private void interval_swap(int[] nums, int m, int i) {
        for (int j = 0; j < m; j++)
            swap(nums, i + j, i + j - m);
    }

    private void reverse(int[] nums) {
        int i = 0;
        int j = nums.length / 2 - 1;
        while (i < j)
            swap(nums, i++, j--);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
