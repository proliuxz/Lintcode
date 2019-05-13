package S001TO200;

public class S082 {
    public int singleNumber(int[] A) {
        // write your code here
        int res = 0;
        for (int num : A)
            res ^= num;
        return res;
    }
}
