package S801TO1000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class S908 {
    public boolean isReflected(int[][] points) {
        // Write your code here
        if (points == null || points.length == 0)
            return true;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int[] point: points
             ) {
            List<Integer> line = map.getOrDefault(point[0], new ArrayList<>());
            line.add(point[1]);
            map.put(point[0], line);
        }
        Integer[] keys = map.keySet().stream().toArray(n -> new Integer[n]);

        for (int i = 0; i < keys.length / 2 + 1; i++){
            List<Integer> line = map.get(keys[i]);
            List<Integer> rLine = map.get(keys[keys.length - i - 1]);
            if (rLine == null)
                return false;
            if (rLine.size() != line.size())
                return false;
            for (int p: line
                 ) {
                if (!rLine.contains(p))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        S908 s =new S908();
        int[][] points = new int[][] { {0, 0}, {1, 0}};
        boolean res = s.isReflected(points);
        System.out.println(res);
    }
}
