package S401TO600;

public class S420 {
    public String countAndSay(int n) {
        // write your code here
        String res = "1";
        while (n-- > 1)
            res = helper(res);
        return res;
    }

    public String helper(String last)
    {
        StringBuilder sb = new StringBuilder();
        char[] arr = last.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int cnt = 1;
            while (i < arr.length - 1 && c == arr[i+1]) {
                cnt++;
                i++;
            }
            sb.append(cnt);
            sb.append(c);
        }
        return sb.toString();
    }
}
