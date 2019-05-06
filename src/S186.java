import Util.Point;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S186 {
    public int maxPoints(Point[] points) {
        // write your code here
        if (points == null || points.length == 0){
            return 0;
        }
        Map<String, List<Point>> slopes = new HashMap<>();
        int res = 0;
        for (int i = 0; i < points.length; i++){
            //starting from different points, could be same slope but they are not in a line
            slopes = new HashMap<String, List<Point>>();
            int samePoints = 1;
            int max = 0;
            for (int j = i + 1; j < points.length; j++){
                int deltaY = points[j].y - points[i].y;
                int deltaX = points[j].x - points[i].x;
                if (deltaY == 0 && deltaX == 0){
                    samePoints++;
                    continue;
                }
                int gcd = getGCD(deltaX, deltaY);
                deltaY /= gcd;
                deltaX /= gcd;
                String slope = deltaY + ":" + deltaX;
                if (!slopes.containsKey(slope)){
                    slopes.put(slope, new ArrayList<Point>());
                }
                slopes.get(slope).add(points[j]);
                max = Math.max(max, slopes.get(slope).size());
            }
            res = Math.max(res, max + samePoints);
        }
        return res;
    }

    private int getGCD(int a, int b){
        if (b == 0){
            return a;
        } else {
            return getGCD(b, a % b);
        }
    }

}
