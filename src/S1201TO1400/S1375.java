package S1201TO1400;

public class S1375 {
    public long kDistinctCharacters(String s, int k) {
        // Write your code here
        long res = 0;
        if (s == null || s.length() == 0 || k > s.length())
            return res;

        int[] dic = new int[26];
        int numberOfChar = 0;
        int len = s.length();
        int l = 0;
        int r = 0;
        while ( l < len && l <= r)
        {
            while (r < len && numberOfChar < k)
            {
                int idx = s.charAt(r) - 'a';
                if (dic[idx] == 0)
                    numberOfChar++;
                dic[idx]++;
                r++;
            }

            if (numberOfChar == k) {
                res += len - r + 1;
            }
            int idx = s.charAt(l) - 'a';
            dic[idx]--;
            if (dic[idx] == 0) {
                numberOfChar--;
            }
            l++;
        }
        return res;
    }
}
