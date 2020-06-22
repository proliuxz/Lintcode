package S801TO1000;

import Util.Interval;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class S839 {
    public List<Interval> mergeTwoInterval(List<Interval> list1, List<Interval> list2) {
        List<Interval> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        // Can use merge sort, but I'm Lazy.
        return merge(list);
    }

    public List<Interval> merge(List<Interval> list) {
        list.sort((i1, i2) -> i1.start == i2.start ? i1.end - i2.end : i1.start - i2.start);
        LinkedList<Interval> merged = new LinkedList<>();
        for (Interval interval: list) {
            if (merged.isEmpty() || merged.getLast().end < interval.start)
                merged.add(interval);
            else
                merged.getLast().end = Math.max(merged.getLast().end, interval.end);
        }
        return merged;
    }
}
