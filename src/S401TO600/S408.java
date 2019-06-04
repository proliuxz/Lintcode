package S401TO600;

public class S408 {
    public String addBinary(String a, String b) {
        // write your code here
        int len = Math.max(a.length(), b.length());
        while (a.length() < len)
            a = "0" + a;
        while (b.length() < len)
            b = "0" + b;
        int carry = 0;
        String res = new String();
        for (int i = len - 1; i >= 0 ; i--) {
            int ai = a.charAt(i) - '0';
            int bi = b.charAt(i) - '0';
            res = (ai + bi + carry) % 2 + res;
            carry = (ai + bi + carry) / 2;
        }
        if (carry == 1)
            res = "1" + res;
        return res;
    }

    public static void main(String[] args)
    {
        S408 s = new S408();
        System.out.println(s.addBinary("0", "0"));
    }
}
