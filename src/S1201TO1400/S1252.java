package S1201TO1400;

import java.util.*;

public class S1252 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) ->
                o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
        List<int[]> res = new ArrayList<>();
        for (int[] cur : people)
            res.add(cur[1], cur);
        return res.toArray(new int[0][0]);
    }
}
