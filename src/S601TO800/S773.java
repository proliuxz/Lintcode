package S601TO800;

public class S773 {
    public boolean isAnagram(String s, String t) {
        // write your code here
        int[] alphabets = new int[26];
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            alphabets[s.charAt(i) - 'a']++;
            alphabets[t.charAt(i) - 'a']--;
        }
        for (int alphabet: alphabets
             ) {
            if (alphabet != 0)
                return false;
        }
        return true;
    }
}
