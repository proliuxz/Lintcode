package S1001TO1200;

public class S1028 {
    public int rotatedDigits(int N) {
        int res = 0;
        for (int i = 1; i <= N; i++)
            if (helper(i))
                res++;
        return res;
    }

    private boolean helper(int num) {
        boolean res = false;
        while (num > 0) {
            int i = num % 10;
            if (i == 3 || i == 4 || i == 7)
                return false;
            if (i == 2 || i == 5 || i == 6 || i == 9)
                res = true;
            num /= 10;
        }
        return res;
    }
}
