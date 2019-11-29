package S401TO600;

public class S524 {
    static public String leftPad(String originalStr, int size) {
        // Write your code here
        return leftPad(originalStr, size, ' ');
    }

    static public String leftPad(String originalStr, int size, char padChar) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        int len = originalStr.length();
        int appSize = size - len;
        while (appSize > 0)
        {
            sb.append(padChar);
            appSize--;
        }
        sb.append(originalStr);
        return sb.toString();
    }
}
