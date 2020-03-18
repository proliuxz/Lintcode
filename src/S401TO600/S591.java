package S401TO600;

public class S591 {

    private int[] father = null;
    private int res;

    public S591(int n) {
        father = new int[n + 1];
        res = n;
        for (int i = 1; i <= n; ++i)
            father[i] = i;
    }

    public void connect(int a, int b) {
        int root_a = find(a);
        int root_b = find(b);
        if (root_a != root_b) {
            father[root_a] = root_b;
            res --;
        }
    }

    public int query() {
        return res;
    }

    private int find(int x) {
        if (father[x] == x)
            return x;
        return father[x] = find(father[x]);
    }
}
