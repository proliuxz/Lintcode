package S1201TO1400;

public class S1295 {
    public int Count_PrimeNum(int N) {
        int res = 0;
        for (int i = 2; i <= N; i++)
            res += helper(i);
        return res;
    }

    private int helper(int num){
        int a = 2;
        int res = 0;
        while(num >= a){
            if(num % a == 0){
                res++;
                num = num / a;
            }
            else
                a++;

        }
        return res;
    }
}
