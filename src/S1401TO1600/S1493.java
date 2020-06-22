package S1401TO1600;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S1493 {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[] dirs = {0, 1, 0, -1, 0};
        int dir = 0;
        int x = 0;
        int y = 0;
        int res = 0;
        Map<Integer, List<Integer>> obs = new HashMap<>();
        for (int[] ob : obstacles) {
            List<Integer> ys = obs.getOrDefault(ob[0], new ArrayList<>());
            ys.add(ob[1]);
            obs.put(ob[0], ys);
        }

        for (int command : commands) {
            if (command == -1)
                dir = (dir + 1) % 4;
            else if (command == -2)
                dir = (dir + 3) % 4;
            else {
                for (int i = 0; i < command; i++) {
                    int nx = x + dirs[dir];
                    int ny = y + dirs[dir + 1];
                    long code = (((long) nx + 30000) << 16) + ((long) ny + 30000);
                    if (!obs.containsKey(nx) || !obs.get(nx).contains(ny)) {
                        x = nx;
                        y = ny;
                        res = Math.max(res, x * x + y * y);
                    }
                }
            }
        }
        return res;
    }
}
