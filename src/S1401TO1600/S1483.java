package S1401TO1600;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S1483 {
    public double maximumAverageScore(List<String> names, int[] grades) {
        Map<String, double[]> map = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            double[] sc = map.getOrDefault(name, new double[] {0, 0});
            sc[0]++;
            sc[1] += grades[i];
            map.put(name, sc);
        }
        double res = 0;
        for (double[] score: map.values()) {
            res = Math.max(res, score[1] / score[0]);
        }
        return res;
    }
}
