package S1201TO1400;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S1380 {
    public String[] logSort(String[] logs) {
        // Write your code here
        List<String> list = new ArrayList<>();
        String[] ans = new String[logs.length];
        int idx = logs.length - 1;

        for (int i = logs.length - 1; i >= 0; i--) {
            int tmp = logs[i].indexOf(' ');
            String body = logs[i].substring(tmp + 1);

            if (Character.isDigit(body.trim().charAt(0))) {
                ans[idx--] = logs[i];   //number
            } else {
                list.add(logs[i]);      //letter
            }
        }
        Collections.sort(list, (String s1, String s2) -> {
            int t1 = s1.indexOf(' ');
            int t2 = s2.indexOf(' ');
            String ID1 = s1.substring(0, t1);
            String ID2 = s2.substring(0, t2);
            String body1 = s1.substring(t1);
            String body2 = s2.substring(t2);
            if (body1.equals(body2)) {
                return ID1.compareTo(ID2);
            } else {
                return body1.compareTo(body2);
            }
        });

        idx = 0;
        for (String item : list) {
            ans[idx++] = item;
        }
        return ans;
    }
}
