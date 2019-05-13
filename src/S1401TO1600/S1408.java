package S1401TO1600;

public class S1408 {
    public int getTimes(int target, int original, int[] distance, int[] apply) {
        // Write your code here
        return dfs(target, original, distance, apply, 0,0);
    }

    public int dfs(int target, int gas, int[] distance, int[] apply, int times, int pos)
    {
        if(gas >= target)
            return times;
        if(distance == null || distance.length == 0 || gas < distance[pos] || apply == null || apply.length == 0)
            return -1;
        int nextTarget = target - distance[pos];
        int nextGas1 = gas - distance[pos];
        int nextGas2 = gas - distance[pos] + apply[pos];
        int t1 = dfs(nextTarget, nextGas1, distance, apply, times, pos +1);
        int t2 = dfs(nextTarget, nextGas2, distance, apply, times, pos +1);
        if (t1 == -1 || t2 == -1)
            return t1 == -1 ? t2 : t1;
        return Math.min(t1, t2);
    }
}
