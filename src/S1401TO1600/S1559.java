package S1401TO1600;

public class S1559 {
    public int takeTheElementAndQueryTheSum(int[] arr) {
        // Write your code here
        long res = 0;
        int mod = 1000000007;
        long cur = 0;
        for (int i = arr.length - 1; i >= 0 ; i--) {
            res = (res + cur * arr[i] % mod) % mod;
            cur = (cur + arr[i]) % mod;
        }
        return (int) res;
    }
}
