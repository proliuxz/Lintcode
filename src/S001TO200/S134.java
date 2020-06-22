package S001TO200;

import java.util.LinkedHashMap;
import java.util.Map;

public class S134 {
    Map<Integer, Integer> map;

    public S134(int capacity) {
        map = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void set(int key, int value) {
        map.put(key, value);
    }
}
