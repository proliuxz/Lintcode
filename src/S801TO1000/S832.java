package S801TO1000;

public class S832 {
    public int countNumber(int[][] nums) {
        if (nums == null || nums.length == 0 || nums[0].length == 0)
            return 0;
        int h = nums.length;
        int w = nums[0].length;
        int res = 0;
        int idx = w;

        for(int i = 0; i < h; i++) {
            while(idx > 0) {
                if(nums[i][idx - 1] < 0)
                    break;
                idx--;
            }
            res += idx;
        }
        return res;
    }
}
