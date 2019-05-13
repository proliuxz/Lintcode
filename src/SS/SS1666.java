package SS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SS1666 {
    public int getWays(int[] a, int k) {
        // Write your code here
        if (a.length == 0 || k <= 0 || k > a.length)
            return 0;

        LinkedList<Integer> c = new LinkedList<>();
        var res = generateCombinations(a.length, k, 1, c);

        int ans = 0;
        for (List<Integer> list : res) {
            int sum = 0;
            for (int j = 0; j < list.size(); j++) {
                sum += a[list.get(j) - 1];
            }
            if (isPrime(sum)) {
                ans++;
            }
        }
        return ans;
    }
    private boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }
        boolean ans = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                ans = false;
                break;
            }
        }
        return ans;
    }

    private List<List<Integer>> generateCombinations(int n, int k, int start, LinkedList<Integer> c) {
        List<List<Integer>> res = new ArrayList<>();

        if (c.size() == k) {
            res.add((List<Integer>) c.clone());
            return res;
        }

        for (int i = start; i <= n - (k - c.size()) + 1; i++) {
            c.addLast(i);
            res.addAll(generateCombinations(n, k, i + 1, c));
            c.removeLast();
        }
        return res;
    }
}
