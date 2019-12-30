package S1201TO1400;

public class S1398 {
    public String addition(int k, String a, String b) {
        // Write your code here
        int i, j, temp = 0;
        for (i = 0; i < a.length(); i++) {
            if (a.charAt(i) != '0')
                break;
        }

        a = a.substring(i);
        for (i = 0; i < b.length(); i++) {
            if (b.charAt(i) != '0')
                break;
        }

        b = b.substring(i);
        if (a.length() < b.length()) {
            String t = a;
            a = b;
            b = t;
        }
        StringBuffer c = new StringBuffer(a);
        j = b.length() - 1;
        for (i = a.length() - 1; i >= 0; i--) {
            int sum = a.charAt(i) - '0';
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            if (temp != 0) {
                sum += temp;
            }
            c.setCharAt(i, (char) (sum % k + '0'));
            temp = sum / k;
        }
        StringBuffer ans = new StringBuffer();
        if (temp != 0) {
            ans.insert(0, (char) ('0' + temp));
        }
        ans.append(c);
        return ans.toString();
    }
}
