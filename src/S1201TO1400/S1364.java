package S1201TO1400;

import java.util.*;

public class S1364 {
    public int getMinDistance(int[][] mazeMap) {
        int h = mazeMap.length;
        int w = mazeMap[0].length;
        int[][] distance = new int[h + 1][w + 1];
        int[][] visited = new int[h + 1][w + 1];
        Map<Integer, List<int[]>> TP = new HashMap<>();
        Set<Integer> visitedTP = new HashSet<>();
        int bx = 0, by = 0, ex = 0, ey = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (mazeMap[i][j] == -2) {
                    bx = i;
                    by = j;
                } else if (mazeMap[i][j] == -3) {
                    ex = i;
                    ey = j;
                } else if (mazeMap[i][j] > 0)
                {
                    List list = TP.getOrDefault(mazeMap[i][j], new ArrayList<>());
                    list.add(new int[]{i, j});
                    TP.put(mazeMap[i][j], list);
                }
            }
        }

        int[] dirs = new int[]{0, 1, 0, -1, 0};
        distance[bx][by] = 0;
        visited[bx][by] = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{bx, by});
        while (q.isEmpty() == false) {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];
            int cost = distance[x][y];
            int idx = mazeMap[x][y];
            if (x == ex && y == ey)
                return distance[x][y];

            for (int k = 0; k < 4; k++) {
                int nx = x + dirs[k];
                int ny = y + dirs[k + 1];
                if (nx < 0 || nx >= h || ny < 0 || ny >= w || mazeMap[nx][ny] == -1 || visited[nx][ny] > 0)
                    continue;
                if (mazeMap[nx][ny] == -3)
                    return cost + 1;
                visited[nx][ny] = 1;
                distance[nx][ny] = cost + 1;
                q.add(new int[]{nx, ny});
            }
            if (idx > 0) {
                if (visitedTP.contains(idx))
                    continue;
                else {
                    for (int i = 0; TP.containsKey(idx) && i < TP.get(idx).size(); i++) {
                        int nx = TP.get(idx).get(i)[0];
                        int ny = TP.get(idx).get(i)[1];
                        if (visited[nx][ny] > 0) {
                            continue;
                        }
                        visited[nx][ny] = 1;
                        distance[nx][ny] = cost + 1;
                        q.add(new int[]{nx, ny});
                    }
                    visitedTP.add(idx);
                }
            }
        }
        return -1;
    }
}
