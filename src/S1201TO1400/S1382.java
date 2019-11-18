package S1201TO1400;

import java.util.Arrays;

public class S1382 {
    public long getMaxValue(int s, int[] v, int[] c) {
        // Write your code here
        int n = v.length;
        int half = n >> 1;

        VCPair[] pairs = new VCPair[1 << half];
        for (int i = 0; i < (1 << half); i++) {
            long value = 0;
            long volume = 0;
            for (int j = 0; j < half; j++) {
                if ((i >>> j & 1) == 1) {
                    volume += c[j];
                    value += v[j];
                }
            }
            pairs[i] = new VCPair(value, volume);
        }

        Arrays.sort(pairs, (VCPair p1, VCPair p2) ->
                (p1.c == p2.c ? (int) (p2.v - p1.v) : (int) (p1.c - p2.c)));

        int index = 0;
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[index].v < pairs[i].v) {
                pairs[++index] = pairs[i];
            }
        }

        long max = 0;
        for (int i = 0; i < 1 << (n - half); i++) {
            long column = 0;
            long value = 0;
            for (int j = 0; j < n - half; j++) {
                if ((i >>> j & 1) == 1) {
                    column += c[half + j];
                    value += v[half + j];
                }
            }
            if (column <= s) {
                int pos = getFirstHalf(pairs, s - column);
                long preValue = pos == -1 ? 0 : pairs[pos].v;
                max = Math.max(max, value + preValue);
            }
        }
        return max;
    }

    private int getFirstHalf(VCPair[] pairs, long target) {
        int left = -1;
        int right = pairs.length - 1;
        while (left < right) {
            int mid = left + ((right - left + 1) >> 1);
            if (target >= pairs[mid].c) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    class VCPair
    {
        long v;
        long c;
        public VCPair(long v, long c)
        {
            this.v = v;
            this.c = c;
        }
    }
}


