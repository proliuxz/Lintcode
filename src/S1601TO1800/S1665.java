package S1601TO1800;

public class S1665 {
    public int[] calculateNumber(int num) {
        String s = Integer.toBinaryString(num);
        int count = 0;
        int r = 1;
        for (int i = 0; i < s.length(); i++ )
            if (s.charAt(i) == '1')
                count++;

        int[] res = new int[count+1];
        res[0] = count;
        for (int i = 0; i < s.length(); i++ )
            if (s.charAt(i) == '1')
                res[r++] = i + 1;
        return res;
    }
}
