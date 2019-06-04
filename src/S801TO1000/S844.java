package S801TO1000;

import Util.Point;

public class S844 {
    public int pairNumbers(Point[] p) {
        // Write your code here
        int both = 0;
        int x = 0;
        int y = 0;
        int none = 0;
        for (Point point: p
             ) {
            if (point.x % 2 == 0)
            {
                if (point.y % 2 == 0)
                    both++;
                else
                    x++;
            }
            else
            {
                if (point.y % 2 == 0)
                    y++;
                else
                    none++;
            }
        }
        int res = 0;
        res += both * (both - 1) / 2;
        res += x * (x - 1) / 2;
        res += y * (y - 1) / 2;
        res += none * (none - 1) / 2;
        return res;
    }
}
