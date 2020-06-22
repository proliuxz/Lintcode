package S1001TO1200;

public class S1178 {
    public boolean checkRecord(String s) {
        boolean hasA = false;
        int lCnt = 0;
        char[] chars = s.toCharArray();
        for (char c: chars) {
            switch (c)
            {
                case 'A':
                {
                    if (hasA)
                        return false;
                    hasA = true;
                    lCnt = 0;
                    continue;
                }
                case 'L':
                {
                    if (lCnt == 2)
                        return false;
                    lCnt++;
                    continue;
                }
                case 'P':
                {
                    lCnt = 0;
                    continue;
                }
            }
        }
        return true;
    }
}
