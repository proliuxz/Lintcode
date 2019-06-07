package S1601TO1800;

public class S1790 {
    public String RotateString2(String str, int left, int right) {
        // write your code here
        if (str == null || str.length() == 0)
            return str;
        int len = str.length();
        int offset = (left - right) % len;
        if (offset < 0)
            offset += len;
        str += str;
        str = str.substring(offset, offset + len);
        return str;
    }
}
