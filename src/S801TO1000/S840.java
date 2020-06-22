package S801TO1000;

public class S840 {
    private int[] arr, bit;
    public S840(int[] nums) {
        arr = new int[nums.length];
        bit = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++)
            update(i, nums[i]);
    }

    public void update(int i, int j) {
        int delta = j - arr[i];
        arr[i] = j;
        for (int k = i + 1; k <= arr.length; k = k + lowbit(k))
            bit[k] += delta;
    }

    private int getPrefixSum(int index) {
        int sum = 0;
        for (int i = index + 1; i > 0; i = i - lowbit(i))
            sum += bit[i];
        return sum;
    }

    private int lowbit(int x) {
        return x & (-x);
    }

    public int sumRange(int i, int j) {
        return getPrefixSum(j) - getPrefixSum(i - 1);
    }
}
