package S1801TO2000;

public class S1857 {
    int[][] grid;
    int[] visited;
    int l;

    public int findCircleNum(int[][] M) {
        l = M.length;
        int res = 0;
        visited = new int[l];
        grid = M;

        for(int i = 0; i < l; i++){
            if(visited[i] == 0){
                res++;
                helper(i);
            }
        }
        return res;
    }

    private void helper(int p) {
        for (int i = 0; i < l; i++) {
            if (grid[p][i] == 1 && visited[i] == 0)
            {
                visited[i] = 1;
                helper(i);
            }
        }
    }
}
