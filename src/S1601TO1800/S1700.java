package S1601TO1800;

public class S1700 {
    public int[] diStringMatch(String S) {
        int len = S.length() + 1;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = i;
        }
        for (int i = 0; i < S.length(); i++) {
             if(S.charAt(i) == 'D')
             {
                 int tmp = res[i];
                 res[i] = res[i + 1];
                 res[i + 1] = tmp;
             }
        }
        return res;
    }
}
