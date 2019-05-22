package S201TO400;

import java.util.ArrayList;
import java.util.List;

public class S235 {
    public List<Integer> primeFactorization(int num) {
        // write your code here
        List<Integer> factors = new ArrayList<Integer>();

        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                num = num / i;
                factors.add(i);
            }
        }

        if (num != 1) {
            factors.add(num);
        }

        return factors;
    }
}
