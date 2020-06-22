package S801TO1000;

public class S936 {
    public String capitalizesFirst(String s) {
        if (s == null || s.length() == 0)
            return new String();

        char[] sChar = s.toLowerCase().toCharArray();
        if (sChar[0] >= 'a' && sChar[0] <= 'z')
            sChar[0] = Character.toUpperCase(sChar[0]);

        for (int i = 1; i < s.length(); i++)
            if (sChar[i - 1] == ' ' && sChar[i] != ' ')
                sChar[i] = Character.toUpperCase(sChar[i]);

        return new String(sChar);
    }
}
