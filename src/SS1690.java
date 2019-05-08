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
            friends.add(val[i]);
        }
        return result;
    }

    private int findFriend(int val)
    {
        int res = friends.get(0);
        int distance = Math.abs(res - val);
        for (int friend : friends
             ) {
            int tDis = Math.abs(friend - val);
            if (tDis < distance)
            {
                distance = tDis;
                res = friend;
            }
            else if (tDis == distance)
            {
                res = Math.min(res, friend);
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] val = new int[] {557091,557091,188469,188469,15595,15595,15595};
        SS1690 s = new SS1690();
        s.getAns(val);
    }
}
