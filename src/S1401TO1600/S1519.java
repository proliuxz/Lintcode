package S1401TO1600;

public class S1519 {
    public char[] timeMagic(char[] newTime) {
        //
        char[] res = newTime;
        if (res[0] == '?')
            res[0] =  (res[1] < 52 || res[1] == 63) ? '2' : '1';
        if (res[1] == '?')
            res[1] = res[0] == '2' ? '3' : '9';
        if (res[3] == '?')
            res[3] = '5';
        if (res[4] == '?')
            res[4] = '9';
        return res;
    }
}
