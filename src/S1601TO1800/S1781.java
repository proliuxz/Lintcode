package S1601TO1800;

public class S1781 {
    public String reverseAsciiEncodedString(String encodeString) {
        // Write your code here
        if (encodeString == null || encodeString.length() == 0)
            return new String();
        String result = "";
        int len = encodeString.length();
        for (int i = 0; i < len / 2 ; i++) {
            String s = encodeString.substring(len - 2 * i - 2, len - 2 * i);
            result += (char) ('A' + Integer.parseInt(s) - 65);
        }
        return result;
    }

    public static void main(String[] args)
    {
        S1781 s = new S1781();
        String encodeString = "7976766972";
        String es = s.reverseAsciiEncodedString(encodeString);
        System.out.println(es);
    }
}
