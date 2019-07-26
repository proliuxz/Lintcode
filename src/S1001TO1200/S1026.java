package S1001TO1200;

public class S1026 {
    /*
        f(n):
           xxxxo
           xxxxo

        g(n)
           xxxxo
           xxxxx

        f(n) = f(n-1) + f(n-2) + g(n-1)
        g(n) = g(n-1) + f(n-2) * 2

        when n >= 3
        f(n)-f(n-1) = [f(n-1) + f(n-2) + g(n-1)] - [f(n-2) + f(n-3) + g(n-2)]
                    = f(n-1) - f(n-3) + g(n-1) - g(n-2)
                    = f(n-1) - f(n-3) + [g(n-1) - g(n-2)]
                    = f(n-1) + f(n-3)
            f(n)    = 2 * f(n-1) + f(n-3)
     */
    public int numTilings(int N) {
        // write your code here
        if (N <= 2)
            return N;
        int mod = 1000000007;
        int[] fs = new int[N];
        fs[0] = 1;
        fs[1] = 2;
        fs[2] = 5;
        for(int i = 3; i < N; i++) {
            fs[i] = 2 * fs[i - 1] % mod + fs[i - 3] % mod;
            fs[i] %= mod;
        }
        return fs[N-1];
    }
}
