package S801TO1000;

import Util.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Point{
    int time;
    int flag;

    Point(int t, int s){
        this.time = t;
        this.flag = s;
    }
}

public class S919 {

        // Write your code here
    public int minMeetingRooms(Interval[] intervals) {
        List<Point> list = new ArrayList<>();
        for(Interval i : intervals){
            list.add(new Point(i.start, 1));
            list.add(new Point(i.end, 0));
        }

        Collections.sort(list, (Point p1, Point p2) -> p1.time == p2.time ? p1.flag - p2.flag : p1.time - p2.time);
        int count = 0, ans = 0;
        for(Point p : list){
            if(p.flag == 1) {
                count++;
            }
            else {
                count--;
            }
            ans = Math.max(ans, count);
        }

        return ans;
    }

}
