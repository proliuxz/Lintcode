package S1001TO1200;

public class S1017 {
    public String similarRGB(String color) {
        StringBuilder sb = new StringBuilder(color.length());
        sb.append("#");
        for (int i = 1; i < color.length(); i += 2){
            char c = getHexDigits(color.charAt(i), color.charAt(i + 1));
            sb.append(c);
            sb.append(c);
        }
        return sb.toString();
    }

    private char getHexDigits(char c1, char c2){
        int d1 = Character.isDigit(c1)? c1 - '0': 10 + c1 - 'a';
        int d2 = Character.isDigit(c2)? c2 - '0': 10 + c2 - 'a';

        int sum       = d1 * 16 + d2;
        int index     = sum / 17;
        int remainder = sum % 17;
        if (remainder > 17 >> 1)
            index++;

        char c = 0 <= index && index <= 9 ? (char)('0' + index): (char)('a' + index - 10);
        return c;
    }
}
