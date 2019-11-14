package S1201TO1400;

import java.util.stream.Stream;

public class S1340 {
    public int addCharacter(String str) {
        // Write your code here.
        int result = 2 - str.length();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != 'a')
                result += 3;
        }
        return result;
    }
}
