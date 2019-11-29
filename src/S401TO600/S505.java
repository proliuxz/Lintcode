package S401TO600;

import java.util.*;

public class S505 {
    TreeMap<Integer, Integer> map;
    S505() {
        map = new TreeMap<>();
    }
    public void hit(int timestamp) {
        // write your code here
        map.put(timestamp, map.getOrDefault(timestamp, 0) + 1);
    }

    public int get_hit_count_in_last_5_minutes(int timestamp) {
        // write your code here
        return map.tailMap(timestamp - 299).values().stream().mapToInt(Integer::valueOf).sum();
    }
}
