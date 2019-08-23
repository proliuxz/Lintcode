package S1601TO1800;

public class S1633 {
    boolean check(String a, String b) {
        int len1 = a.length();
        int len2 = b.length(), i, j;
        int id = 0;
        for (i = 0; i < len2; i++) {
            if (b.charAt(i) == a.charAt(id)) {
                id++;
                if (id == len1) {
                    return true;
                }
            }
        }
        return false;
    }

    public String[] getAns(String target, String[] s) {
        // Write your code here
        String[] ans;
        boolean[] vis;
        vis = new boolean[s.length];
        int i, cnt = 0;
        for (i = 0; i < s.length; i++) {
            vis[i] = false;
            if (check(target, s[i]) == true) {
                vis[i] = true;
                cnt++;
            }
        }
        ans = new String[cnt];
        cnt = 0;
        for (i = 0; i < s.length; i++) {
            if (vis[i] == true) {
                ans[cnt] = s[i];
                cnt++;
            }
        }
        return ans;
    }
}
