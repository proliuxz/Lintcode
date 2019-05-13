package SS;

public class SS1753 {
    public long doingHomework(int[] cost, int[] val) {
        // Write your code here.
        long result = 0;
        if (val == null || val.length == 0)
            return result;

        int[] tCost = new int[cost.length];
        tCost[0] = cost[0];
        for (int i = 1; i < tCost.length ; i++) {
            tCost[i] = tCost[i - 1] + cost[i];
        }

        long res = 0;
        for (int v : val) {
            long va = search(tCost, v);
            if (va != -1) {
                res += va;
            }
        }
        return res;
    }

    private long search(int[] sums, int target) {
        if (target >= sums[sums.length - 1]) {
            return sums[sums.length - 1];
        }

        if (target < sums[0]) {
            return -1;
        }

        int l = 0, r = sums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (sums[mid] <= target && sums[mid + 1] > target) {
                return sums[mid];
            } else if (sums[mid] > target && sums[mid - 1] <= target) {
                return sums[mid - 1];
            } else if (sums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        SS1753 s = new SS1753();
        int[] cost = new int[] {9,3,3,1,7,5,8};
        int[] val = new int[] {17,35,25,1,1,15,25,25,5,19};
        long res = s.doingHomework(cost,val);
        System.out.println(res);
    }
}
