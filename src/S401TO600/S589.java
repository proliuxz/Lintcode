package S401TO600;

import java.util.*;

public class S589 {
    private int[] father;

    public S589(int n) {
        father = new int[n + 1];
        for (int i = 1; i <= n; ++i)
            father[i] = i;
    }

    private int find(int x) {
        if (father[x] == x)
            return x;
        return father[x] = find(father[x]);
    }

    public void connect(int a, int b) {
        // Write your code here
        int root_a = find(a);
        int root_b = find(b);
        if (root_a != root_b)
            father[root_a] = root_b;
    }

    public boolean  query(int a, int b) {
        // Write your code here
        int root_a = find(a);
        int root_b = find(b);
        return root_a == root_b;
    }
}
