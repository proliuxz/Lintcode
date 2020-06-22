package S1001TO1200;

import java.util.PriorityQueue;

public class S1139 {
    public long thekthSubarray(int[] a, long k) {
        int n = a.length;
        int sum[] = new int[n + 1];
        sum[0] = 0;
        sum[1] = a[0];
        for (int i = 2; i <= n; i++)
            sum[i] = sum[i - 1] + a[i - 1];

        PriorityQueue<Integer> Q = new PriorityQueue<>((x1, x2) -> x2 - x1);
        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j <= n; j++)
            {
                int x = sum[j] - sum[i - 1];
                if (Q.size() < k + 1)
                    Q.add(x);

                else
                {
                    if (Q.peek() > x)
                    {
                        Q.poll();
                        Q.add(x);
                    }
                }
            }
        }
        return Q.poll();
    }
}
