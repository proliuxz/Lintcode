package S601TO800;

public class S615 {
    private int[] visited;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        visited = new int[numCourses];  //0 to not touched, 1 visiting, 2 visited
        for (int i = 0; i < prerequisites.length; i++ )
            if (dfs(prerequisites, i) == false) {
                return false;
            }
        return true;

    }

    private boolean dfs (int[][] prerequisites, int current) {
        if (current >= prerequisites.length) return true;
        switch(visited[prerequisites[current][1]]) {
            case 2:
                return true;
            case 1:
                visited[prerequisites[current][0]] = 1;
                return false;
            case 0:
                visited[prerequisites[current][1]] = 1;
                for (int i = 0; i < prerequisites.length; i++)
                    if (prerequisites[i][0] == prerequisites[current][1] && dfs(prerequisites, i) == false)
                        return false;
                visited[prerequisites[current][1]] = 2;
                break;
        }
        return true;
    }
}
