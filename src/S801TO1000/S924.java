package S801TO1000;

public class S924 {
    public int shortestDistance(String[] words, String word1, String word2) {
        int lastWord1 = -1;
        int lastWord2 = -1;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.equals(word1)) {
                lastWord1 = i;
                if (lastWord2 == -1)
                    continue;
                res = Math.min(res, Math.abs(lastWord1 - lastWord2));
            }

            else if (word.equals(word2)) {
                lastWord2 = i;
                if (lastWord1 == -1)
                    continue;
                res = Math.min(res, Math.abs(lastWord1 - lastWord2));
            }
        }
        return res;
    }
}
