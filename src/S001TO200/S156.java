package S001TO200;

import Util.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S156 {
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
        List<Interval> result = new ArrayList<>();
        if (intervals==null || intervals.size()==0)
            return result;
        Collections.sort(intervals, (Interval i1, Interval i2) ->
                i1.start == i2.start ? (i1.end - i2.end) : i1.start - i2.start);

        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        for (int i = 0; i <intervals.size() ; i++) {
            Interval interval = intervals.get(i);
            if (interval.start > end) {
                result.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            } else {
                end = Math.max(end, interval.end);
            }
        }
        result.add(new Interval(start,end));
        return result;
    }
}
