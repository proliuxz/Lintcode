package S1401TO1600;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S1521 {
    public int UniqueIDSum(int[] arr) {
        // write your code here
        Set<Integer> set = new HashSet<>();
        int res = 0;
        return Arrays.stream(arr).map( x -> {
            while (set.contains(x))
                x++;
            set.add(x);
            return x;
        }).sum();
    }
}
