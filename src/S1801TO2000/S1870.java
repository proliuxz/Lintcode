package S1801TO2000;

public class S1870 {
    public int stringCount(String str) {
        int res = 0;
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0')
                res += ++cnt;
            else
                cnt = 0;
        }
        return res;
    }
}
