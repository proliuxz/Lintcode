package S1801TO2000;

public class S1820 {
    public char findLetter(String str) {
        int[][] dic = new int[26][2];
        for (char c: str.toCharArray()) {
            int col = 0;
            if (c >= 'A' && c <= 'Z')
            {
                col = 1;
                c = Character.toLowerCase(c);
            }
            dic[c-'a'][col]++;
        }

        for (int i = 25; i >= 0 ; i--) {
            if (dic[i][0] > 0 && dic[i][1] > 0)
                return (char) (i + 'A');
        }
        return '~';
    }
}
