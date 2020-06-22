package S1201TO1400;

import java.util.HashMap;
import java.util.Map;

public class S1237 {
    public int numberOfBoomerangs(int[][] points) {
        if (points == null)
            return 0;

        int res = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Double, Integer> distances = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i == j)
                    continue;
                double distance = getDistance(points[i], points[j]);
                distances.put(distance, distances.getOrDefault(distance, 0) + 1);
            }
            for (int count : distances.values())
                res += count * (count - 1);
        }
        return res;
    }
    private double getDistance(int[] a, int[] b) {
        return Math.pow(a[0] - b[0], 2) + Math.pow(a[1] - b[1], 2);
    }
}
