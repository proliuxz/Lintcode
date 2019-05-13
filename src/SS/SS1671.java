package SS;

public class SS1671 {
    public long playGames(int[] A) {
        // Write your code here
        int max = 0;
        for(int a : A)
        {
            max = Math.max(a, max);
        }

        long l = 0;
        long r = max * 2;

        while(l < r){
            long m = (l + r) >> 1;
            long cnt = 0;

            for(int a : A)
            {
                cnt += Math.max(m - a,0);
            }

            if(m > cnt)
                l = m + 1;
            else
                r = m;
        }
        return Math.max(l, max);
    }
}
