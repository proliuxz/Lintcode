package S001TO200;

public class S183 {
    public int woodCut(int[] L, int k) {
        // write your code here
        if (L == null || L.length == 0 || k <= 0) {
            return 0;
        }

        int start = 1;
        int end = 1;
        for (int wood : L) {
            end = Math.max(wood, end);
        }

        while (start <= end)
        {
            int mid = start + (end - start) >>> 1;
            if (cut(L, mid) >= k) {
                start = mid;
            }
            else {
                end = mid;
            }
        }

        if (cut(L, end) >= k) {
            return end;
        }

        if (cut(L, start) >= k) {
            return start;
        }
        return 0;
    }

    private int cut(int[] L, int len)
    {
        int count = 0;
        for (int wood : L) {
            count += wood / len;
        }
        return count;
    }
}
