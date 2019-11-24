package S1401TO1600;

public class S1459 {
    public int judgeTheLastNumber(String str) {
        // Write your code here
        int n = str.length(), cnt = 0;
        for (int i = 0; i < n; i++) {
            if(str.charAt(i) == '0')
                cnt = 1;
            else if(str.charAt(i) == '1') {
                i++;
                cnt = 2;
            }
        }
        return cnt;
    }
}
