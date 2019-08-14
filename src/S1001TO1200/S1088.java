package S1001TO1200;

public class S1088 {
    int[] parent;
    int cnt;
    private void init(int len)
    {
        parent = new int[len];
        cnt = len;
        for(int i = 0; i < len; i++)
            parent[i] = i;
    }

    public int find(int n){
        if(parent[n] == n)
            return n;
        parent[n] = find(parent[n]);
        return parent[n];
    }

    public boolean unionFind(int a,int b){
        int parentA = find(a);
        int parentB = find(b);
        if(parentA != parentB) {
            parent[parentA]=parentB;
            return false;
        }
        return true;
    }

    public int[] findRedundantConnection(int[][] edges) {
        // write your code here
        init(edges.length + 1);
        for(int[] edge:edges){
            if(unionFind(edge[0],edge[1])){
                return edge;
            }
        }
        return new int[0];
    }
}
