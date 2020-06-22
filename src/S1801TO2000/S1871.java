package S1801TO2000;

public class S1871 {
    public String MaximumMoment(String time) {
        String[] tt = time.split(":");
        char[] h = tt[0].toCharArray();
        char[] m = tt[1].toCharArray();
        if (h[0] == '?')
            h[0] = ((h[1] <= '3' || h[1] == '?') ? '2' : '1');
        if (h[1] == '?')
            h[1] = (h[0] == '2' ? '3' : '9');

        if (m[0] == '?')
            m[0] = '5';
        if (m[1] == '?')
            m[1] = '9';
        return new String(h)+":"+new String(m);
    }
}
