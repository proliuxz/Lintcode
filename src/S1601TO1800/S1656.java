package S1601TO1800;

public class S1656 {
    public int getNum(int[] a, int L, int R) {
        // Write your code here
        int res = 0;
        for (int num: a
             ) {
            if (num >= L && num <= R)
                res++;
        }
        return res;
    }
}
