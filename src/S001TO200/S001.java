package S001TO200;

public class S001 {
    public int aplusb(int a, int b) {
        // write your code here
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        int sum, carry;
        sum = a ^ b;
        carry = (a & b) << 1;
        return aplusb(sum, carry);
    }
}
