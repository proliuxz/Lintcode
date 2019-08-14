package S1201TO1400;

public class S1348 {
    public int titleToNumber(String s) {
        // write your code here
        int res = 0;
        for (char c: s.toCharArray()
             ) {
            res = res * 26 + c - 'A' + 1;
        }
        return res;
    }
}
