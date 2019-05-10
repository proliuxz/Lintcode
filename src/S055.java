import java.util.HashSet;
import java.util.Set;

public class S055 {
    public boolean compareStrings(String A, String B) {
        // write your code here
        Set<Character> set = new HashSet<>();
        for (char c: A.toCharArray()
             ) {
            set.add(c);
        }

        for (char c: B.toCharArray()
             ) {
            if(!set.contains(c))
                return false;
        }
        return true;
    }
}
