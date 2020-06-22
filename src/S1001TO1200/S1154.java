package S1001TO1200;

public class S1154 {
    public boolean judge(String record) {
        int lCnt = 0;
        int dCnt = 0;
        for (char c: record.toCharArray()) {
            switch (c)
            {
                case 'D':{
                    if (dCnt > 0)
                        return true;
                    dCnt++;
                    lCnt = 0;
                    break;
                }
                case 'L':{
                    if (lCnt > 1)
                        return true;
                    lCnt++;
                    break;
                }
                case 'A':{
                    lCnt = 0;
                    break;
                }
            }
        }
        return false;
    }
}
