package S201TO400;

public class S366 {
    public int fibonacci(int n) {
        // write your code here
        if (n <= 2)
            return n;
        int[] res = new int[n];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i < n ; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[n - 1];
    }

    public static void main(String[] args)
    {
        S366 s = new S366();
        int res = s.fibonacci(47);
        System.out.println(res);
    }
}
