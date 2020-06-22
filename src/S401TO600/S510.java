package S401TO600;

import java.util.Stack;

public class S510 {
    public int maximalRectangle(boolean[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return 0;
        int res = 0;
        int h = matrix.length;
        int w = matrix[0].length;
        int[] height = new int[w + 1];
        for (int i = 0; i < h; i++) {
            Stack<Integer> s = new Stack<>();
            for (int j = 0; j < w + 1; j++) {
                if (j < w)
                    height[j] = matrix[i][j] == true ? height[j] + 1 : 0;
                while (!s.empty() && height[s.peek()] >= height[j]) {
                    int cur = s.peek();
                    s.pop();
                    res = Math.max(res, height[cur] * (s.empty() ? j : (j - s.peek() - 1)));
                }
                s.push(j);
            }
        }
        return res;
    }
}
