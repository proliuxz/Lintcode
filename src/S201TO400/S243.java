package S201TO400;

import java.util.ArrayList;
import java.util.List;

public class S243 {
    public List<List<Integer>> amicablePair(int k) {
        // write your code here
        List<List<Integer>> result = new ArrayList<>();
        for (int cnt = 2; cnt <= k; ++cnt) {

            int amicable = factorSum(cnt);
            if (amicable <= cnt || amicable > k) {
                continue;
            }

            if (factorSum(amicable) == cnt) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(cnt);
                pair.add(amicable);
                result.add(pair);
            }
        }
        return result;
    }

    private int factorSum(int n) {
        int sum = 1, i;
        for (i = 2; i * i < n; ++i) {
            if (n % i == 0) {
                sum += i + n / i;
            }
        }
        if (i * i == n) {
            sum += i;
        }
        return sum;
    }
}
