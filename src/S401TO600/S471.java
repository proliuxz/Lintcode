package S401TO600;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class WordPair {
    public WordPair(String t, int f)
    {
        this.text = t;
        this.freq = f;
    }

    public String text;
    public int freq;
}

public class S471 {
    public String[] topKFrequentWords(String[] words, int k) {
        String[] res = new String[k];
        if (words == null || words.length == 0)
            return res;
        HashMap<String, Integer> map = new HashMap<>();
        for (String word: words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        Set<WordPair> set = new TreeSet<>((WordPair w1,WordPair w2) ->
                (w2.freq - w1.freq == 0 ? w1.text.compareTo(w2.text) : w2.freq - w1.freq));

        for (String key: map.keySet()) {
            int val = map.get(key);
            set.add(new WordPair(key, val));
        }
        WordPair[] wordPairs = set.toArray(new WordPair[0]);
        for (int i = 0; i < k; i++) {
            res[i] = wordPairs[i].text;
        }
        return res;
    }
}
