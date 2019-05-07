import java.util.Arrays;

public class SS1689 {
    public int getAns(int[] a, int k, int target) {
        // write your code here
        return helper(a,k,target,true) + helper(a,k,target,false);
    }

    public int helper(int[] a, int k, int target, boolean odd)
    {
        if (a.length == 0)
            return k==0 && target == 0 ? 1 : 0;
        if (a.length == 1 && k==1 && target == a[0])
        {
            if ((odd && a[0]%2 == 1) || (!odd && a[0]%2 == 0))
                return 1;
        }
        int[] next = Arrays.copyOfRange(a, 1, a.length);
        int result = helper(next, k, target, odd);
        if ((odd && a[0]%2 == 1) || (!odd && a[0]%2 == 0))
            result += helper(next,k-1, target-a[0], odd);
        return result;
    }

    public static void main(String[] args)
    {
        SS1689 s = new SS1689();
        int[] a = new int[] {8,1,5,5,4,7,2,1,5,8,1,4,1,3,7,3,5,3,6,8};
        int k = 4;
        int target = 8;
        int res = s.getAns(a, k, target);
        System.out.println(res);
    }
}
