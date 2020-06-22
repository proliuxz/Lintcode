package S801TO1000;

public class S973 {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        if (len == 1)
            return bits[0] == 0;
        if (bits[len - 2] != 0)
            return false;
        return true;
    }
}
