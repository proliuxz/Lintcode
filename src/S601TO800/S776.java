package S601TO800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S776 {
    int len;
    public List<String> findStrobogrammatic(int n) {
        len = n;
        return helper(n);
    }

    private List<String> helper(int n) {
        String[] singleNum = new String[]{"0", "1", "8"};
        String[][] matchedNum = new String[][]{{"0", "0"}, {"1", "1"}, {"6", "9"}, {"8", "8"}, {"9", "6"}};
        if (n == 0)
            return Arrays.asList(new String[]{""});
        if (n == 1)
            return Arrays.asList(singleNum);
        List<String> res = new ArrayList<>();
        List<String> pre = helper(n - 2);
        for (String p: pre) {
            if (n != len)
                res.add(matchedNum[0][0] + p + matchedNum[0][1]);
            for (int i = 1; i < matchedNum.length; i++)
                res.add(matchedNum[i][0] + p + matchedNum[i][1]);
        }
        return res;
    }
}
