package S1601TO1800;

public class S1725 {
    public String ReverseOnlyLetters(String S) {
        // write your code here
        if (S == null)
            return null;
        if (S.length() == 0)
            return new String();

        int l = 0;
        int len = S.length();
        int r = len - 1;
        char[] sChar = S.toCharArray();
        while (l < r)
        {
            if (!Character.isAlphabetic(sChar[l]))
                l++;
            else if (!Character.isAlphabetic(sChar[r]))
                r--;
            else
            {
                char tmp = sChar[l];
                sChar[l] = sChar[r];
                sChar[r] = tmp;
                l++;
                r--;
            }
        }
        return new String(sChar);
    }
}
