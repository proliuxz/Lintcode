package S1401TO1600;

import java.util.Queue;

public class S1425 {
    public boolean backspaceCompare(String S, String T) {
        String ss = helper(S);
        String tt = helper(T);
        return ss.equals(tt);
    }

    private String helper(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '#')
            {
                if (sb.length() > 0)
                    sb.deleteCharAt(sb.length() - 1);
            }
            else
                sb.append(c);
        }
        return sb.toString();
    }
}