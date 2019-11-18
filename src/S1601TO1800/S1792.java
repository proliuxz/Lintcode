package S1601TO1800;

import java.util.Map;
import java.util.TreeMap;

public class S1792 {
    public int[] CutTheSticks(int[] sticks) {
        // write your code here
        Map<Integer, Integer> map = new TreeMap<>();
        for (int stick: sticks
             ) {
            map.put(stick, map.getOrDefault(stick, 0) + 1);
        }
        int[] res = new int[map.size()];
        if (sticks == null || sticks.length == 0)
            return res;
        res[0] = sticks.length;
        int i = 1;
        for (int key: map.keySet()) {
            if (i < map.size())
            {
                res[i] = res[i-1] - map.get(key);
            }
            i++;
        }
        return res;
    }

    public static void main(String[] args)
    {
        S1792 s = new S1792();
        int[] res = s.CutTheSticks(new int[] {1,2,3,4,3,3,2,1});
        for (int r: res
             ) {
            System.out.println(r);
        }
    }
}
