package S401TO600;

import java.util.HashSet;
import java.util.Set;

public class S488 {
    public boolean isHappy(int n) {
        // write your code here
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.add(n)) {
                return false;
            }
            n = helper(n);
        }
        return true;
    }

    private int helper(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}
