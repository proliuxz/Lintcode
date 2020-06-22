package S1401TO1600;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S1587 {
    public List<List<String>> StringSeg(char[] str) {
        List<List<String>> res = new ArrayList<>();
        for (String s : String.valueOf(str).substring(2).split(new String("\\" + str[0]))) {
            String[] ss = s.split(new String("\\" + str[0]));
            if (ss.length == 2 && !ss[0].isEmpty() && !ss[1].isEmpty())
                res.add(Arrays.asList(ss));
        }
        return res;
    }
}
