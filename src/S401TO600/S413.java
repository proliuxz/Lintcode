package S401TO600;

public class S413 {
    public int reverseInteger(int n) {
        // write your code here
        int res = 0;

        while (n != 0) {
            int temp = res * 10 + n % 10;
            n = n / 10;
            if (temp / 10 != res) {
                res = 0;
                break;
            }
            res = temp;
        }
        return res;
    }
}
