package S801TO1000;

public class S807 {
    public boolean isPalindrome(int n) {
        // Write your code here
        char[] chars = Integer.toBinaryString(n).toCharArray();
        int len = chars.length;
        for (int i = 0; i < len / 2 ; i++) {
            if (chars[i] != chars[len - 1 - i])
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        S807 s = new S807();
        System.out.println(s.isPalindrome(9));
    }
}
