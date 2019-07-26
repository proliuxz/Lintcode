package S1601TO1800;

import java.util.Arrays;

public class S1615 {
    public int[] getAns(int[] funds, int a, int b, int c) {
        // Write your code here
        int[] result = new int[]{ a, b, c};
        if (funds == null || funds.length == 0)
            return result;
        Arrays.stream(funds).forEach((int fund) -> {
            int id = 0;
            int min = result[id];
            for (int i = 1; i <3 ; i++) {
                if (result[i] < min)
                {
                    id = i;
                    min = result[id];
                }
            }
            result[id] += fund;
        });
        return result;
    }
}
