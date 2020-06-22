package S801TO1000;

public class S891 {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                break;
            left++;
            right--;
        }
        if (left >= right)
            return true;
        return isSubPalindrome(s.substring(left,right)) || isSubPalindrome(s.substring(left + 1, right + 1));
    }

    private boolean isSubPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
