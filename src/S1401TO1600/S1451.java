package S1401TO1600;

public class S1451 {
    public int maxDistToClosest(int[] seats) {
        int l = 0;
        int r = 0;
        int res = 0;
        for (; r < seats.length; r++)
            if (seats[r] == 1) {
                if (l == 0)
                    res = r;
                else
                    res = Math.max(res, (r - l + 1) >> 1);
                l = r + 1;
            }
        res = Math.max(res, seats.length - l);
        return res;
    }
}
