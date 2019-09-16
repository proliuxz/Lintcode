package S1401TO1600;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class S1564 {
    public String isInterval(List<List<Integer>> intervalList, int number) {
        // Write your code here
        for (List<Integer> interval: intervalList
        ) {
            if (interval.get(0) <= number && interval.get(1) >= number)
                return "True";
        }
        return "False";
    }
}
