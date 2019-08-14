package S1001TO1200;

public class S1089 {
    public boolean checkValidString(String s) {
        // Write your code here
        int l = 0;
        int r = 0;
        for (char c: s.toCharArray()) {
            l = l + (c == '(' ? 1 : -1);
            r = r + (c != ')' ? 1 : -1);
            if (r < 0)
                break;
            l = Math.max(l, 0);
        }
        return l == 0;
    }
}
