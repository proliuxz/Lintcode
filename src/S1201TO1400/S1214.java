package S1201TO1400;

public class S1214 {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        char[] chars = S.toCharArray();
        int cnt = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '-')
                continue;
            if (K == cnt)
            {
                cnt = 0;
                sb.append("-");
            }
            sb.append(Character.toUpperCase(chars[i]));
            cnt++;
        }
        return sb.reverse().toString();
    }
}
