package S401TO600;

public class S513 {
    public int numSquares(int n) {
        // write your code here
        while (n % 4 == 0)
            n /= 4;
        if (n % 8 == 7)
            return 4;

        for (int a = 0; a * a <= n; a++) {
            int b =(int) Math.sqrt( n - a*a );
            if (a * a + b * b == n)
            {
                a = (a==0) ? 0 : 1;
                b = (b==0) ? 0 : 1;
                return a + b;
            }
        }
        return 3;
    }

    public static void main(String[] args)
    {
        S513 s = new S513();
        System.out.println(s.numSquares(12));
    }
}
