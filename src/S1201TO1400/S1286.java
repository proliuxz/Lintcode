package S1201TO1400;

public class S1286 {
    public boolean isSelfCrossing(int[] x) {
        if (x.length < 4)
            return false;
        for (int i = 3; i < x.length; i++) {
            if (    (x[i - 1] <= x[i - 3] && x[i] >= x[i - 2]) ||
                    (i > 4 && x[i] >= x[i - 2] - x[i - 4] && x[i - 1] >= x[i - 3] - x[i - 5] && x[i - 1] <= x[i - 3] && x[i - 2] >= x[i - 4])||
                    (i > 3 && x[i - 1] == x[i - 3] && x[i] >= x[i - 2] - x[i - 4])
            )
                return true;
        }
        return false;
    }
}
