package S1201TO1400;

public class S1327 {
    public String deleteString(String str) {
        // Write your code here.
        int result = str.length() - 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i+1))
            {
                result = i;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, result));
        sb.append(str.substring(result + 1));
        return sb.toString();
    }
}
