package S001TO200;

import java.util.ArrayList;
import java.util.List;

public class S050 {
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        List<Long> result = new ArrayList<>();
        if (nums == null || nums.size() == 0)
            return result;
        int len = nums.size();
        long[] l2r = new long[len + 1];
        long[] r2l = new long[len + 1];
        l2r[0] = 1;
        r2l[len] = 1;
        for (int i = 1; i < nums.size() + 1; i++) {
            l2r[i] = l2r[i - 1] * nums.get(i - 1);
            r2l[len - i] = r2l[len - i + 1] * nums.get(len - i);
        }
        for (int i = 0; i < nums.size(); i++) {
            result.add(l2r[i] * r2l[i+1]);
        }
        return result;
    }

    public static void main(String[] args)
    {
        S050 s = new S050();
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        s.productExcludeItself(nums);
    }
}
