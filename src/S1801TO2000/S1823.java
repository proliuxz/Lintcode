package S1801TO2000;

public class S1823 {
    public int LongestPrefix(int X, int Y, int[] nums) {
        int cnt = 0;
        int res = -1;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == X)
            {
                cnt++;
                flag = true;
            }
            if (nums[i] == Y)
            {
                cnt--;
                flag = true;
            }
            if (cnt == 0 && flag)
                res = i;
        }
        return res;
    }
}
