package S1401TO1600;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S1565 {
    public int modernLudo(int length, int[][] connections) {
        // Write your code here
        Map<Integer, List<Integer>> c = new HashMap<>();
        for (int[] connection : connections
        ) {
            if (connection[1] > connection[0])
            {
                List list = c.getOrDefault(connection[1], new ArrayList<Integer>());
                list.add(connection[0]);
                c.put(connection[1], list);
            }
        }

        int[] steps = new int[length + 1];
        for (int i = 1; i < length + 1; i++) {
            steps[i] = (i + 4) / 6;
            for (int j = 1; (j < 7 && i - j > 0); j++) {
                steps[i] = Math.min(steps[i], steps[i - j] + 1);
            }
            if(c.containsKey(i))
            {
                List<Integer> list = c.get(i);
                for (int cc: list
                     ) {
                    steps[i] = Math.min(steps[i], steps[cc]);
                }
            }
        }
        return steps[length];
    }

    public static void main(String[] args)
    {
        int[][] connections = new int[][] {{42,44},{8,18},{43,50},{7,58},{4,16},{39,55},{13,22},{47,49},{45,58},{38,60},{33,43}};
        int len = 73;
        S1565 s = new S1565();
        System.out.println(s.modernLudo(len, connections));
    }
}
