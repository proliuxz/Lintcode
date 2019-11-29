package S1401TO1600;

import java.util.*;

public class S1421 {
    public int MatrixGame(int[][] grids) {
        if (grids == null || grids.length == 0 || grids[0].length == 0)
            return 0;
        // write your code here
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <  grids[0].length ; i++) {
            list.add(findMaxFromCol(grids,i));
        }
        Collections.sort(list, (o1, o2) -> o2 - o1);
        int x = 1;
        int res = 0;
        for (int val: list
             ) {
            res += val * x;
            x *= -1;
        }
        return res;
    }

    public int findMaxFromCol(int[][] grids, int col)
    {
        int res = grids[0][col];
        for (int i = 1; i < grids.length; i++) {
            if(res < grids[i][col])
                res = grids[i][col];
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[][] grid = new int[][] {{9,6,1,2},{1,9,8,7},{4,7,6,3}};
        S1421 s = new S1421();
        int res = s.MatrixGame(grid);
        System.out.println(res);
    }
}
