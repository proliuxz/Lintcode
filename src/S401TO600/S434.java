package S401TO600;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S434 {
    int[][] dirs = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public List<Integer> numIslands2(int n, int m, Point[] operators) {
        List<Integer> res = new ArrayList<>();
        if (n < 0 || m < 0 || operators == null) {
            return res;
        }
        int[] id = new int[n * m];          // union find array
        int count = 0;
        Arrays.fill(id, -1);

        for (int i = 0; i < operators.length; i++) {
            int index = m * operators[i].x + operators[i].y;
            if (id[index] != -1) {
                res.add(count);
                continue;
            }

            id[index] = index;
            count++;

            for (int[] dir : dirs) {
                int x = operators[i].x + dir[0];
                int y = operators[i].y + dir[1];
                int neighborIndex = m * x + y;
                if (x < 0 || x >= n || y < 0 || y >= m || id[neighborIndex] == -1) {
                    continue;
                }
                if (!connected(id, index, neighborIndex)) {
                    union(id, neighborIndex, index);
                    count--;
                }
            }

            res.add(count);
        }
        return res;
    }

    private boolean connected(int[] id, int p, int q) {
        return id[p] == id[q];
    }

    private void union(int[] id, int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}
