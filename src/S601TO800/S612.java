package S601TO800;

import Util.Point;

import java.util.Arrays;
import java.util.PriorityQueue;

public class S612 {
    public Point[] kClosest(Point[] points, Point origin, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<Point> (k, (p1, p2) -> {
            int dis = getDistance(p2, origin) - getDistance(p1, origin);
            return dis != 0 ? dis : (p2.x - p1.x != 0 ? p2.x - p1.x : p2.y - p1.y);
        });

        for (int i = 0; i < points.length; i++) {
            pq.offer(points[i]);
            if (pq.size() > k)
                pq.poll();
        }

        k = pq.size();
        Point[] res = new Point[k];
        while (!pq.isEmpty())
            res[--k] = pq.poll();
        return res;
    }

    private int getDistance(Point p1, Point p2) {
        return (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y);
    }
}
