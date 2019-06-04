package S801TO1000;

public class S952 {
    public int digitConvert(int n) {
        // Write your code here
        return digitConvert(n, 0);
    }
    public int digitConvert(int n, int cur) {
        // Write your code here
        if (n == 1)
            return cur;
        else
            return n % 2 == 0 ?
                    digitConvert(n >> 1, cur + 1) :
                    digitConvert( n * 3 + 1, cur + 1);
    }
}
