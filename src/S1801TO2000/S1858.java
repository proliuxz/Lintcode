package S1801TO2000;

import java.util.Arrays;

public class S1858 {
    public int maxBoxes(int[][] boxes) {
        if (boxes == null || boxes.length == 0)
            return 0;
        for (int[] box: boxes) {
            swapBox(box);
        }
        Arrays.sort(boxes, (a, b) -> a[0] != b[0]? a[0] - b[0]:a[1] - b[1]);
        int[] dp = new int[boxes.length];
        dp[0] = 1;
        for (int i = 1; i < boxes.length; i++) {
            int cur = i - 1;
            while (cur > 0)
            {
                if(boxes[i][0] > boxes[cur][0] && boxes[i][1] > boxes[cur][1])
                    dp[i] = Math.max(dp[i], dp[cur]) + 1;

                else
                    dp[i] = Math.max(dp[i], dp[cur]);
                cur--;
            }
        }
        return dp[boxes.length - 1];
    }

    private void swapBox(int[] box)
    {
        if (box[0] > box[1])
            return;
        int tmp = box[0];
        box[0] = box[1];
        box[1] = tmp;
    }
}
