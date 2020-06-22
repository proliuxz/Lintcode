package S1201TO1400;

public class S1231 {
    public int minMoves(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int num: nums) {
            sum += num;
            min = Math.min(min, num);
        }
        return sum - min * nums.length;
    }
}
