package S601TO800;

public class S719 {
    public int calcMaxValue(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            res = num < 2 || res < 2 ? res + num : res * num;
        }
        return res;
    }
}
