package S1401TO1600;

import java.util.Arrays;

public class S1585 {
    public int movingStones(int[] arr) {
        // Write your code here
        Arrays.sort(arr);
        int oddR = 0;
        int evenR = 0;
        for (int i = 0; i < arr.length ; i++) {
            oddR += Math.abs(arr[i] - 2 * i - 1);
            evenR += Math.abs(arr[i] - 2 * i - 2);
        }
        return Math.min(oddR, evenR);
    }
}
