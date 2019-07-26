package S801TO1000;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S877 {
    public boolean splitArray(List<Integer> nums) {
        // write your code here
        int n = nums.size();
        int[] sum = new int[n];
        sum[0] = nums.get(0);
        for (int i = 1; i < n; ++i)
            sum[i] = sum[i - 1] + nums.get(i);

        for (int j = 3; j < n - 3; ++j) {
            Set<Integer> S = new HashSet<>();
            for (int i = 1; i < j - 1; i++)
                if (sum[i - 1] == sum[j - 1] - sum[i])
                    S.add(sum[i - 1]);
            for (int k = j + 2; k < n - 1; ++k) {
                int s = sum[k - 1] - sum[j];
                if (s == sum[n - 1] - sum[k] && S.contains(s))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        S877 s = new S877();
        List<Integer> list = Arrays.asList(new Integer[] {1,3,2,1,3,2,1,3,2,1,3});
        boolean res = s.splitArray(list);
        System.out.println(res);
    }
}
