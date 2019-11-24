package S601TO800;

import Util.Point;

public class S626 {
    public boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {
        // write your code here
        return l1.x > r2.x || l2.x > r1.x || l1.y < r2.y || l2.y < r1.y;
    }
}
