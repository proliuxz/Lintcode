package S1201TO1400;

public class S1218 {
    public int findComplement(int num) {
        // Write your code here
        String s = Integer.toBinaryString(num);
        int result = 0;
        for (char c: s.toCharArray()
             ) {
            result *= 2;
            if (c == '0')
                result += 1;
        }
        return result;
    }
}
