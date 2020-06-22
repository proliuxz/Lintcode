package S1601TO1800;

public class S1730 {
    public String convert(long index) {
        index--;
        StringBuilder sb = new StringBuilder();
        long num = index / 702 + 1;
        sb.append(num);
        int alpha = (int) (index % 702);
        if (alpha / 26 > 0)
            sb.append((char)('A' + alpha / 26 - 1));
        sb.append((char)('A' + alpha % 26));
        return sb.toString();
    }
}
