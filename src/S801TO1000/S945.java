package S801TO1000;

import java.util.Arrays;

public class S945 {
    public int leastInterval(char[] tasks, int n) {
        // write your code here
        int[] ts = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            ts[tasks[i] - 'A']++;
        }
        Arrays.sort(ts);

        int max = ts[25];
        int count = 0;
        int i = 26;
        while (i-- >= 0 && ts[i] == max)
            count++;

        return Math.max(tasks.length, (max - 1) * (n + 1) + count);
    }
}
