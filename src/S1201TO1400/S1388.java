package S1201TO1400;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class S1388 {
    public int flipgame(int[] fronts, int[] backs) {
        //
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < fronts.length; i++) {
            if (fronts[i] == backs[i])
                set.add(fronts[i]);
        }

        int min1 = Arrays.stream(fronts).filter(num -> !set.contains(num)).min().getAsInt();
        int min2 = Arrays.stream(backs).filter(num -> !set.contains(num)).min().getAsInt();
        return Math.min(min1, min2);
    }
}
