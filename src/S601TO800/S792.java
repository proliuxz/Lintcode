package S601TO800;

public class S792 {
    public int kthPrime(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 2; i < n; i++)
            primes[i] = false;

        for (int i = 2; i < n; i++)
            if (primes[i] == false)
                for (int j = 2 * i; j < n; j += i)
                    primes[j] = true;

        int res = 1;
        for (int i = 2; i < n; i++) {
            if (primes[i] == false)
                res++;
        }
        return res;
    }
}
