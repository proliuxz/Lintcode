package S1801TO2000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S1812 {
    public List<Integer> HoldSign(int n) {
        // write your code here
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            if (visited[i] == true)
                continue;
            int changed = getChangedNum(i);
            if (changed != -1 && changed <= n)
            {
                res.add(i);
                res.add(changed);
                visited[i] = true;
                visited[changed] = true;
            }
        }
        return res;
    }

    private int getChangedNum(int num)
    {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(6,9);
        map.put(9,6);
        int res = 0;
        int op = num;
        if (op % 10 == 0)
            return -1;
        while (op > 0)
        {
            int cur = op % 10;
            if (!map.containsKey(cur))
                return -1;
            res = res * 10 + map.get(cur);
            op = op / 10;
        }
        if (res == num)
            return -1;
        return res;
    }

    public static void main(String[] args)
    {
        S1812 s = new S1812();
        System.out.println(s.HoldSign(100));
    }
}
