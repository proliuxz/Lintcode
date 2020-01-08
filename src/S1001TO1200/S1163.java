package S1001TO1200;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class S1163 {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new TreeSet();
        for (int candy : candies)
            set.add(candy);
        return Math.min(candies.length/2, set.size());
    }
}
