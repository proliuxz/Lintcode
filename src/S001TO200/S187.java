package S001TO200;

public class S187 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // write your code here
        if (gas == null || gas.length == 0)
            return -1;
        int start = -1;
        int sum = 0;
        int cur = 0;
        for (int i = 0; i < gas.length ; i++) {
            int gasChange = gas[i] - cost[i];
            sum += gasChange;
            cur += gasChange;
            if(cur < 0)
            {
                start = i;
                cur = 0;
            }
        }
        return sum < 0 ? -1 : start + 1;
    }
}
