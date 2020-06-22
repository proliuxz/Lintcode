package S1601TO1800;

public class S1721 {
    public int minAddToMakeValid(String S) {
        int left = 0;
        int right = 0;
        for (char c : S.toCharArray()) {
            if (right == 0 && c == ')')
                left++;
            else
                right += (c == '(' ? 1 : -1);
        }
        return left + right;
    }
}
