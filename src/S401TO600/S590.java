package S401TO600;

public class S590 {
    private int[] father = null;
    private int[] size = null;

    public S590(int n) {
        // initialize your data structure here.
        father = new int[n + 1];
        size = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            father[i] = i;
            size[i] = 1;
        }
    }

    private int find(int x) {
        int j, k, fx;
        j = x;
        while (father[j] != j)
            j = father[j];

        while (x != j){
            fx = father[x];
            father[x] = j;
            x = fx;
        }
        return j;
    }



    public void connect(int a, int b) {
        int root_a = find(a);
        int root_b = find(b);
        if (root_a != root_b) {
            father[root_a] = root_b;
            size[root_b] += size[root_a];
        }
    }

    public int query(int a) {
        // Write your code here
        int root_a = find(a);
        return size[root_a];
    }
}
