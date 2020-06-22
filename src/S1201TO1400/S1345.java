package S1201TO1400;

public class S1345 {
    public boolean isRobotBounded(String instructions) {
        // write your code here
        int[] ori = new int[] {0 , 0};
        int[][] dirs = new int[][] {{1,0}, {0,1}, {-1,0}, {0,-1}};
        int dir = 0;
        for (char c: instructions.toCharArray()) {
            if (c == 'G')
            {
                int[] d = dirs[dir];
                ori[0] += d[0];
                ori[1] += d[1];
            }
            if (c == 'L')
                dir = (dir + 3) % 4;
            if (c == 'R')
                dir = (dir + 1) % 4;
        }
        return (dir == 0 && ori[0] == 0 && ori[1] == 0) || dir != 0;
    }
}
