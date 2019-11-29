package S401TO600;

public class S518 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        // write your code here
        int len = primes.length;
        int[] count = new int[len];
        int[] res = new int[n];
        res[0] = 1;

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < primes.length; j++) {
                min = Math.min(min, primes[j] * res[count[j]]);
            }
            res[i] = min;

            for (int j = 0; j < count.length; j++) {
                if (res[count[j]] * primes[j] == min) {
                    count[j]++;
                }
            }
        }
        return res[n - 1];
    }
}
