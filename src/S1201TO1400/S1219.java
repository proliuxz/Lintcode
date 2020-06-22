package S1201TO1400;

import java.util.Arrays;

public class S1219 {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int radius = 0;
        int i = 0;
        int j = 0;

        while (i < houses.length) {
            while (j + 1 < heaters.length && Math.abs(heaters[j] - houses[i]) >= Math.abs(heaters[j + 1] - houses[i])) {
                j++;
            }
            radius = Math.max(radius, Math.abs(heaters[j] - houses[i]));
            i++;
        }
        return radius;
    }
}
