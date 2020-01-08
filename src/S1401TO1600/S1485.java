package S1401TO1600;

public class S1485 {
    public char holyGrailspell(String Spell) {
        int[] letter = new int[26];
        char res = 'A';
        for (char c: Spell.toCharArray()) {
            if (Character.isLowerCase(c))
            {
                if (letter[c-'a'] == 0)
                    letter[c-'a']--;
                else if (letter[c-'a'] > 0)
                {
                    char x = Character.toUpperCase(c);
                    if (x - res > 0)
                        res = x;
                }
            }
            else
            {
                if (letter[c-'A'] == 0)
                    letter[c-'A']++;
                else if (letter[c-'A'] < 0)
                {
                    if (c - res > 0)
                        res = c;
                }
            }
        }
        return res;
    }
}
