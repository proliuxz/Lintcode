package S1201TO1400;

import java.util.*;

public class S1331 {
    public List<Integer> englishSoftware(List<Integer> score, List<Integer> ask) {
        int len = score.size();
        List<Integer> res = new ArrayList<>();

        List<Integer> scores = new ArrayList<>(score);
        Collections.sort(scores);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(scores.get(0), 0);

        for (int i = 1; i < len; i++)
            map.put(scores.get(i), 100 * i / len);

        for (int a : ask)
            res.add(map.get(score.get(a - 1)));
        return res;
    }
}
