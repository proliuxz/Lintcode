package S801TO1000;

import java.util.ArrayList;
import java.util.List;

public class S956 {
    public String[] dataSegmentation(String str) {
        // Write your code here
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                if(sb.length() != 0) {
                    res.add(sb.toString());
                }
                sb = new StringBuilder();
                continue;
            }

            else if (str.charAt(i) < 'a' || str.charAt(i) > 'z') {
                if(sb.length() != 0) {
                    res.add(sb.toString());
                }
                sb = new StringBuilder();
                sb.append(str.charAt(i));
                res.add(sb.toString());
                sb = new StringBuilder();
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        if(sb.length() != 0) {
            res.add(sb.toString());
        }
        return res.toArray(new String[res.size()]);
    }
}
