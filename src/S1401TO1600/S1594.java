package S1401TO1600;

import java.util.HashSet;
import java.util.Set;

public class S1594 {
    public int[] fairCandySwap(int[] A, int[] B) {
        // Write your code here.
        int sum = 0;
        int sumA = 0;
        Set<Integer> set = new HashSet<>();
        for (int a : A
             ) {
            sum += a;
            sumA += a;
        }
        for (int b : B)
        {
            sum += b;
            set.add(b);
        }
        int d = sum >> 1 - sumA;
        System.out.println(sum);
        System.out.println(sumA);
        System.out.println(d);
        for (int a : A
             ) {
            int b = a + d;
            if (set.contains(b))
                return new int[] { a, b };
        }
        return null;
    }
}
