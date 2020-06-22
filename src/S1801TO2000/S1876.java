package S1801TO2000;

public class S1876 {
    public boolean isAlienSorted(String[] words, String order) {
        int[] dic = new int[26];
        char[] odr = order.toCharArray();
        for (int i = 0; i < odr.length; i++)
            dic[odr[i] - 'a'] = i;
        for (int i = 0; i < words.length - 1; i++)
            if (!compare(words[i], words[i + 1], dic))
                return false;
        return true;
    }

    private boolean compare(String word1, String word2, int[] orders) {
        for (int j = 0; j < Math.min(word1.length(), word2.length()); j++) {
            if (word1.charAt(j) != word2.charAt(j)) {
                return orders[word1.charAt(j) - 'a'] <= orders[word2.charAt(j) - 'a'];
            }
        }
        return word1.length() <= word2.length();
    }
}
