package S1201TO1400;

import java.util.Arrays;

public class S1338 {
    public int ParkingDilemma(int[] cars, int k) {
        if (cars == null || cars.length == 0)
            return 0;
        Arrays.sort(cars);
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < cars.length && i + k - 1 < cars.length; i++)
            minLen = Math.min(minLen, cars[i + k - 1] - cars[i] + 1);
        return minLen;
    }
}
