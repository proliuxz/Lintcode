package S801TO1000;

import java.util.*;

public class S805 {
    public List<String> maximumAssociationSet(String[] ListA, String[] ListB) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<Integer, String> name = new HashMap<>();
        int n = 0;
        for (int i = 0; i < ListA.length; i++) {
            if (!hashMap.containsKey(ListA[i])) {
                hashMap.put(ListA[i], n);
                name.put(n, ListA[i]);
                n++;
            }

            if (!hashMap.containsKey(ListB[i])) {
                hashMap.put(ListB[i], n);
                name.put(n, ListB[i]);
                n++;
            }
        }
        int[] f = new int[n];
        for (int i = 0; i < n; i++)
            f[i] = i;

        for (int i = 0; i < ListA.length; i++) {
            int fa = find(hashMap.get(ListA[i]), f);
            int fb = find(hashMap.get(ListB[i]), f);
            if (fa != fb) {
                f[fa] = fb;
            }
        }

        int[] sum = new int[n];
        int v = 0, idx = 0;
        for (int i = 0; i < n; i++) {
            f[i] = find(i, f);
            sum[f[i]]++;
            if (sum[f[i]] > v) {
                v = sum[f[i]];
                idx = f[i];
            }
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++)
            if (f[i] == idx)
                res.add(name.get(i));
        return res;
    }


    private int find(int x, int[] f)
    {
        if (x != f[x])
            f[x] = find(f[x], f);
        return f[x];
    }
}
