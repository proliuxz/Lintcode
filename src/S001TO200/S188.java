package S001TO200;

public class S188 {
    public int InsertFive(int a) {
        String s = String.valueOf(a);
        StringBuilder sb = new StringBuilder();
        boolean inserted = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (a >= 0 && !inserted && c - '0' <= 5) {
                sb.append("5");
                i--;
                inserted = true;
            } else if (a < 0 && c != '-' && !inserted && c - '0' >= 5) {
                sb.append("5");
                i--;
                inserted = true;
            } else
                sb.append(c);
        }
        return Integer.valueOf(sb.toString());
    }
}
