package S1401TO1600;

import java.util.ArrayList;
import java.util.List;

public class S1438 {
    public List<List<Integer>> largeGroupPositions(String S) {
        // Write your code here
        List<List<Integer>> res = new ArrayList<>();
        if (S.length() < 3)
            return res;
        char[] arr = S.toCharArray();
        char cur = arr[0];
        int s = 0;
        int len = 1;
        for (int i = 1; i < arr.length; i++) {
            if (cur == arr[i])
            {
                len++;
            }
            else
            {
                if (len > 2){
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(s);
                    tmp.add(i - 1);
                    res.add(tmp);
                }
                cur = arr[i];
                s = i;
                len = 1;
            }
        }
        if (len > 2)
        {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(s);
            tmp.add(arr.length - 1);
            res.add(tmp);
        }
        return res;
    }
}
