package S1201TO1400;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class S1324 {
    public int countPrimes(int n) {
        List<Integer> res = new ArrayList<>();
        if (n < 3) {
            return 0;
        }
        res.add(2);
        for (int i = 3; i < n; i += 2) {
            boolean isPrime = true;
            double sqrt = Math.sqrt(i);
            for (int j = 0; j < res.size(); j++) {
                int num = res.get(j);
                if (num > sqrt)
                    break;
                if (i % num == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                res.add(i);
        }
        return res.size();
    }
}
