package S1001TO1200;

import java.util.*;

public class S1029 {
    Map<Integer, List<int[]>> flightMap;
    List<Integer> visited;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        // write your code here
        visited = new ArrayList<>();
        flightMap = new HashMap<>();
        for (int[] flight: flights) {
            List<int[]> list = flightMap.getOrDefault(flight[0], new ArrayList<>());
            list.add(flight);
            flightMap.put(flight[0], list);
        }
        return dfs(src, dst, K);
    }

    public int dfs(int start, int dst,  int remainTimes)
    {
        if (remainTimes <= 0)
            return -1;
        if (!flightMap.containsKey(start))
            return -1;
        if (visited.contains(start))
            return -1;
        List<int[]> flights = flightMap.get(start);
        if (flights.size() == 0)
            return -1;
        int money = -1;
        for (int i = 0; i < flights.size() ; i++) {
            int[] f = flights.get(i);
            int val = -1;
            if(f[1] == dst)
                val = f[2];
            else
            {
                visited.add(start);
                int m2 = dfs(f[1], dst, remainTimes-1);
                if (m2 != -1)
                    val = f[2]+m2;
                visited.remove(visited.size()-1);
            }
            if (val != -1)
            {
                if (money == -1)
                    money = val;
                money = Math.min(money, val);
            }
        }
        return money;
    }

    public static void main() {

    }
}
