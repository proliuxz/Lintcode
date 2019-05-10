public class S053 {
    public String reverseWords(String s) {
        // write your code here
        if (s == null)
            return null;
        if (s.length() == 0)
            return new String();
        s = s.replaceAll("\\s{1,}", " ");
        String[] words = s.split(" ");
        for (int i = 0; i < words.length >> 1; i++) {
            String tmp = words[i];
            words[i] = words[words.length - i -1];
            words[words.length - i -1] = tmp;
        }
        return String.join(" ",words);
    }
}
