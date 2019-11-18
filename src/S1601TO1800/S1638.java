package S1601TO1800;

public class S1638 {
    public int getAns(String s, int k) {
        // Write your code here
        int result = 1;
        int cnt = 1;
        char cur = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (cnt < k && s.charAt(i) == cur) {
                cnt++;
            }
            else {
                cnt = 1;
                result++;
            }
            cur = s.charAt(i);
        }
        return result;
    }
}
