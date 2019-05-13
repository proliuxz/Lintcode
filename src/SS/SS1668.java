package SS;

import Util.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SS1668 {
    public int getAns(List<Interval> a) {
        // write your code here
        int result = 0;
        Collections.sort(a , (x1, x2) -> {
            int s = x1.start - x2.start;
            if (s == 0)
                return x1.end - x2.end;
            return s;
        });

        int start = 0;
        int end = 1;
        while (start < a.size() - 1 && end < a.size())
        {
            Interval cur = a.get(start);
            while (end<a.size() && a.get(end).start<cur.end)
            {
                Interval next = a.get(end);
                cur.start = next.start;
                cur.end = Math.min(cur.end, next.end);
                end++;
            }
            start = end;
            end = end + 1;
            result++;
        }
        if (end != a.size() - 1)
            result++;
        return result;
    }

    public static void main(String[] args)
    {
        Interval i1 = new Interval(27,74);
        Interval i2 = new Interval(25,65);
        Interval i3 = new Interval(8,36);
        Interval i4 = new Interval(21,63);
        Interval i5 = new Interval(18,20);
        Interval i6 = new Interval(35,51);
        Interval i7 = new Interval(55,86);
        Interval i8 = new Interval(49,69);
        Interval i9 = new Interval(79,89);
        List<Interval> intervals = new ArrayList<>();
        intervals.add(i1);
        intervals.add(i2);
        intervals.add(i3);
        intervals.add(i4);
        intervals.add(i5);
        intervals.add(i6);
        intervals.add(i7);
        intervals.add(i8);
        intervals.add(i9);
        SS1668 s = new SS1668();
        s.getAns(intervals);
    }
}
