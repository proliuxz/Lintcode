package S1801TO2000;

import java.util.HashSet;
import java.util.Set;

public class S1905 {
    public String CharacterDeletion(String str, String sub) {
        Set<Character> set = new HashSet<>();
        for (char c: sub.toCharArray())
            set.add(c);

        StringBuilder sb =new StringBuilder();
        for (char c: str.toCharArray()) {
            if (!set.contains(c))
                sb.append(c);
        }
        return sb.toString();
    }
}
