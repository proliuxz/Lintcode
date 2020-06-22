package S1001TO1200;

import java.util.Arrays;

import static java.lang.Math.*;

public class S1194 {
    public int findMinMoves(int[] machines) {
        int sum = Arrays.stream(machines).sum();
        if(sum % machines.length != 0)
            return -1;
        int avg = sum / machines.length;
        int res = 0;
        int cnt = 0;
        for (int m : machines) {
            cnt += m - avg;
            res = max(res, max(abs(cnt), m - avg));
        }
        return res;
    }
}
