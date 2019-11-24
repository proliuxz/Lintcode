package S1401TO1600;

import java.util.ArrayList;
import java.util.List;

public class S1401 {
    public int[][] twitchWords(String str) {
        // Write your code here
        List<int[]> res = new ArrayList<>();
        char c = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == c)
            {
                count++;
            }
            else {
                if (count > 2)
                    res.add(new int[]{i - count, i - 1});
                count = 1;
                c = str.charAt(i);
            }
        }
        if (count > 2)
            res.add(new int[]{str.length() - count, str.length() - 1});
        return res.toArray(new int[0][0]);
    }
}
