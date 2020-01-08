package S1201TO1400;

public class S1385 {
    public int luckyNumber(int n) {
        int res = 0;
        for(int i = 1; i <= n; i++) {
            int x = i;
            while(x != 0) {
                if(x % 10 == 8) {
                    res++;
                    break;
                }
                x /= 10;
            }
        }
        return res;
    }
}
