import java.util.ArrayList;
import java.util.List;

public class SS1676 {
    public int getDistance(int n, int m, int target, List<Integer> d) {
        // Write your code here.
        int result = 0;
        int l = 0;
        int r = n;
        while(l<=r)
        {
            int mid=(l+r)>>1;
            if(check(mid, n, m, d))
            {
                result = mid;
                l = mid+1;
            }
            else r = mid-1;
        }
        return result;
    }

    private boolean check(int x, int n, int m, List<Integer> d )
    {
        int last=0;
        int sum=0;

        for(int i = 0; i < n; i++)
        {
            if(d.get(i) - last<x)
                sum++;
            else
                last=d.get(i);
        }

        if(sum>m)
            return false;
        return true;
    }

    public static void main(String[] args)
    {
        int n = 5;
        int m = 2;
        int t = 25;
        List<Integer> d = new ArrayList<>(){};
        d.add(2);
        d.add(11);
        d.add(14);
        d.add(17);
        d.add(21);
        SS1676 s = new SS1676();
        int res = s.getDistance(n,m,t,d);
        System.out.println(res);
    }
}
