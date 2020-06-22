package S1801TO2000;

public class S1821 {
    public int minDeletionsToObtainStringInRightFormat(String s) {
        int n = s.length();
        int aCnt = 0;
        int bCnt = 0;
        for(int i = 0; i < n; i++)
            if(s.charAt(i) == 'A')
                aCnt++;

        int res = aCnt;

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == 'A')
                aCnt--;
            else
                bCnt++;
            res = Math.min(res, aCnt + bCnt);
        }
        return res;
    }
}
