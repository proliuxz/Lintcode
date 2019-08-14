package S1401TO1600;

public class S1546 {
    public int coinProblem(int n, int m) {
        // Write your code here
        int rest = n - m;
        int res = 0;
        int[] notes = { 100, 50, 20, 10, 5, 2, 1 };
        for (int note: notes
             ) {
            if (rest >= note)
            {
                int noteMoney = (int) Math.ceil(rest / note);
                res += noteMoney;
                rest = rest - noteMoney * note;
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        int n = 100;
        int m = 29;
        S1546 s = new S1546();
        System.out.println(s.coinProblem(n, m));
    }
}
