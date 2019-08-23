package S1001TO1200;

import java.util.HashSet;

public class S1013 {
    public int uniqueMorseRepresentations(String[] words) {
        // Write your code here
        String[] MorseCode = {".-","-...","-.-.","-..",".",
                "..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",
                ".--.","--.-",".-.","...","-",
                "..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> set = new HashSet<>();
        for (String word: words
             ) {
            StringBuilder sb = new StringBuilder();
            for (char c: word.toCharArray()
                 ) {
                sb.append(MorseCode[c-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
