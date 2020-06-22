package S801TO1000;

import Util.Interval;

import java.util.Collections;
import java.util.List;

public class S920 {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, (i1, i2) -> i1.start == i2.start ? i1.end - i2.end : i1.start - i2.start);
        for (int i = 0; i < intervals.size() - 1; i++)
            if (intervals.get(i+1).start < intervals.get(i).end)
                return false;
        return true;
    }
}
