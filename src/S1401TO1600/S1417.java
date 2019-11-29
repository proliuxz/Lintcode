package S1401TO1600;

public class S1417 {
    public int minimumtimes(int n) {
        // Write your code here
        int res;
        res = 0;

        if (n % 3 == 0 )
            n = n - 1;

        while (n > 0) {
            n = n / 3;
            res++;
        }

        return res;
    }

    public static void main(String[] args)
    {
        var res = Math.pow( 3, (1.0/3.0));
        System.out.println(res);
    }
}
