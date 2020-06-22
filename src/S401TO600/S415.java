package S401TO600;

public class S415 {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l <= r)
        {
            char cl = s.charAt(l);
            char cr = s.charAt(r);
            if (!Character.isDigit(cl) && !Character.isAlphabetic(cl))
            {
                l++;
                continue;
            }
            if (!Character.isDigit(cr) && !Character.isAlphabetic(cr))
            {
                r--;
                continue;
            }
            if (Character.toLowerCase(cl) != Character.toLowerCase(cr) )
                return false;
            l++;
            r--;
        }
        return true;
    }
}
