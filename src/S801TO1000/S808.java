package S801TO1000;

import java.util.PriorityQueue;
import java.util.Queue;

public class S808 {

    public void dfs(int[] rating, int[][] G, int x, int S, Queue<int[]> pq, boolean[] visit) {
        if(visit[x] == true) 
            return;
        visit[x] = true;
        if(x != S) 
            pq.add(new int[] {rating[x], x});
        for(int i = 0; i < G[x].length; i++) 
            dfs(rating, G, G[x][i], S, pq, visit);
    }


    public int[] topKMovie(int[] rating, int[][] G, int S, int K) {
        Queue<int[]> pq =  new PriorityQueue<>(K, (m1,m2) -> m1[0] == m2[0] ? m1[1] - m2[1] : m2[0] - m1[0]);
        boolean[] visit = new boolean[rating.length];
        dfs(rating, G, S, S, pq, visit);
        int[] res = new int[K];
        for(int i = 0; i < K; i++)
            if(!pq.isEmpty()) {
                int[] top = pq.poll();
                res[i] = top[1];
            }
        return res;
    }
}
