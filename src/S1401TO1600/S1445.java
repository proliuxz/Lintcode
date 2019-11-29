package S1401TO1600;

public class S1445 {
    public boolean canGetString(String s, String t) {
        // Write your code here
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        int ss = sChar.length;
        int tt = 0;
        for (int i = 0; i < ss; i++) {
            if (sChar[i] == tChar[tt])
                tt++;
            if (tt == t.length())
                return true;
        }
        return false;
    }
}
