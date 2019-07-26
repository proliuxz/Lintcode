package S1001TO1200;

public class S1027 {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        // write your code here
        int r = calc(0, 0, target[0], target[1]);
        for (int[] ghost: ghosts
             ) {
            int dis = calc(ghost[0],ghost[1],target[0],target[1]);
            if (dis <= r)
                return false;
        }
        return true;
    }

    private int calc(int x, int y, int x1, int y1)
    {
        return Math.abs(x - x1) + Math.abs(y - y1);
    }

    public static void main(String[] args)
    {
        S1027 s = new S1027();
        int[][] ghosts = {{1,0}};
        int[] target = {2, 0};
        System.out.println(s.escapeGhosts(ghosts, target));
    }
}
