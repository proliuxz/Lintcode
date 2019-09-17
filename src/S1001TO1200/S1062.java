package S1001TO1200;

public class S1062 {
    int[][] i;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Write your code here
        i = image;
        helper(sr,sc,image[sr][sc],newColor);
        return i;
    }

    public void helper(int x, int y, int ori, int chg)
    {
        if (x < 0 || y <0 || x > i[0].length || y > i.length)
            return;
        int[][] dirs = new int[][] { {1,0}, {-1,0}, {0,1}, {0,-1}};
        if (i[x][y] == ori)
        {
            i[x][y] = chg;
            for(int[] dir : dirs)
            {
                helper(x+dir[0], y+dir[1], ori, chg);
            }
        }
    }
}
