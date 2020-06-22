package S001TO200;

import Util.Interval;

import java.util.ArrayList;
import java.util.List;

public class S030 {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> res = new ArrayList<>();
        int idx = 0;
        while (idx < intervals.size() && intervals.get(idx).start < newInterval.start)
            idx++;
        intervals.add(idx, newInterval);
        Interval last = null;
        for (Interval item : intervals) {
            if (last == null || last.end < item.start) {
                res.add(item);
                last = item;
            } else
                last.end = Math.max(last.end, item.end);
        }
        return res;
    }
}
