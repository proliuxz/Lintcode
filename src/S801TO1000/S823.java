package S801TO1000;

public class S823 {
    public String inputStream(String inputA, String inputB) {
        // Write your code here
        String a = getString(inputA);
        String b = getString(inputB);
        return a.equals(b) ? "YES" : "NO";
    }

    private String getString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c: chars
             ) {
            if (c != '<')
                sb.append(c);
            else
            {
                int len = sb.length();
                if (len != 0)
                    sb.delete(len - 1,len);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        S823 s = new S823();
        System.out.println(s.inputStream("abcde<<", "abcd<e<"));
    }
}
