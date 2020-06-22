package S801TO1000;

import java.util.*;

public class S856 {
    public boolean isSentenceSimilarity(String[] words1, String[] words2, List<List<String>> pairs) {
        if (words1.length != words2.length) return false;
        Map<String, Set<String>> dic = new HashMap<>();
        for (int i = 0; i < pairs.size(); i++) {
            List<String> pair = pairs.get(i);
            Set set = dic.getOrDefault(pair.get(0), new HashSet<>());
            set.add(pair.get(1));
            dic.put(pair.get(0), set);
        }
        for (int i = 0; i < words1.length; i++) {
            if (words1[i].equals(words2[i]))
                continue;
            if ((!dic.containsKey(words1[i]) || !dic.get(words1[i]).contains(words2[i])) &&
                    (!dic.containsKey(words2[i]) || !dic.get(words2[i]).contains(words1[i])))
                return false;
        }
        return true;
    }
}
