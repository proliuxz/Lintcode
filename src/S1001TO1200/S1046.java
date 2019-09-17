package S1001TO1200;

public class S1046 {
    public int countPrimeSetBits(int L, int R) {
        int res = 0;
        while(L <= R) {
            int x = L;
            int count = 0;
            while(L  != 0) {
                if((L & 1) == 1) count++;
                L >>= 1;
            }
            L = x + 1;
            if(isPrime(count))
                res++;
        }
        return res;
    }

    private boolean isPrime(int num)
    {
        return num == 2 ||
                num == 3 ||
                num == 5 ||
                num == 7 ||
                num == 11 ||
                num == 13 ||
                num == 17 ||
                num == 19;
    }
}
