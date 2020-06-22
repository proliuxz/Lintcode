package S1001TO1200;

import java.util.List;

public class S1168 {
    public int arrayScore(List<Integer> nums, int k, long u, long l) {
        long res = 0;
        long sum = 0;

        if (nums.size() < k)
            return 0;
        for (int i = 0; i < k; i++)
            sum += nums.get(i);
        if (sum < u)
            res++;
        if (sum > l)
            res--;
        for (int i = k; i < nums.size(); i++) {
            sum += nums.get(i);
            sum -= nums.get(i - k);
            if (sum < u)
                res++;
            if (sum > l)
                res--;
        }
        return (int) res;
    }
}
