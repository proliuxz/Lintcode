package SS;

import java.util.ArrayList;
import java.util.List;

public class SS1690 {
    List<Integer> friends = new ArrayList<>();
    public int[] getAns(int[] val) {
        // Write your code here
        if (val ==null || val.length ==0)
            return new int[0];
        int[] result = new int[val.length - 1];
        friends.add(val[0]);
        for (int i = 1; i < val.length ; i++) {
            result[i-1] = findFriend(val[i]);
        }
        return result;
    }

    public int findFriend(int val) {
        int last = friends.get(friends.size() - 1);
        if(val >= last){
            friends.add(friends.size(),val);
            return last;
        }
        int first = friends.get(0);
        if (val <= first){
            friends.add(0, val);
            return first;
        }

        int l=0;
        int r=friends.size()-1;

        while(l < r){
            int m = l + (r - l)/2;
            if(val>friends.get(m)){
                l = m + 1;
            }else{
                r = m;
            }
        }
        int lv = friends.get(l-1);
        int rv = friends.get(l);
        friends.add(l,val);
        if (Math.abs(lv-val) > Math.abs(rv-val))
            return rv;
        else
            return lv;
    }

    public static void main(String[] args)
    {
        int[] val = new int[] {557091,752985,188469,777011,15595,432051,796577,547595};
        SS1690 s = new SS1690();
        int res[] = s.getAns(val);
        for(int r: res)
        {
            System.out.println(r);
        }
    }
}
