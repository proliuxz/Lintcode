package S201TO400;

public class S213 {
    public String compress(String originalString) {
        // write your code here
        if (originalString == null || originalString.length() == 0)
            return new String();
        StringBuilder sb = new StringBuilder();
        char[] arr = originalString.toCharArray();
        char cur = arr[0];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == cur)
            {
                cnt++;
            }
            else
            {
                sb.append(cur);
                if (cnt > 1)
                    sb.append(cnt);
                cur = arr[i];
                cnt = 1;
            }
        }
        if (cnt != 0)
        {
            sb.append(cur);
            sb.append(cnt);
        }
        String result = sb.toString();
        return result.length() < originalString.length() ? result : originalString;
    }
}
