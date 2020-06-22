package S1201TO1400;

import java.util.*;

public class S1369 {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();
        String[] words = paragraph.replaceAll ("\\pP", " ").toLowerCase().split ("\\s+");
        Arrays.stream(words).filter(word -> !ban.contains(word)).forEach(word -> map.put(word, map.getOrDefault(word, 0) + 1));
        return Collections.max (map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
