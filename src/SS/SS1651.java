package SS;

import Util.Interval;

import java.util.ArrayList;
import java.util.List;

public class SS1651 {
    public List<Integer> intervalXOR(int[] A, List<Interval> query) {
        //
        List<Integer> result = new ArrayList<>();
        for(Interval i : query)
        {
            result.add(A[i.start] ^ A[i.start + 1]);
        }
        return result;
    }
}
