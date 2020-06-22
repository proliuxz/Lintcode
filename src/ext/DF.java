package ext;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class DF {
    public int solve(int n, int m, int[] t)
    {
        int signal = m;
        int time = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> students = new LinkedList<>();
        for (int s: t) {
            students.add(s);
        }
        while (!students.isEmpty())
        {
            // 打完饭
            if (map.containsKey(time))
            {
                signal += map.get(time);
                map.remove(time);
            }
            // 打饭
            while (signal > 0 && !students.isEmpty())
            {
                int finishTime = time + students.poll();
                map.put(finishTime, map.getOrDefault(finishTime, 0) + 1);
                signal--;
            }
            time++;
        }
        if (signal > 0)
            time--;
        return time;
    }

    public static void main(String[] args)
    {
        DF df = new DF();
        int res = df.solve(3,2,new int[] {1, 1, 1});
        System.out.println(res);
    }
}
