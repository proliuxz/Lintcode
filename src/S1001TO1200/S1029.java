package S1001TO1200;

public class S1029 {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        // write your code here
        final int INF = 0x3f3f3f3f;
        int m = flights.length;
        int[] dis = new int[n]; // dis[i]表示i到src的最短路距离
        for (int i = 0; i < n; i++) {
            dis[i] = INF; // 初始化为无穷大
        }
        dis[src] = 0;

        boolean[] updated = new boolean[n]; // updated[i] 表示i到src的最短路距离是否被更新过
        for (int I = 0; I <= K; I++) { // 迭代K + 1次
            for (int i = 0; i < m; i++) { // Bellman-Ford算法: 用每一条边进行松弛操作
                int u = flights[i][0];
                int v = flights[i][1];
                int w = flights[i][2];
                if (updated[u] == false && dis[u] + w < dis[v]) {
                    dis[v] = dis[u] + w; // 只使用还没有被更新过的点进行松弛操作, 保证每一次迭代路径中最多只会添加一条边
                    updated[v] = true; // v的最短路被更新了, 把updated设为true
                }
            }
            for (int i = 0; i < n; i++) { // 这一轮迭代结束要把updated还原为false
                updated[i] = false;
            }
        }

        return dis[dst] == INF ? -1 : dis[dst];
    }
}
