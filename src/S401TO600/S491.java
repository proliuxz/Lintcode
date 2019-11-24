package S401TO600;

public class S491 {
    public boolean isPalindrome(int num) {
        // write your code here
        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }

    public static void main(String[] args)
    {
        S491 s = new S491();
        boolean res = s.isPalindrome(11);
        System.out.println(res);
    }
}
