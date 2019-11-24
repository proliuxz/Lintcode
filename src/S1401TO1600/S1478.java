package S1401TO1600;

import java.util.Arrays;

public class S1478 {
    public int closestTargetValue(int target, int[] array) {
        // Write your code here
        if (array == null || array.length < 2)
            return -1;
        Arrays.sort(array);
        int l = 0;
        int r = array.length - 1;
        int diff = Integer.MAX_VALUE;
        while (l < r)
        {
            if (array[l] + array[r] > target)
                r--;
            else {
                diff = Math.min(diff, target - array[l] - array[r]);
                l++;
            }
        }
        if (diff == Integer.MAX_VALUE)
            return -1;
        else
            return target - diff;
    }
}
