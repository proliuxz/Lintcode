package S1001TO1200;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;

public class S1065 {
    TreeMap<Integer, Integer> calendar;
    public S1065() {
        calendar = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer prev = calendar.floorKey(start);
        Integer next = calendar.ceilingKey(start);
        if ((prev == null || calendar.get(prev) <= start) && (next == null || end <= next)) {
            calendar.put(start, end);
            return true;
        }
        return false;
    }
}
