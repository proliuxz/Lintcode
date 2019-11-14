package S601TO800;

import java.util.HashSet;
import java.util.Set;

public class S702 {
    public String concatenetedString(String s1, String s2) {
        // write your code here
        Set<Character> set = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for(int i = 0; i < s2.length(); i++)
            if(!set.contains(s2.charAt(i)))
                set.add(s2.charAt(i));

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s1.length(); i++){
            if(!set.contains(s1.charAt(i)))
                sb.append(s1.charAt(i));
            else if(!set2.contains(s1.charAt(i)))
                set2.add(s1.charAt(i));
        }

        for(int i = 0; i < s2.length(); i++)
            if(!set2.contains(s2.charAt(i)))
                sb.append(s2.charAt(i));

        return sb.toString();
    }
}
