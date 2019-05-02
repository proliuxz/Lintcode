import java.util.HashSet;

public class S157 {
    public boolean isUnique(String str) {
        // write your code here
        HashSet<Character> set = new HashSet<>();
        char[] schar = str.toCharArray();
        for (char c : schar)
        {
            if (!set.add(c))
                return false;
        }
        return true;
    }
}
