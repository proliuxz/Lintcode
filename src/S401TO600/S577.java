package S401TO600;

import Util.Interval;

import java.util.ArrayList;
import java.util.List;

public class S577 {
    public List<Interval> mergeKSortedIntervalLists(List<List<Interval>> intervals) {
        List<Interval> res = new ArrayList<>();
        for (List<Interval> interval : intervals) {
            res = merge(res, interval);
        }
        return res;
    }

    private List<Interval> merge(List<Interval> list1, List<Interval> list2) {
        if (list1 == null || list1.size() == 0)
            return list2;
        if (list2 == null || list2.size() == 0)
            return list1;

        List<Interval> res = new ArrayList<>();
        int idx1 = 0;
        int idx2 = 0;
        while (idx1 < list1.size() || idx2 < list2.size()) {
            Interval t1 = null;
            Interval t2 = null;
            Interval next = null;

            if (idx1 < list1.size())
                t1 = list1.get(idx1);

            if (idx2 < list2.size())
                t2 = list2.get(idx2);

            if (t1 == null) {
                next = t2;
                idx2++;
            } else if (t2 == null) {
                next = t1;
                idx1++;
            } else {
                if (t1.start <= t2.start) {
                    next = t1;
                    idx1++;
                } else {
                    next = t2;
                    idx2++;
                }
            }
            if (res.size() == 0) {
                res.add(next);
            } else {
                Interval last = res.get(res.size() - 1);
                if (last.end >= next.start) {
                    last.end = Math.max(last.end, next.end);
                } else {
                    res.add(next);
                }
            }
        }
        return res;
    }
}
