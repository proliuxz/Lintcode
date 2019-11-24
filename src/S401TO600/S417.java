package S401TO600;

public class S417 {
    public boolean isNumber(String s) {
        // write your code here
        int i = 0;
        s = s.trim() + " "; // why +" "?
        char[] sc = s.toCharArray();
        int len = s.length() - 1;

        if (sc[i] == '+' || sc[i] == '-')
            i++;

        int nDigit = 0;
        int nPoint = 0;

        while (Character.isDigit(sc[i]) || sc[i] == '.') {
            if (Character.isDigit(sc[i]))
                nDigit++;
            if (sc[i] == '.')
                nPoint++;
            i++;
        }
        if (nDigit <= 0 || nPoint > 1)
            return false;

        if (sc[i] == 'e') {
            i++;
            if (sc[i] == '+' || sc[i] == '-')
                i++;

            if (i == len)
                return false;

            for (; i < len; i++)
                if (!Character.isDigit(sc[i]))
                    return false;
        }
        return i == len;
    }
}
